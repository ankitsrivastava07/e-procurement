package zuulapigateway.filter;

import org.springframework.cloud.netflix.zuul.filters.SimpleRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties.ZuulRoute;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerMapping;

import com.netflix.zuul.context.RequestContext;
public class CustomRouteLocator extends SimpleRouteLocator {
  
	public CustomRouteLocator(String servletPath, ZuulProperties properties) {
        super(servletPath, properties);
    }

    @Override
    protected ZuulRoute getZuulRoute(String adjustedPath) {
        // Spring's AbstractUrlHandlerMapping already found best matching path for us
        // and stored it into request attribute. See AbstractUrlHandlerMapping.exposePathWithinMapping
        RequestContext ctx = RequestContext.getCurrentContext();
        String bestMatchingPattern = (String)ctx.getRequest().getAttribute(HandlerMapping.class.getName() + ".bestMatchingPattern");
        if (bestMatchingPattern == null) {
            return super.getZuulRoute(adjustedPath);
        }

        if (!matchesIgnoredPatterns(adjustedPath)) {
            return locateRoutes().get(bestMatchingPattern);
        }
        return null;
    }
}