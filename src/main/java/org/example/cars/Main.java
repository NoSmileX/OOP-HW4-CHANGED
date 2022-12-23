package org.example.cars;

import org.example.cars.bodytype.Cabriolet;
import org.example.cars.bodytype.Limousine;
import org.example.cars.bodytype.SUV;

public class Main {
    public static void main(String[] args) {
        Transmission automatic = new Transmission(Transmission.TypeOfTransmission.AUTOMATIC);
        Transmission mechanic = new Transmission(Transmission.TypeOfTransmission.MECHANIC);
        Transmission robot = new Transmission(Transmission.TypeOfTransmission.ROBOT);

        Cabriolet cabriolet1 = new Cabriolet("Ford", "Mustang EcoBoost Convertible",
                2016, "folding car roof", 4, automatic);
        Limousine limousine1 = new Limousine("Lexus", "LX",
                1999, 7, 488, mechanic);
        SUV suv1 = new SUV("Rolls-Royce", "Cullinan",
                2022, true, false, robot);
        SUV suv2 = new SUV("Mercedes-Benz", "G-Class",
                2022, true, false, automatic);

        System.out.println(cabriolet1);
        System.out.println(limousine1);
        System.out.println(suv1);
        System.out.println(suv1.hashCode());
        System.out.println(suv1.equals(suv2));
    }
}
