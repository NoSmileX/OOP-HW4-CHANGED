package org.example.cars.bodytype;

import org.example.cars.Car;
import org.example.cars.Transmission;

import java.util.Objects;

public class Cabriolet extends Car {
    private String carRoof;
    private int seats;
    private Transmission transmission;

    public Cabriolet(String brandName, String modelName, int year, String carRoof, int seats, Transmission transmission) {
        super(brandName, modelName, year);
        this.carRoof = carRoof;
        this.seats = seats;
        this.transmission = transmission;
    }

    public Cabriolet() {
    }

    public String getCarRoof() {
        return carRoof;
    }

    public void setCarRoof(String carRoof) {
        this.carRoof = carRoof;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "cabriolet{" +
                "carRoof='" + carRoof + '\'' +
                ", seats=" + seats +
                ", " + transmission +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cabriolet cabriolet = (Cabriolet) o;
        return seats == cabriolet.seats && Objects.equals(carRoof, cabriolet.carRoof) && Objects.equals(transmission, cabriolet.transmission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carRoof, seats, transmission);
    }
}
