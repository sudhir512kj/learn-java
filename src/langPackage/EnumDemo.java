package langPackage;

enum Dept {
    CS, IT, CIVIL, ECE;

    Dept() {
        System.out.println(this.name());
    }

    public void display() {
        System.out.println(this.name() + " " + this.ordinal());
    }
}

enum Dept2 {
    CS("John", "Block A"), IT("Smith", "Block B"), CIVIL("Srinivas", "Block C"), ECE("Dave", "Block D");

    String head;
    String location;

    Dept2(String head, String location) {
        this.head = head;
        this.location = location;
    }

    public String getHead() {
        return head;
    }

    public String getLocation() {
        return location;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Dept d =  Dept.CIVIL;

        System.out.println(d.ordinal());
        System.out.println(Dept.valueOf("IT"));

        Dept []values =  Dept.values();
        for (Dept dept : values) {
            System.out.println(dept);
        }

        d.display();

        switch(d) {
            case CS:
                System.out.println("Head: John\nBlock: A");
                break;
            case IT:
                System.out.println("Head: Smith\nBlock: B");
                break;
            case CIVIL:
                System.out.println("Head: Srinivas\nBlock: C");
                break;
            case ECE:
                System.out.println("Head: Dave\nBlock: D");
                break;
        }

        Dept2 dept2 = Dept2.CS;
        System.out.println(dept2.getHead());
        System.out.println(dept2.getLocation());
    }
}
