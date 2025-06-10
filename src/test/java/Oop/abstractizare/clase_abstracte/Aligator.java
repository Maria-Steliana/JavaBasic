package Oop.abstractizare.clase_abstracte;

public class Aligator extends Animal{


    @Override
    public void mananca() {
        System.out.println("Aligatorul mananca oameni.");
    }

    @Override
    public void infoAnimal() {
        System.out.println("Aligatorul " + getNume() + " de coloarea " + getCuloare() + " cantareste " + getGreutate() + " kg.");
    }
}
