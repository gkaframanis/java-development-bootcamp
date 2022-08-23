public class BooleanComparisons {
   public static void main(String[] args) {
    // >
    // int comparison
    int chemistryGrade = 95;
    int biologyGrade = 75;

    System.out.println(biologyGrade > chemistryGrade);

    // double comparison
    double sales = 37.55;
    double costs = 5.55;

    System.out.println(sales > costs);

    // <
    System.out.println(biologyGrade < chemistryGrade);
    System.out.println(sales < costs);

    // >=
    int englishGrade = 75;
    System.out.println(chemistryGrade >= englishGrade);
    System.out.println(biologyGrade >= englishGrade);

    // <=
    System.out.println(chemistryGrade <= englishGrade);
    System.out.println(biologyGrade <= englishGrade);

    // ==
    System.out.println(chemistryGrade == englishGrade);
    System.out.println(biologyGrade == englishGrade);

    // !=
    System.out.println(chemistryGrade != englishGrade);
    System.out.println(biologyGrade != englishGrade);

    // equals and !equals for Strings only!
    String sentence = "I love this course!";
    String sentence2 = "I love this course!";
    System.out.println(sentence.equals(sentence2));
    System.out.println(!sentence.equals(sentence2));

   } 
}
