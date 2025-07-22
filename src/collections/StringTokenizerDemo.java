package collections;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String data = "name=Sudhir;address=Gurgaon;country=India;dept=CSE";

        StringTokenizer stringTokenizer = new StringTokenizer(data, "=;");

        String s;

        while (stringTokenizer.hasMoreTokens()) {
            s = stringTokenizer.nextToken();
            System.out.println(s);
        }
    }
}
