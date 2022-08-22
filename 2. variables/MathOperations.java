public class MathOperations {
    public static void main(String[] args) {
        int bagOfSweets1 = 5;
        int bagofSweets2 = 10;

        long starsInMilkyWay = 2500000000L;
        long starsInAndromeda = 1000000000000L;

        double testScore = 6.7;
        double bonusMarks = 2.5;

        // The + operator
        System.out.println("Fred and George collected " + (bagOfSweets1 + bagofSweets2) + " sweets");
        System.out.println("There are " + (starsInMilkyWay + starsInAndromeda) + " stars in the Milky Way and Andromeda galaxies.");
        System.out.println("With bonus marks, Ron scored " + (testScore + bonusMarks) + "/10 on his potions test. Snape wasn't too thrilled." );

        // The - operator
        System.out.println("Fred has " + (bagOfSweets1 - bagofSweets2) + " sweets than George");
        System.out.println("The Andromeda Galaxy has " + (starsInAndromeda - starsInMilkyWay) + " more stars than the Milky Way");
        System.out.println("Snape ended up removing marks. Ron actually scored" + (testScore - bonusMarks) + " on his potions test." );

        // The * operator
        System.out.println("Fred and George used a special spell to multiply their sweets to: " + bagOfSweets1 * bagofSweets2);
        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to: " + testScore * bonusMarks);

        // The / operator
        System.out.println("Originally, Fred had  " + bagofSweets2 / bagOfSweets1 + " times more sweets than George.");
        System.out.println("Andromeda has " + starsInAndromeda / starsInMilkyWay + " times more stars.");
        System.out.println("Snape caught the error. Furious, he divided Ron's score to: " + testScore / bonusMarks);

        // The % operator (to get the remainder)
        System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of: " +  (10 % 2));
        System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of: " +  ( 5 % 2));

        // The ++ operator
        // increases the value by one
        
        int counter = 0;

        counter++;
        counter++;
        counter++;
        System.out.println("I count: " + counter);

        // The -- operator
        // decreases the value by one
        counter--;
        counter--;
        counter--;
        System.out.println("I count: " + counter);

        // The += Adds the value on the right
        // The -= Subtracts the value on the right
    }
}