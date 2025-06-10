package Oop.polimorfism.stati;

import org.testng.annotations.Test;

public class CalculeTest extends Calcule{


    @Test
    public void testAdunare(){
        Calcule adunarePolimorfism = new Calcule();
        System.out.println("Adunarea a doua int-uri este: " + adunarePolimorfism.adunare(3,5));
        System.out.println("Adunarea a doua double este: " + adunarePolimorfism.adunare(3.5,5.5));
        System.out.println("Adunarea a doua string-uri este: " + adunarePolimorfism.adunare("abc","def"));
    }
}
