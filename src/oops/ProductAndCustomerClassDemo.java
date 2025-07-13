package oops;

class Product {
    private String itemNo;
    private String name;
    private double price;
    private int qty;

    public Product(String itemNo) {
        this.itemNo = itemNo;
    }

    public Product(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }

    public Product(String itemNo, String name, double price, int qty) {
        this.itemNo = itemNo;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String getItemNo() {
        return itemNo;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Product{" +
                "itemNo='" + itemNo + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}

class Customer {
    private String custId;
    private String name;
    private String address;
    private String phone;

    public Customer(String custId, String name) {
        this.custId = custId;
        this.name = name;
    }

    public Customer(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId='" + custId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

public class ProductAndCustomerClassDemo {
    public static void main(String[] args) {
        // create some products and customers here
        Product p1 =  new Product("P001", "Laptop", 50000, 10);
        Product p2 =  new Product("P002", "Mobile", 20000, 20);
        Product p3 =  new Product("P003", "Tablet", 10000, 30);
        Product p4 =  new Product("P004", "Watch", 5000, 40);

        // now some customers
        Customer c1 =  new Customer("C001", "Sudhir Meena");
        Customer c2 =  new Customer("C002", "Raj Meena");
        Customer c3 =  new Customer("C003", "Rajesh Meena");
        Customer c4 =  new Customer("C004", "Rajesh Meena");
    }
}
