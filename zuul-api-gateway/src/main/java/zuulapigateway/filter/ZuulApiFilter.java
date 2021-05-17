package zuulapigateway.filter;


import javax.servlet.ServletInputStream;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.netflix.zuul.http.HttpServletRequestWrapper;
import com.netflix.zuul.http.ServletInputStreamWrapper;

public class ZuulApiFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {

		RequestContext context = RequestContext.getCurrentContext();
		context.addZuulRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		//String body = String.format("a=%s&b=%s", a, b);

		//final byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
		context.setRequest(new HttpServletRequestWrapper(context.getRequest()) {
			@Override
			public ServletInputStream getInputStream() {
				return new ServletInputStreamWrapper(null);
			}

			@Override
			public String getMethod() {
				return "POST";
			}
		});

		System.out.println("Zull Filter called");
		return null;
	}

	@Override
	public String filterType() {
		return "post";
	}

	@Override
	public int filterOrder() {
		return 0;
	}
}
