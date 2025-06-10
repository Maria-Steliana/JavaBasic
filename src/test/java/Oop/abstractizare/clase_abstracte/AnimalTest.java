package Oop.abstractizare.clase_abstracte;

import org.testng.annotations.Test;

public class AnimalTest {

    @Test
    public void testMethod(){
        System.out.println("=== Exemplul 1 ===");
        Elefant Cici = new Elefant();
        Cici.mananca();
        Cici.infoAnimal();
        Cici.dorm();

        System.out.println(" ");
        System.out.println("=== Exemplul 2 ===");
        Aligator Doru = new Aligator();
        Doru.mananca();
        Doru.setNume("Doru");
        Doru.setCuloare("Verde");
        Doru.setGreutate(500);
        Doru.infoAnimal();
        Doru.dorm();

        System.out.println(" ");
        System.out.println("=== Exemplul 3 ===");
        Dinozaur Gigi = new Dinozaur();
        Gigi.setNume("Gigi");
        Gigi.setGreutate(1000);
        Gigi.setCuloare("albastru");
        Gigi.mananca();
        Gigi.infoAnimal();
        Gigi.dorm();
    }

    // Clasa abstracta nu se poate instanita.
    // Animal Animal = new Animal();


}
