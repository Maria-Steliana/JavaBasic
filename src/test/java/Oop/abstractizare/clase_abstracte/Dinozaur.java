package Oop.abstractizare.clase_abstracte;

public class Dinozaur extends Animal{


    @Override
    public void mananca() {
        System.out.println("Dinozaurul " + getNume() + " mananca carne.");
    }

    @Override
    public void infoAnimal() {
        System.out.println("Dinozaurul de culoarea " + getCuloare() + " are " + getGreutate() + " tone.");
    }
}
