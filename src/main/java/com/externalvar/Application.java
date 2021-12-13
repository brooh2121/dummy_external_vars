package com.externalvar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	Environment environment;


	@Override
	public void run(String... args) throws Exception {
		System.setProperty("selenide.browser", "Chrome");
			open(environment.getProperty("browser.url"));
		Thread.sleep(3000);
	}
}
