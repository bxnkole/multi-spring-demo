package com.banks.mutlidemo.sub2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Sub2Application {

	public static void main(String[] args) {
		SpringApplication.run(Sub2Application.class, args);
	}

	@RestController
	class C2 {
		@GetMapping("c2")
		String get() {
			return "c2";
		}
	}
}
