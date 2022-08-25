public class Dealership {
    private Car[] cars;

    // constructor
    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
           this.cars[i] = new Car(cars[i]); 
        }
    }

    // getter
    public Car getCar(int index) {
        // return this.cars[index] reference trap
        // We use the copy constructor
        return new Car(this.cars[index]);
    }

    //setter
    public void setCar(Car car, int index) {
        this.cars[index] = new Car(car);
    }

    // actions
    public void sell(int index) {
        this.cars[index].drive();
        this.cars[index] = null;
    }

    public int search(String make, int budget) {
        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] == null) {
                continue; // to avoid null exception if an object is null
            }
            else if (this.cars[i].getMake().equalsIgnoreCase(make) && this.cars[i].getPrice() <= budget) {
                System.out.println("\nWe found one in spot " + i + "\n\n" + this.cars[i].toString());
                System.out.print("If you are interested, type yes: ");

                return i;
            }
        }
        System.out.println("\nYour search didn't match any results...\n");
        return 404;
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
           temp += "Parking Spot: " + i + "\n";
           if(this.cars[i] == null) {
                temp += "Empty\n";
            }
            else {
                temp += this.cars[i].toString() + "\n"; 
            }
           
        }
        return temp;
    }
}
