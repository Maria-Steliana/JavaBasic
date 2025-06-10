package Oop.abstractizare.interfete;

public class Chelner implements ServesteInterface, CurataInterface{
    @Override
    public void PrimesteComanda(int numarComanda) {
        System.out.println("Chelnerul primeste comanda cu numarul: " + numarComanda);
    }

    @Override
    public void ServesteMancare(String tipulMancarii, String numeClient) {
        System.out.println("Chelnerul duce mancarea " + tipulMancarii + " la clientul " + numeClient);
    }

    @Override
    public void CurataMasa(int numarMasa) {
        System.out.println("Chelnerul curata masa cu numarul " + numarMasa);
    }

    @Override
    public void SpalaVase() {
        System.out.println("Chelnerul spala vase dupa ce se inchide restaurantul.");
    }
}
