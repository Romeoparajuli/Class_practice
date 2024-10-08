package com.day6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(".s");
		Matcher matcher = pattern.matcher("ms");
		boolean b = matcher.matches();
		System.out.println(b);
		boolean b2 = Pattern.compile(".m").matcher("milan").matches();
		System.out.println(b2);
		boolean b3= Pattern.matches(".a", "mila");
		System.out.println(b3);
		
		System.out.println(Pattern.matches("[abcd]", "a"));
		System.out.println(Pattern.matches("[amn]", "a"));
		
		String emailRegex = "^[a-zA-Z0-9]+@[a-z]+\\.[a-z]{2,}$";
		System.out.println(Pattern.matches(emailRegex, "mailankit123@gmail.com"));
		System.out.println(Pattern.matches(emailRegex, "123125541gmail.com"));
		//String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		String dateRegex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d\\d\\b";
		System.out.println(Pattern.matches(dateRegex, "11/12/2023"));
		System.out.println(Pattern.matches(dateRegex, "1234567899841"));
		
		
		String phoneRegex = "(?:\\+977?)?[9][6-9]\\d{8}";
		System.out.println(Pattern.matches(phoneRegex, "9865321472"));
		System.out.println(Pattern.matches(phoneRegex, "123125541"));
		
		String urlRegex = "\\b(?:https?://|www\\.)\\S+\\b";
		System.out.println(Pattern.matches(urlRegex, "mailankit123@gmail.com"));
		System.out.println(Pattern.matches(urlRegex, "123125541gmail.com"));
		
		String passwordRegex = "^[A-Z](?=.*\\d)(?=.*[^a-zA-Z0-9]).+$";
		System.out.println(Pattern.matches(passwordRegex, "mailankit123@gmail.com"));
		System.out.println(Pattern.matches(passwordRegex, "123@#$33abcdA"));
		

	}
	
}
