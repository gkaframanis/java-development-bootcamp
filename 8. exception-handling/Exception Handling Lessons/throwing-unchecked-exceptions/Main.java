// import models.Employee;
// import models.Store;

public class Main {
    public static void main(String[] args) {
        Employee stocker = new Employee("Paul", "Stocker");
        Employee assistManager = new Employee("Nicholas", "Assistant Manager");
        Employee manager = new Employee("Damien", "Manager");

        Store store = new Store();
        store.setEmployees(0, stocker);
        store.setEmployees(1, assistManager);
        store.setEmployees(2, manager);

        System.out.println(store);
        store.open();
        
    }
}
