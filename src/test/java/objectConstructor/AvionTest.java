package objectConstructor;

import org.testng.annotations.Test;

public class AvionTest {
    @Test
    public void metodaAvionTest(){
        System.out.println("==== Exemplul 1 ====");
        Avion Lufthansa = new Avion("Boeing", "747", "Pasageri", "SUA", 180, 350, 7);
        Lufthansa.infoAvion();
        System.out.println(" ");
        System.out.println("==== Exemplul 2 ====");
        Avion WizzAir = new Avion("Airbus", "589", "Pasageri", "Franta", 160,5);
        WizzAir.infoAvion();
    }
}
