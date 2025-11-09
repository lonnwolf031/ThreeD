package lonnwolf.threed.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.WebApplicationType;

@SpringBootApplication(scanBasePackages = "lonnwolf.threed")
public class ThreeD {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ThreeD.class)
				.headless(false)
				.web(WebApplicationType.NONE)
				.run(args);
	}
}