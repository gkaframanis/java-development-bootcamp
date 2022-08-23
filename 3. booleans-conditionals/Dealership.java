import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java DealerShip!!!");
        System.out.println("Select option 'a' to buy a car");
        System.out.println("Select option 'b' to sell a car");

        // nextLine always returns a String, that's why we don't use a char
        String option = scan.nextLine();

        switch (option) {
            case "a":
                System.out.println("\nWhat is your budget?");
                int budget = scan.nextInt();
                if (budget >= 10000) {
                    System.out.println("\nGreat! A Nissan Altima is available");
                    System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a licence? Write 'yes' or 'no'");
                    String licence = scan.nextLine();
                    System.out.println("\nWhat is your credit score?");
                    int creditScore = scan.nextInt();
                    if(insurance.equals("yes") && licence.equals("yes") && creditScore > 600){
                        System.out.println("\nSold! Pleasure doing business with you!");
                    } else {
                        System.out.println("\nSorry, you are not eligible...");
                    }
                } else {
                    System.out.println("We don't sell cars under 10000 $. Sorry!");
                }
                break;
            case "b":
                System.out.println("\nWhat is your car valued at?");
                int value = scan.nextInt();
                System.out.println("\nWhat is your selling price");
                int price = scan.nextInt();

                if (value > price && price < 30000) {
                    System.out.println("\nWe will buy your car. Pleasure doing business with you!");
                } else {
                    System.out.println("\nSorry, we are not interested...");
                }
                break;
            default: System.out.println("\nInvalid option");
        }

        scan.close();
    }
}
