package generics;

class MyArray<T> {
    T []A = (T[]) new Object[10];
    int length;

    public void append(T v) {
        A[length++] = v;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }
    }
}

// This class will be used to create only String type Array
class MyArray2 extends MyArray<String> {

}

class MyArray3<T extends Number> extends MyArray<T> {

}

public class GenericsDemo2 {
    public static void main(String[] args) {
        MyArray<Integer> myArray = new MyArray<>();

        myArray.append(10);
        myArray.append(20);
        myArray.append(30);

        myArray.display();

        // What if I don't mention type here, still it work, no error
        MyArray myArray2 = new MyArray();

        myArray2.append("Hi");
        myArray2.append(new Integer(10));
        myArray2.append("Bye");

        myArray2.display();

        // Only Numbers type
        MyArray3<Float> myArray3 = new MyArray3<>();
        myArray3.append(10.5f);
        myArray3.append(20.5f);
        myArray3.append(30.5f);

        myArray3.display();
    }
}
