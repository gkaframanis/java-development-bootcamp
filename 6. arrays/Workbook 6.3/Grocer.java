public class Grocer {
    public static void main(String[] args) {
        
        /* Task 1: Create an array that stores each aisle:
             apples – bananas – candy – chocolate – coffee – tea

             Then, use a for loop to print each element in the array. 
        */
        String[] store = {"apples", "bananas", "chocolate", "coffee", "tea"};
        for (int i = 0; i < store.length; i++) {
           System.out.println("We have " + store[i] + " at aisle " + i + "\n");
        }
 
        /* Task 2:
           1. System.out.println("\nDo you sell coffee?");

           2. Using the for loop from task 1:
            • check if Java Grocer sells coffee.
            • if so, break the loop and print: \nWe have that in aisle: <index>

        */
        System.out.println("\nDo you sell coffee?");

        for (int i = 0; i < store.length; i++) {
            if (store[i].equals("coffee")){
                System.out.println("\nWe have that in aisle: " + i);
                break;
            }
        }
    
    }
}
