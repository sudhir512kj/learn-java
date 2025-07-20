package ioStreams;

import java.io.*;
import java.util.Scanner;

class Customer implements Serializable {
    String custID;
    String name;
    String phone;

    static int count = 0;

    Customer() {}

    Customer(String name, String phone) {
        this.custID = "C" + count;
        count++;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custID='" + custID + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

public class SerializeCustomerStoreAndRetrieve {
    public static void main(String[] args) throws Exception {
        Customer []list = {new Customer("Smith", "8484874748"),
                new Customer("John", "7883838838"),
                new Customer("Reena", "78848373838")
        };
        FileOutputStream fos = new FileOutputStream("src/ioStreams/Customer.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeInt(list.length);
        for (Customer c : list) {
            oos.writeObject(c);
        }
        oos.close();
        fos.close();

        Scanner sc = new Scanner(System.in);

        FileInputStream fis = new FileInputStream("src/ioStreams/Customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int length = ois.readInt();

        Customer []listOfCustomers = new Customer[length];
        for (int i=0; i < length; i++) {
            listOfCustomers[i] = (Customer) ois.readObject();
        }

        System.out.println("Enter Name of customer: ");
        String name = sc.nextLine();

        for (int i=0; i < length; i++) {
            if (name.equalsIgnoreCase(listOfCustomers[i].name)) {
                System.out.println(listOfCustomers[i]);
            }
        }

        ois.close();
        fis.close();
    }
}
