package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@FunctionalInterface
interface Validation {
	boolean validate(String input);
	 static void  printResult(String input,String function, Validation fobj) {
			
			System.out.println("Result of "+function+" is "+fobj.validate(input));
		 }
}

public class UserRegistration {
	
	public static void main(String[] args) {
		
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter first Name:");
		
		
		//Validating first Name
		Validation firstname = s -> {
			Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
			Matcher matcher = pattern.matcher(s);
			return matcher.find();
		};
		
		String firstName = sc.next();
		Validation.printResult(firstName,"First Name validation", firstname);
		
		
	}

}
