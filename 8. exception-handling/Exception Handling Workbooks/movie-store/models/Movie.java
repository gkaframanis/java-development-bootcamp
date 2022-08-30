package models;

public class Movie {

    private String name;
    private String format;
    private double rating;
    private double sellingPrice;
    private double rentalPrice;
    private boolean isAvailable;

    public Movie(String name, String format, double rating) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name can't be null/blank");
        }
        if (!(format.equalsIgnoreCase("DVD") || format.equalsIgnoreCase("Blue-Ray"))) {
            throw new IllegalArgumentException("Format must be DVD or Blue-ray");
        }
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("Rating must be between 0 - 10");
        }
        this.name = name;
        this.format = format;
        this.rating = rating;
        this.sellingPrice = format.equalsIgnoreCase("Blue-ray") ? 7.25 : 4.25;
        this.rentalPrice = format.equalsIgnoreCase("Blue-ray") ? 2.99 : 1.99;
        this.isAvailable = true;
    }

    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
        this.sellingPrice = source.sellingPrice;
        this.rentalPrice = source.rentalPrice;
        this.isAvailable = source.isAvailable;
    }

    public String getName() {
        return this.name;
    }

    public String getFormat() {
        return this.format;
    }

    public double getRating() {
        return this.rating;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public double getRentalPrice() {
        return this.rentalPrice;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name can't be null/blank");
        }
        this.name = name;
    }

    public void setFormat(String format) {
        if (!(format.equalsIgnoreCase("DVD") || format.equalsIgnoreCase("Blue-Ray"))) {
            throw new IllegalArgumentException("Format must be DVD or Blue-ray");
        }
        this.format = format;
        this.setSellingPrice(format.equalsIgnoreCase("Blue-Ray") ? 7.25 : 4.25);
        this.setRentalPrice(format.equalsIgnoreCase("Blue-Ray") ? 2.99 : 1.99);
    }

    public void setRating(double rating) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("Rating must be between 0-10");
        }
        this.rating = rating;
    }

    private void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    private void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String toString() {
        return "\t Name: " + this.name + "\n" +
                "\t Format: " + this.format + "\n" +
                "\t Rating: " + this.rating + "\n" +
                "\t Selling Price: " + this.sellingPrice + "\n" +
                "\t Rental Price: " + this.rentalPrice + "\n" +
                "\t Availability: " + (this.isAvailable ? "in stock" : "rented") + "\n";
    }

}
