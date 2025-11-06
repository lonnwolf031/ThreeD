package lonnwolf.threed.application;

import lonnwolf.threed.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "lonnwolf.threed")
@RestController
public class ThreedApplication {

	private final MyService myService;

	public ThreedApplication(MyService myService) {
		this.myService = myService;
	}

	@GetMapping("/")
	public String home() {
		return myService.message();
	}

	public static void main(String[] args) {
		SpringApplication.run(ThreedApplication.class, args);
	}
}