package staticAndFinal;

class CoffeeMachine {
    private float coffeeQty;
    private float waterQty;
    private float milkQty;
    private float sugarQty;

    static private CoffeeMachine my = null;

    private CoffeeMachine() {
        coffeeQty = 1;
        waterQty = 1;
        milkQty = 1;
        sugarQty = 1;
    }

    public void fillWater(float qty) {
        waterQty = qty;
    }

    public void fillSugar(float qty) {
        sugarQty = qty;
    }

    public float getCoffee() {
        return 0.15f;
    }

    static CoffeeMachine getInstance() {
        if (my == null)
            my = new CoffeeMachine();
        return my;
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "coffeeQty=" + coffeeQty +
                ", waterQty=" + waterQty +
                ", milkQty=" + milkQty +
                ", sugarQty=" + sugarQty +
                '}';
    }
}

public class SingletonClassDemo {
    public static void main(String[] args) {
        CoffeeMachine  m1 = CoffeeMachine.getInstance();
        CoffeeMachine  m2 = CoffeeMachine.getInstance();
        System.out.println(m1);
        System.out.println(m2);

        if  (m1 == m2) {
            System.out.println("Same");
        }
    }
}
