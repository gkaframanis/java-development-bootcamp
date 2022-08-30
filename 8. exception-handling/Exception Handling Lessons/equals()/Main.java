import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "blue");
        Car sameCar = new Car(car);

        // System.out.println(car.equals(null)); // false
        // Scanner scan = new Scanner(System.in);
        // System.out.println(car.equals(scan)); // false (not instanceof Car)
        System.out.println(car.equals(sameCar)); // true
    }

}
