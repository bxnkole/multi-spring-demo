package com.banks.mutlidemo.sub1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.banks")
public class Sub1Application {

	public static void main(String[] args) {
		SpringApplication.run(Sub1Application.class, args);
	}

	@RestController
	class C1 {
		@GetMapping("c1")
		String get() {
			return "c1";
		}
	}
}
