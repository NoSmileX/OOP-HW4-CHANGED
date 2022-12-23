package org.example.cars.bodytype;

import org.example.cars.Car;
import org.example.cars.Transmission;

import java.util.Objects;

public class Limousine extends Car {
    private int seats;
    private double carLength;
    private Transmission transmission;

    public Limousine(String brandName, String modelName, int year, int seats, double carLength, Transmission transmission) {
        super(brandName, modelName, year);
        this.seats = seats;
        this.carLength = carLength;
        this.transmission = transmission;
    }

    public Limousine() {
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCarLength() {
        return carLength;
    }

    public void setCarLength(double carLength) {
        this.carLength = carLength;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Limousine{" +
                "seats=" + seats +
                ", carLength=" + carLength +
                ", " + transmission +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Limousine limousine = (Limousine) o;
        return seats == limousine.seats && Double.compare(limousine.carLength, carLength) == 0 && Objects.equals(transmission, limousine.transmission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seats, carLength, transmission);
    }
}
