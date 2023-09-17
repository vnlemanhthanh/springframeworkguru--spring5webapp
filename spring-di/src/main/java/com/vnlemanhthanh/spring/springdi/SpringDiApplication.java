package com.vnlemanhthanh.spring.springdi;

import com.vnlemanhthanh.spring.springdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(SpringDiApplication.class, args);

		PetController petController = context.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

		System.out.println("______ Profile Default");
		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("______ Primary Bean");
		MyController myController = (MyController) context.getBean("myController");
		System.out.println( myController.sayHello());

		System.out.println("______ Property");
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("______ Setter");
		SettetInjectedController settetInjectedController =
				(SettetInjectedController) context.getBean("settetInjectedController");
		System.out.println(settetInjectedController.getGreeting());

		System.out.println("______ Constructor");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
