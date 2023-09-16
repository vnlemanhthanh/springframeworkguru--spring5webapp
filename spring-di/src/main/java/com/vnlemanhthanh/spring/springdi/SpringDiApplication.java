package com.vnlemanhthanh.spring.springdi;

import com.vnlemanhthanh.spring.springdi.controller.ConstructorInjectedController;
import com.vnlemanhthanh.spring.springdi.controller.MyController;
import com.vnlemanhthanh.spring.springdi.controller.PropertyInjectedController;
import com.vnlemanhthanh.spring.springdi.controller.SettetInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(SpringDiApplication.class, args);

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
