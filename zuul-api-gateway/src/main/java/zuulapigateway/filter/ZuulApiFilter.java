package zuulapigateway.filter;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulApiFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {

		System.out.println("Zull Filter called");
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}
}