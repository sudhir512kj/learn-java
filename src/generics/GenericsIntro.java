package generics;

class Data<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}

public class GenericsIntro {
    public static void main(String[] args) {
        Data<Integer> d = new Data<>();
        d.setObj(10);
        System.out.println(d.getObj());
    }
}
