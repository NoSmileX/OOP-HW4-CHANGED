package org.example.cars.bodytype;

import org.example.cars.Car;
import org.example.cars.Transmission;

import java.util.Objects;

public class SUV extends Car {
    private boolean isFourWheelDive;
    private boolean bikeRacks;
    private Transmission transmission;

    public SUV(String brandName, String modelName, int year, boolean isFourWheelDive, boolean bikeRacks, Transmission transmission) {
        super(brandName, modelName, year);
        this.isFourWheelDive = isFourWheelDive;
        this.bikeRacks = bikeRacks;
        this.transmission = transmission;
    }

    public SUV() {
    }

    public boolean isFourWheelDive() {
        return isFourWheelDive;
    }

    public void setFourWheelDive(boolean fourWheelDive) {
        isFourWheelDive = fourWheelDive;
    }

    public boolean isBikeRacks() {
        return bikeRacks;
    }

    public void setBikeRacks(boolean bikeRacks) {
        this.bikeRacks = bikeRacks;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "SUV{" +
                "isFourWheelDive=" + isFourWheelDive +
                ", bikeRacks=" + bikeRacks +
                ", " + transmission +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SUV suv = (SUV) o;
        return isFourWheelDive == suv.isFourWheelDive && bikeRacks == suv.bikeRacks && Objects.equals(transmission, suv.transmission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isFourWheelDive, bikeRacks, transmission);
    }
}
