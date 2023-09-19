package com.spring.springCore;

import com.spring.springCore.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.SpringCacheAnnotationParser;
@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);


		var context = SpringApplication.run(SpringCoreApplication.class);
		PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
		System.out.println(pizzaController.getPizza());

	}
}