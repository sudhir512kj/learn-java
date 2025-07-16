package mutithreading;

class ATM {
    synchronized public void checkBalance(String name) {
        System.out.println(name + " checking balance");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Balance");
    }

    synchronized public void withdraw(String name, int amount) {
        System.out.println(name + " withdrawing");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(amount);
    }
}

class Customer extends Thread {
    String name;
    int amount;
    ATM atm;

    public Customer(String name, int amount, ATM atm) {
        this.name = name;
        this.amount = amount;
        this.atm = atm;
    }

    public void useATM() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    public void run() {
        useATM();
    }
}

public class ATMCustomerDemo {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c1 = new Customer("Smith", 100, atm);
        Customer c2 = new Customer("John", 200, atm);

        c1.start();
        c2.start();
    }
}
