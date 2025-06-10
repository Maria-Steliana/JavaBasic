package Oop.abstractizare.clase_abstracte;

public class Elefant extends Animal {


    @Override
    public void mananca() {
        System.out.println("Elefantul mananca banane.");
    }

    @Override
    public void infoAnimal() {
        System.out.println("Elefantii nu uita niciodata.");
    }

    public void dorm(){
        super.dorm();
    }
}
