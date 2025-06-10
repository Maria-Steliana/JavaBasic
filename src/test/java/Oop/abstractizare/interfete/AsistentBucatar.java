package Oop.abstractizare.interfete;

public class AsistentBucatar implements CurataInterface{
    @Override
    public void CurataMasa(int numarMasa) {
        System.out.println("Asistentul vine si debaraseaza masa " + numarMasa);
    }

    @Override
    public void SpalaVase() {
        System.out.println("Asistentul trebuie sa sepele toate vasele folosite.");
    }
}
