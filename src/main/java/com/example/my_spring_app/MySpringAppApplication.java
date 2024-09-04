package com.example.my_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MySpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringAppApplication.class, args);
	}

}

@RestController
@RequestMapping("/")
class HelloController {
	@GetMapping
	public String sayHello() {
		return "Hola Profesor buenas noches o tardes," +
				"perdone que me haya tardado tanto en este código pero tuve inconvenientes";
	}
}