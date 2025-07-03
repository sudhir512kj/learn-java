package strings;

public class StringObjectsPractice {
    public static void main(String[] args) {
        String str1 = "Java Program";
        String str2 = new String("JAVA");
        char c[] = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(c);
        byte b[] = {65, 66, 67, 68, 69};
        String str4 = new String(b);
        String str5 = new String(b, 1, 3);

        String str6 = "Java";
        String str7 = "Java";
        String str8 = new String("Java");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6 == str7);
        System.out.println(str6 == str8);
    }
}
