import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // nextLine() Waits for a string
        System.out.println("Welcome.Thank you for taking the survey.");

        int counter = 0;

        System.out.println("What is your name?");
        String name = scan.nextLine();
        counter++;

        // nextDouble() Waits for a double
        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("How much do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter++;

        // nextInt() waits for an integer
        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("How many times a week do you buy fast food?");
        int foodAmount = scan.nextInt();
        counter++;

        System.out.println("\nThank you " + name + " for answering all " + counter + " questions.");
        System.out.println("Your fast food expenses are " + (foodPrice/coffeePrice) + " times your coffee expenses.");
        System.out.println("Weekly you spend $ " + (coffeeAmount * coffeePrice) + " on coffee.");
        System.out.println("Weekly you spend $ " + (foodAmount * foodPrice) + " on food.");
        scan.close();
    }
}
