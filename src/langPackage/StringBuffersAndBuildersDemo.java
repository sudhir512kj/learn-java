package langPackage;

public class StringBuffersAndBuildersDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" Java");
        sb.insert(1, "Java");
        sb.replace(1, 3, "Java");
        sb.delete(1, 3);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());

        StringBuilder  sb1 = new StringBuilder("Hello");
        sb1.append(" Java");
        sb1.insert(1, "Java");
        sb1.replace(1, 3, "Java");
        sb1.delete(1, 3);
        sb1.reverse();
        System.out.println(sb1);
        System.out.println(sb1.capacity());
    }
}
