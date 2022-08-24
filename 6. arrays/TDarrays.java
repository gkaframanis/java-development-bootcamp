import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {
        // int[][] grades = new int[3][4];

        // grades[0][0] = 72;
        // grades[0][1] = 74;
        // grades[0][2] = 78;
        // grades[0][3] = 76;

        // grades[1][0] = 65;
        // grades[1][1] = 64;
        // grades[1][2] = 61;
        // grades[1][3] = 67;

        // grades[2][0] = 95;
        // grades[2][1] = 98;
        // grades[2][2] = 99;
        // grades[2][3] = 100;

        int[][] grades = {
            {72, 74, 78, 76},
            {65, 64, 61, 67},
            {95, 98, 99, 100}
        };

        // for (int j = 0; j < grades[0].length; j++) {
        //     System.out.print(grades[0][j] + " ");  // [0][0] [0][1] [0][2]
        // }
        // System.out.print("\n");
        // for (int j = 0; j < grades[1].length; j++) {
        //     System.out.print(grades[1][j] + " ");  // [1][0] [1][1] [1][2]
        // }
        // System.out.print("\n");
        // for (int j = 0; j < grades[2].length; j++) {
        //     System.out.print(grades[2][j] + " ");  // [2][0] [2][1] [2][2]
        // }
        // System.out.print("\n");

        // Nested loops for 2D arrays:
        // Outer loop run through every row (i) and inner loop runs through every item in that row.

        // the length of the 2D array is the number of rows it has.
        for (int i = 0; i < grades.length; i++) {
            switch (i) {
                case 0: System.out.print("\tHarry: "); break;
                case 1: System.out.print("\tRon: "); break;
                case 2: System.out.print("\tHermione: "); break;
            }
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.print("\n");
        }

        // Access values using the indexes (first index row (array), 2nd element)

        // Each row is an array with 4 elements
        System.out.println("\n\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tRon: " + Arrays.toString(grades[1]));
        System.out.println("\tHermione: " + Arrays.toString(grades[2]));

        System.out.println("\n\tHarry: " + grades[0][0] + " " + grades[0][1] + " " + grades[0][2] + " " + grades[0][3]);
        System.out.println("\tRon: " + grades[1][0] + " " + grades[1][1] + " " + grades[1][2] + " " + grades[1][3]);
        System.out.println("\tHermione: " + grades[2][0] + " " + grades[2][1] + " " + grades[2][2] + " " + grades[2][3]);
      
    }
}
