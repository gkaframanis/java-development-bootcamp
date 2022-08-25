import java.util.Arrays;
import java.util.Random;

public class Person {
    private String[] passport;
    private String name;
    private String nationality;
    private String dateOfBirth;
    private int seatNumber;

    // applyPassport
    // chooseSeat
    public Person (String name, String nationality, String dateOfBirth, int seatNumber) {
        this.passport = new String[3];
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
    }

    // Copy Constructor
    public Person (Person source) {
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
    }
    
    // getters
    public String[] getPassport() {
        return Arrays.copyOf(this.passport, this.passport.length);   
    }

    public String getName() {
        return this.name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    // setters
    public void setPassport() {
        this.passport = new String[] {this.name, this.nationality, this.dateOfBirth}; 
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    // actions
    /**
     *  Function name: applyPassport
     *  @return (boolean)
     *
     *  Inside the function:
     *     1. Returns a random boolean of true or false.
     */

     public boolean applyPassport() {
        Random random = new Random();
        return random.nextBoolean();
     }

     /**
     *  Function name: chooseSeat
     *
     *  Inside the function:
     *    1. Sets this.seat to a random number between 1 -- 11.
     */
    public void chooseSeat() {
        double randDouble = Math.random() * 11 + 1;
        setSeatNumber((int)randDouble);
    }

    public String toString() {
        return "Name: " + this.name + "\n" 
            + "Nationality: " + this.nationality + "\n" 
            + "Date of Birth: " + this.dateOfBirth + "\n"
            + "Seat Number: " + this.seatNumber + "\n"
            + "Passport: " + Arrays.toString(passport) + "\n";
    }
}
