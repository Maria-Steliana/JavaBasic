package Oop.Example;

import org.testng.annotations.Test;

public class OopTest {
    @Test
    public void oopExampleTest(){
        System.out.println("=== Exemplul Student ===");
        Student Ionel = new Student("Popescu", 20,"Ionel", "Constructii",
                "Rezistenta Materialelor", true);
//        Ionel.infoStudent();
//        Ionel.setNume("Adrian");
//        Ionel.infoPersoana();
//        Ionel.infoStudent();
        Ionel.mananca();
        Ionel.invata(10);
        Ionel.invata();
        Ionel.invata("biologie");
        Ionel.doarme();
        Ionel.sustineExamene();
        Ionel.mergeInClub();
        Ionel.prezentaCurs();

        System.out.println(" ");
        System.out.println("=== Exemplul Angajat ===");
        Angajat Teodor = new Angajat("Ionescu", 35,"Teodor", "Microsoft",
                3000.00, 5);
//        Teodor.infoAngajat();
//        Teodor.setSalariu(2000.0);
//        Teodor.infoPersoana();
//        Teodor.infoAngajat();
        Teodor.mananca();
        Teodor.marire("Senior");
        Teodor.marire(10.5);
        Teodor.marire("prima",500);
        Teodor.doarme();
        Teodor.primesteConcediu();
        Teodor.mergeLaMunca();
        Teodor.munceste();
        Teodor.primesteSalairu();

        System.out.println(" ");
        System.out.println("=== Exemplul StudentAngajat ===");
        StudentAngajat Elena = new StudentAngajat("Elena",22,"Pop","Florarie",
                2500.00,2,"UPB","Matematica",true);
        Elena.mergeInClub();
        Elena.sustineExamene();
        Elena.mergeLaMunca();
        Elena.primesteSalairu();
    }

}
