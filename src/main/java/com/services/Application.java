package com.services;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public void greet() {
		List<String> list = new ArrayList<>();
		list.add("Hello");

		for (String strVal : list) {
			System.out.println("Greetings "+strVal);	
		}
	}

	public Application() {
		System.out.println("Application default Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Starting Application");
		Application application = new Application();	
		application.greet();	
	}	
}