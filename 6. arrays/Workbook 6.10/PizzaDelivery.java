import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     
        System.out.print("How many pizza toppings do you want? ");
        int numOfToppings = scan.nextInt();
        scan.nextLine();

        String[] pizzaToppings = new String[numOfToppings];

         System.out.println("\nGreat, enter each topping!");
         for (int i = 0; i < pizzaToppings.length; i++) {
            System.out.print("Topping " + (i + 1) + ": ");
            pizzaToppings[i] = scan.nextLine();
         }

         System.out.println("\nThe toppings you selected are: ");
         for (int i = 0; i < pizzaToppings.length; i++) {
            System.out.println("\t" + pizzaToppings[i]);
         }


        System.out.println("\nPress anything to confirm your order");
        scan.nextLine();
        System.out.println("Great, a driver is on the way!");

        scan.close();


         
    }
}
