package dataTypes;

public class UnicodeChars {
    public static void main(String[] args) {
        for (char c = 0x0370; c <= 0x03FF; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
        for (char c = 0x0900; c <= 0x0970; c++) {
            System.out.print(c + " ");
        }
    }
}
