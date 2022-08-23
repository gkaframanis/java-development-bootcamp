public class BuiltInFunctions {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        double sine = Math.sin(1.2);
        System.out.println("The sine of 1.2 is: " + sine);

        double power = Math.pow(2, 4);
        System.out.println("The 2^4 is: " + power);

        // returns a random number between 0 and 1
        double random = Math.random() * 100;
        System.out.println("The random value is: " + random);
    }
}
