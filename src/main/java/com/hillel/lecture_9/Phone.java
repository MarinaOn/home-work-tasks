package com.hillel.lecture_9;

import java.util.Objects;

public class Phone {

    private String provider;
    private int price;
    private String manufacturer;


    public Phone(String provider, String type, String manufacturer) {
        this.provider = provider;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public String call() {
        return "Incoming call";
    }

    public String down() {
        return "Get off the phone, please";
    }

    public String getProvider() {
        return provider;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;
        return Objects.equals(getManufacturer(), phone.getManufacturer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider, price, manufacturer);
    }
}

