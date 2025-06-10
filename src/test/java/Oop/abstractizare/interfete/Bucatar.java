package Oop.abstractizare.interfete;

public class Bucatar implements GatesteInterface{
    @Override
    public void PregatesteMancare(String tipDeMancare) {
        System.out.println("Bucatarul pregateste: " + tipDeMancare);
    }
}
