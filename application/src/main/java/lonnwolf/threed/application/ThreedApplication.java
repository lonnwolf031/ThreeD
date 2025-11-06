package lonnwolf.threed.application;

import lonnwolf.threed.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(scanBasePackages = "lonnwolf.threed")
public class ThreedApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ThreedApplication.class)
				.headless(false)
				.web(WebApplicationType.NONE)
				.run(args);
	}
}