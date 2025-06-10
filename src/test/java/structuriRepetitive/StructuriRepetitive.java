package structuriRepetitive;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StructuriRepetitive {

    @Test
    public void testMethod(){

        colegiDeCursArray();
        colegiDeCursLista();
        afisareHashMap();
        afisareHashMapv2();

    }
// - In Java un array (multime) este o structura de date care stocheaza o colectie de elemente de acelasi tip, fie primitive, fie obiecte
// - Dimensiunea este fixa, odata ce este creata multimea, dimensiunea nu se poate schimba
// - Elementele trebuie sa fie de acelasi tip si accesul la elemente se face prin indexul acestora

    public void colegiDeCursArray() {

        // Cream o multime de stringuri
        String[] colegi = new String[7];
        colegi[0] = "Marius";
        colegi[1] = "Eugen";
        colegi[2] = "Gigi";
        colegi[3] = "Hilda";
        colegi[4] = "Gabi";
        colegi[5] = "Sanziana";
        colegi[6] = "Razvan";

        System.out.println("Exemplul multimi");
// "For" este o structura de control utilizata pt a itera o secventa de instructiuni sau pt a parcurge un anumit interval de valori
// Structura
// for (initializare; conditie: incrementare/decrementare){
// bloc de cod care va fi executat repetat
// }
        for(int index=0; index< colegi.length; index++) {
            System.out.println("Numele colegului de la numarul " + index + " este: " + colegi[index]);
        }

    }

    public void colegiDeCursLista(){
        // Listele sunt o colectie ordonata de elemente de acelasi tip
        // Elementele sunt stocate in ordinea in care sunt adaugate
        // Accesarea elementelor se face tot prin index
        // Elementele unei liste pot fi parcurse folosind bucle sau iteratori
        // In liste sunt permise elemente duplicate
        // In Java sunt mai multe clase care implementeaza listele cele mai comune folosite sunt ArrayList si LinkedList

        // Exemplu lista

        List<String> colegiLista = new ArrayList<>();
        colegiLista.add("Maria");
        colegiLista.add("Calin");
        colegiLista.add("Petronela");
        colegiLista.add("Gabriel");
        colegiLista.add("Adrian");
        colegiLista.add("Demetra");

        // "While" este o structura de control utilizata pentru a executa repetat un bloc de cod atata timp cat o anumita conditie este adevarata
        // In timp ce structura "For" este utilizata pentru a itera printr-o secventa de instructiuni un numar cunoscut de iteratii
        // Structura "While" este folosita atunci cand numarul de iteratii nu este cunoscut in avans dar se stie doar conditia

        // Sintaxa
        // Initializare index
        // while (conditia){
        // bloc de cod (care va fi executat atata timp cat conditia e adevarata)
        // incrementare/decrementare
        // }

        System.out.println("Exemplul lista");

        int index = 0;
        while(index< colegiLista.size()) {

            System.out.println("Numele colegului de la numarul " + index + " este: " + colegiLista.get(index));
            index++;
        }
    }

    public void afisareHashMap() {
        // Hashmap ofera o implementare a unei colectii de tip pereche (cheie-valoare)
        // Intr-un hashmap cheile sunt unice nu pot exista duplicate fiecare cheie poate fi asociata cu cel mult o valoare

        HashMap<String, String> categorieObiecte = new HashMap<>();
        categorieObiecte.put("fructe", "mar");
        categorieObiecte.put("animale", "urs");
        categorieObiecte.put("flori", "liliac");

        System.out.println("Exemplul Hashmap");

        // "Foreach" este o structura de control cunoscuta si sub denumirea de enhancedforloop
        // Se utilizeaza pentru a itera o colectie fara sa fie nevoie de un iterator explicit sau sa se lucreze cu indici
        // Sintaxa:
        // for-foreach (tip element numeElement: colectia){
        // bloc de cod (care o sa fie executat pentru fiecare element din colectie)
        // }

        for (String key: categorieObiecte.keySet()){

            System.out.println("Categoria este: " + key + ", iar valoarea este: " + categorieObiecte.get(key));

        }
    }

    public void afisareHashMapv2(){

        System.out.println("Exemplul Hashmap2");

        HashMap<String, List<String>> tariOrase = new HashMap<>();

        // Adaugam 3 seturi de liste pe care le vom folosi in hashmap
        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Targu Mures");
        oraseRomania.add("Cluj Napoca");
        oraseRomania.add("Ploiesti");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Valencia");
        oraseSpania.add("Madrid");
        oraseSpania.add("Barcelona");

        List<String> oraseUSA = new ArrayList<>();
        oraseUSA.add("New York");
        oraseUSA.add("Chicago");
        oraseUSA.add("Las Vegas");

        // Adaugam valorile in hashmap
        tariOrase.put("Romania", oraseRomania);
        tariOrase.put("Spania", oraseSpania);
        tariOrase.put("USA", oraseUSA);

        for(String key: tariOrase.keySet()){
            System.out.println("Tara este " + key + ", iar orasele sunt: " + tariOrase.get(key));
        }
    }


}
