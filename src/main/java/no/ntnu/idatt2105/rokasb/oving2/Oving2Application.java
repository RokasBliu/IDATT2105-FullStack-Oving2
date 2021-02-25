package no.ntnu.idatt2105.rokasb.oving2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "no.ntnu.idatt2105.rokasb.oving2.controller",
		"no.ntnu.idatt2105.rokasb.oving2.dao",
		"no.ntnu.idatt2105.rokasb.oving2.object",
		"no.ntnu.idatt2105.rokasb.oving2.repository",
		"no.ntnu.idatt2105.rokasb.oving2.service"})
public class Oving2Application {

	public static void main(String[] args) {
		SpringApplication.run(Oving2Application.class, args);
	}

}
