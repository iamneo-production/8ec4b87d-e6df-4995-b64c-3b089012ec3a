package pl.piomin.microservices.edge;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayServiceApplication {

    public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}
}
