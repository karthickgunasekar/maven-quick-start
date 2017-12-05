package com.services;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Application {

	public int countWords(String words) {
		String []values = StringUtils.split(words,' ');
		return (values == null)? 0:values.length;
	}

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
		application.countWords("This is the count words");
	}	
}