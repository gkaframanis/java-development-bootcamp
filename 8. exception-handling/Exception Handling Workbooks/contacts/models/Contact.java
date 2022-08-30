package models;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Contact {
    private String name;
    private int age;
    private String birthDate;
    private String phoneNumber;

    // costructor
    public Contact (String name, String phoneNumber, String birthDate) throws ParseException {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name can't be null/blank");
        }
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Phone number can't be null/blank");
        }
        if (phoneNumber.length() < 5) {
            throw new IllegalArgumentException("Phone number can't be less than 5 characters.");
        }
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = this.toAge(birthDate);
    }

    // copy constructor
    public Contact (Contact source) {
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }


    // getters
    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getAge() {
        return this.age;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    // setters
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name can't be null/blank");
        }
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Phone number can't be null/blank");
        }
        if (phoneNumber.length() < 5) {
            throw new IllegalArgumentException("Phone number can't be less than 5 characters.");
        }
        this.phoneNumber = phoneNumber;
    }

    public void setBirthDate(String birthDate) throws ParseException {
        this.birthDate = birthDate;
        setAge(toAge(birthDate));
    }

    private void setAge(int age) {
            this.age = age;
    }

    // convert birthday String to age.
    public int toAge(String birthDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        formatter.setLenient(false); // not to tolerate other pattern
        // Don't try to catch the exception inside the constructor!!!
        // Date toDate = formatter.parse(birthDate);  // converts String to date
        // long toMilli = toDate.getTime(); // converts Date to milliseconds since 1970

        // The age in milliseconds
        long diff = new Date().getTime() - formatter.parse(birthDate).getTime(); 
        return (int)TimeUnit.MILLISECONDS.toDays(diff) / 365;
    }

    public String toString() {
        return "Name: " + this.name + "\n" + 
                "Phone number: " + this.phoneNumber + "\n" +
                "Birth Date: " + this.birthDate + "\n" +
                "Age: " + this.age + " years old\n";
    }
}