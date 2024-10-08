package com.day6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Define regex patterns
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String dateRegex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d\\d\\b";
        String phoneRegex = "(?:\\+977?)?[9][6-9]\\d{8}";
        String urlRegex = "\\b(?:https?://|www\\.)\\S+\\b";
        String passwordRegex = "^[A-Z](?=.*\\d)(?=.*[^a-zA-Z0-9]).+$";

        // Pattern and Matcher objects
        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern datePattern = Pattern.compile(dateRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);
        Pattern urlPattern = Pattern.compile(urlRegex);
        Pattern passwordPattern = Pattern.compile(passwordRegex);

        // Input and validation for Email
        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();
        Matcher emailMatcher = emailPattern.matcher(email);
        if (emailMatcher.matches()) {
            System.out.println("Email is valid: " + email);
        } else {
            System.out.println("Email is not valid.");
        }

        // Input and validation for Date
        System.out.print("Enter a date (dd/mm/yyyy): ");
        String date = scanner.nextLine();
        Matcher dateMatcher = datePattern.matcher(date);
        if (dateMatcher.matches()) {
            System.out.println("Date is valid: " + date);
        } else {
            System.out.println("Date is not valid.");
        }

        // Input and validation for Phone Number
        System.out.print("Enter a phone number: ");
        String phone = scanner.nextLine();
        Matcher phoneMatcher = phonePattern.matcher(phone);
        if (phoneMatcher.matches()) {
            System.out.println("Phone number is valid: " + phone);
        } else {
            System.out.println("Phone number is not valid.");
        }

        // Input and validation for URL
        System.out.print("Enter a URL: ");
        String url = scanner.nextLine();
        Matcher urlMatcher = urlPattern.matcher(url);
        if (urlMatcher.matches()) {
            System.out.println("URL is valid: " + url);
        } else {
            System.out.println("URL is not valid.");
        }

        // Input and validation for Password
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        Matcher passwordMatcher = passwordPattern.matcher(password);
        if (passwordMatcher.matches()) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Password is not valid.");
        }

        // Close the scanner
        scanner.close();
    }
}
