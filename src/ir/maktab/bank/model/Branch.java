package ir.maktab.bank.model;

import java.util.ArrayList;

public class Branch {
    private int id;
    private String city;
    private int quality;
    private Location location;

    private ArrayList<Customer> customerArrayList;

    Branch(int id, String city, int quality, Location location) {
        this.id = id;
        this.city = city;
        if (quality == 1 || quality == 2 || quality == 3)
            this.quality = quality;
        else {
            System.out.println("The Branch quality out of range. So we replaced it with the lowest amount of quality!");
            this.quality = 3;
        }
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getQuality() {
        return quality;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setQuality(int quality) {
        if (quality == 1 || quality == 2 || quality == 3)
            this.quality = quality;
        else {
            System.out.println("The Branch quality out of range. So we replaced it with the lowest amount of quality!");
            this.quality = 3;
        }
    }

    @Override
    public String toString() {
        return city + ", " + quality;
    }
}
