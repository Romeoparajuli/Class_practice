package asifnmentFirst;

public class StringHandlingExample {

    public static void main(String[] args) {
        // Sample strings for demonstration
        String str1 = "   Hello, World!   "; // String with leading and trailing spaces
        String str2 = "hello, world!";
        String str3 = "Hello, Universe!";
        
        // 1. length() - Returns the length of the string
        System.out.println("Length of str1: " + str1.length());
        
        // 2. equals() - Compares two strings for equality
        System.out.println("str1 equals str2: " + str1.equals(str2));
        
        // 3. contains() - Checks if str1 contains str2
        System.out.println("str1 contains 'World': " + str1.contains("World"));
        
        // 4. equalsIgnoreCase() - Compares two strings for equality, ignoring case
        System.out.println("str1 equalsIgnoreCase str2: " + str1.trim().equalsIgnoreCase(str2));
        
        // 5. format() - Formats a string using specified format
        String formattedString = String.format("Formatted String: %s", str3);
        System.out.println(formattedString);
        
        // 6. trim() - Removes leading and trailing spaces
        System.out.println("Trimmed str1: '" + str1.trim() + "'");
        
        // 7. isEmpty() - Checks if the string is empty
        System.out.println("Is str1 empty: " + str1.trim().isEmpty());
        
        // 8. indexOf() - Finds the index of a substring
        System.out.println("Index of 'World' in str1: " + str1.indexOf("World"));
        
        // 9. toLowerCase() - Converts the string to lowercase
        System.out.println("str1 in lowercase: " + str1.toLowerCase());
        
        // 10. toUpperCase() - Converts the string to uppercase
        System.out.println("str1 in uppercase: " + str1.toUpperCase());
    }
}
