package interfaces;

interface Bicycle {
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class AvonCycle implements Bicycle {
    int speed = 7;

    @Override
    public void applyBrake(int decrement) {
        speed = speed - decrement;
        System.out.println("Speed after applying brake is " + speed);
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
        System.out.println("Speed after applying speed up is " + speed);
    }

    public void blowHorn() {
        System.out.println("Blowing horn");
    }
}

public class InterfacesPractice1 {
    public static void main(String[] args) {
        Bicycle  b = new AvonCycle();
        b.applyBrake(2);
        b.speedUp(3);
    }
}
