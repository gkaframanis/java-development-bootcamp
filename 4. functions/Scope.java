public class Scope {
    // class level scope, so we can access from anywhere inside the class.
    static int dogs = 5;
    public static void main(String[] args) {
        System.out.println(dogs);
        someFunction();
    }

    public static void someFunction() {
       System.out.println(dogs);
    }
}
