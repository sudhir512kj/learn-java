package strings;

public class StringMethodsPractice {
    public static void main(String[] args) {
        // Part 1: String methods
        String str = "netbeans";
        String upperStr = str.toUpperCase();
        String untrimmedStr = "   netbeans   ";
        String trimmedStr = untrimmedStr.trim();
        String subStr = str.substring(3);

        System.out.println(str.length()); // Length of the string
        System.out.println(upperStr); // Convert to uppercase
        System.out.println(untrimmedStr); // Original string with spaces
        System.out.println(trimmedStr); // Trimmed string without leading and trailing spaces
        System.out.println(subStr); // Substring starting from index 3
        System.out.println(str.replace('e', 'M')); // Replace 'e' with 'M'

        // Part 2: String methods
        String str1 = "Mr. Shahrukh Khan";
        String str2 = "www.udemy.co.in";

        System.out.println(str1.startsWith("mr.")); // Check if the string starts with "mr."
        System.out.println(str1.endsWith("Khan")); // Check if the string ends with "Khan"
        System.out.println(str1.charAt(4)); // Get character at index 4

        System.out.println(str2.indexOf(".")); // Find the index of the first occurrence of '.'
        System.out.println(str2.lastIndexOf(".")); // Find the index of the last occurrence of '.'

        // Part 3: String methods
        String str3 = "Pyramid";
        String str4 = "Pyramid";
        String str5 = "the great wall of china";
        String str6 = "the great wall ";
        String str7 = "of china";

        System.out.println(str3.equals(str4)); // Check if str3 and str4 are equal
        System.out.println(str3.equalsIgnoreCase(str4)); // Check if str3 and str4 are equal ignoring case
        System.out.println(str3.compareTo(str4)); // Compare str3 and str4 lexicographically
        System.out.println(str5.contains("china")); // Check if str5 contains the substring "china"
        System.out.println(str6.concat(str7));
    }
}
