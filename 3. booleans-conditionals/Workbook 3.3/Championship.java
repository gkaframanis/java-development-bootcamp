public class Championship {
    public static void main(String[] args) {

        int gryffindor = 400;    //gryffindor points
        int ravenclaw = 100;    //ravenclaw points

        int margin = gryffindor - ravenclaw;

        if (margin >= 300) {
            System.out.println("Gruffindor takes the house cup!");
        }
        else if (margin > 0) {
            System.out.println("In second place, Gryffindor!");
        }
        else if (margin > -100) {
            System.out.println("In third place, Gryffindor!");
        }
        else {
            System.out.println("In fourth place, Gryffindor!");
        }
    }
}