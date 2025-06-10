package Oop.abstractizare.interfete;

public class Ospatar implements ServesteInterface{
    @Override
    public void PrimesteComanda(int numarComanda) {
        System.out.println("Ospatarul preia comanda cu numarul: " + numarComanda);
    }

    @Override
    public void ServesteMancare(String tipulMancarii, String numeClient) {
        System.out.println("Ospatarul serveste " + tipulMancarii + " la " + numeClient);
    }
}
