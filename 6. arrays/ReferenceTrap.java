import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        // The reference trap happens when many variables share the same reference to an array.
        // Don't set arrays equal to each other to avoid it.
        // The state of a variable should not change because you updated another.
        // Solution: make a new array!!!
        // Arrays.copyOf(array, array.length);
        // 1. The array you want to copy 2. How much of it you want to copy
        
        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        staffThisYear[1] = "Abby";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}
