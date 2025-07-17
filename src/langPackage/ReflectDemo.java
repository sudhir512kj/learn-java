package langPackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class My {
    private int a;
    protected int b;
    public int c;
    int d;

    public My() {}

    public My(int x, int y) {}

    public void display(String s1, String s2) {}

    public int show(int x, int y) {return 0;}
}

public class ReflectDemo {
    public static void main(String[] args) {
        Class c = My.class;

        // My m = new My();
        // Class c1 = m.getClass();

        System.out.println(c.getName());

        Field []fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Constructor []constructors = c.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        Method []methods = c.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        Parameter []parameters = methods[0].getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }
    }
}
