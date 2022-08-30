// package models;

public class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }
    public Employee(Employee source) {
        // DON'T use name.equals(null) SOS
        if (name == null || name.isBlank() || position == null || position.isBlank()) {
            throw new IllegalArgumentException("Name or position can not be null/blank");
        } 
        this.name = source.name;
        this.position = source.position;
    }

    public String getName() {
        return name;
    }
    
    public String getPosition() {
        return position;
    }

    public String toString() {

        return "\tName: " + name + "\tPosition: " + this.position + "\n";
    }
}
