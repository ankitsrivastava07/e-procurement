package zuulapigateway.filter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class ZuulApiFilter extends ZuulFilter {

	private static Logger log = LoggerFactory.getLogger(Object.class);

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {

		/*
		 * RequestContext ctx = RequestContext.getCurrentContext();
		 * 
		 * HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		 * String token = request.getHeader("session_Token"); String requestUri =
		 * RequestContext.getCurrentContext().getRequest().getRequestURI(); TokenStatus
		 * tokenStatus = null;
		 * 
		 * Cookie cok[] = request.getCookies();
		 * 
		 * ApiGatewayResponse apiGateWayResponse = new ApiGatewayResponse();
		 * 
		 * if (!requestUri.equals("/users/login") && token != null) tokenStatus =
		 * restTemplate.postForObject(
		 * "http://localhost:8082/token-session/validate-token",
		 * "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIxIiwiaWF0IjoxNjIyMjg3NjkxLCJleHAiOjE2MjIyOTEyOTF9.UnplcfZJdYTbo36b_XWGYpYEcFNa--nRjkkhc79_1y88d3rRrh68A25bIRTKcskx9d2y4u_vUS5CmFsxIFGTEQ",
		 * TokenStatus.class); log.info(token, tokenStatus);
		 * 
		 * if (tokenStatus != null) {
		 * 
		 * apiGateWayResponse.setFirstName(tokenStatus.getFirstName());
		 * apiGateWayResponse.setStatus(tokenStatus.isStatus());
		 * apiGateWayResponse.setMessage(tokenStatus.getMessage());
		 * apiGateWayResponse.setCreatedAt(tokenStatus.getCreatedAt());
		 * ctx.setResponseBody("UnAuthorize"); ctx.setSendZuulResponse(false);
		 * ctx.removeRouteHost(); ctx.setResponseStatusCode(HttpStatus.SC_UNAUTHORIZED);
		 * apiGateWayResponse.setToken(tokenStatus.getToken()); }
		 */
		return null;
	}

	@Override
	public String filterType() {
		System.out.println("pre Filter called");
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}
}
