package Oop.polimorfism.dinamic;

import org.testng.annotations.Test;

public class AnimalTest {

    @Test
    public void sunetAnimale(){
        Caine Azorel = new Caine();
        Azorel.scoateSunet();

        Pisica Mototol = new Pisica();
        Mototol.scoateSunet();

        Arici Tony = new Arici();
        Tony.scoateSunet();

        Animal UnAnimal = new Animal();
        UnAnimal.scoateSunet();
    }

}
