package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.controller.VilleController;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Application demaree");
		
		
		VilleController villeControler = new VilleController();
		String codePostal = "codePostal";
		villeControler.appelGet(codePostal);
	}
}
