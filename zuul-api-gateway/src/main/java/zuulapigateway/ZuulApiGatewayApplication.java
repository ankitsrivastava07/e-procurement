package zuulapigateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.cloud.netflix.zuul.filters.post.LocationRewriteFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import zuulapigateway.filter.CustomErrorFilter;
import zuulapigateway.filter.CustomRouteLocator;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApiGatewayApplication {

	@Autowired
	protected ZuulProperties zuulProperties;

	@Autowired
	protected ServerProperties server;

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGatewayApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public CustomErrorFilter customeErrorFilterBean() {
		return new CustomErrorFilter();
	}

	@Bean
	public CustomRouteLocator customRouteLocator() {
		return new CustomRouteLocator(server.getServlet().getContextPath(), zuulProperties);
	}

	@Bean
	public LocationRewriteFilter locationRewriteFilter() {
		return new LocationRewriteFilter();
	}

}
