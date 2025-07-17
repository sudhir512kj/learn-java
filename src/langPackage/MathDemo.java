package langPackage;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println("Absolute:  " + Math.abs(-123));
        System.out.println("Rounded:  " + Math.round(10.5));
        System.out.println("Strict Absolute: " + StrictMath.abs(-123));
        System.out.println("Cube Root: " + Math.cbrt(9));
        System.out.println("Exact Decrement: " + Math.decrementExact(2));
        System.out.println("Exponent: " + Math.getExponent(10));
        System.out.println("Exponent: " + Math.getExponent(10.5));
        System.out.println("Exponent: " + Math.getExponent(12.3456));
        System.out.println("Round Division:  " + Math.floorDiv(50, 9));
        System.out.println("e power x: " + Math.exp(1));
        System.out.println("Strict e power x: " + StrictMath.exp(1));
        System.out.println("Log base 10:  " + Math.log10(100));
        System.out.println("Max:  " + Math.max(10, 20));
        System.out.println("Min:  " + Math.min(10, 20));
        System.out.println("Power:  " + Math.pow(2, 3));
        System.out.println("Tan:  " + Math.tan(45*Math.PI/180));
        System.out.println("Convert to Radians: " + Math.toRadians(90));
        System.out.println("Convert to Degrees: " + Math.toDegrees(Math.PI/2));
        System.out.println("Strict Convert to Degrees: " + StrictMath.toDegrees(Math.PI/2));
        System.out.println("Random: " + Math.random());
        System.out.println("Exact Product: " + Math.multiplyExact(100, 200));
        System.out.println("Next Down: " + Math.nextDown(10.5));
        System.out.println("Next Up: " + Math.nextUp(10.5));

    }
}
