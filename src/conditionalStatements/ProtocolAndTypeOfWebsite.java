package conditionalStatements;

import java.util.Scanner;

public class ProtocolAndTypeOfWebsite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the URL: ");
        String url = sc.nextLine();

        // Check if the URL starts with "http://" or "https://" or "ftp://"
        if (url.startsWith("http://")) {
            System.out.println("Hypertext Transfer Protocol");
        } else if (url.startsWith("https://")) {
            System.out.println("Hypertext Transfer Protocol Secure");
        } else if (url.startsWith("ftp://")) {
            System.out.println("File Transfer Protocol");
        } else {
            System.out.println("Unknown protocol");
        }

        // Check the type of website based on the domain
        String domain = url.split("/")[2]; // Extract the domain from the URL
        if (domain.endsWith(".com")) {
            System.out.println("Commercial");
        } else if (domain.endsWith(".org")) {
            System.out.println("Organizational");
        } else if (domain.endsWith(".edu")) {
            System.out.println("Educational");
        } else if (domain.endsWith(".gov")) {
            System.out.println("Government");
        } else {
            System.out.println("Unknown type of website");
        }

    }
}
