package Oop.abstractizare.interfete;

import org.testng.annotations.Test;

public class RestaurantTest {
    @Test
    public void activitateRestaurant(){
        Bucatar Ionel = new Bucatar();
        Ionel.PregatesteMancare("paste bolognese");

        Chelner Petre = new Chelner();
        Petre.PrimesteComanda(3);
        Petre.ServesteMancare("paste bolognese", "Adrian");
        Petre.CurataMasa(5);
        Petre.SpalaVase();

        Ospatar Vasile = new Ospatar();
        Vasile.PrimesteComanda(7);
        Vasile.ServesteMancare("burger", "Andreea");

        AsistentBucatar Dorian = new AsistentBucatar();
        Dorian.CurataMasa(9);
        Dorian.SpalaVase();

    }

}
