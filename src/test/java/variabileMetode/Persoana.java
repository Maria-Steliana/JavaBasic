package variabileMetode;

import org.testng.annotations.Test;

public class Persoana {

    // O clasă în Java este o structura care definește atât atributele/variabilele, cât și metodele unui obiect
    // Atributele/variabilele -> pot fii asemănătoare unor proprietăți (ex: înălțime, greutate, aspect,etc),
    // Metodele -> asemănătoare unor comportamente/acțiuni (ex: mănâncă, merge, aleargă, etc.)
    // Tipurile de date în Java sunt de 2 feluri:
    // (a) primitive = stochează direct valoarea în variabilă. Sunt 8 tipuri de date:
    // - byte = 8 bits
    // - short = 16 bits
    // - int = 32 bits
    // - long = 64 bits
    // - double = numere zecimale
    // - float = numere zecimale, dar cu precizie mai mica, adica cu virgulă
    // - char = caractere individuale (in general, litere)
    // - boolean = valori logice (True sau False)
    // (b) ne-primitive (de referință) -> stochează doar referința (adresa din memorie) către un obiect:
    // - clase
    // - interfețe
    // - arrays

    // Variabilele pot fi:
    // (a) globale (de instanta) - toate metodele din clasa pot folosi variabila
    // (b) locale (din interiorul metodelor)

    // Metoda = bloc de cod care îndeplinește o funcție specifică (acțiune/comportament). Sunt 2 tipuri:
    // (a) fără return (sau void) - rulează doar logica din interior și nu returnează nimic
    // modificator de acces (public/private/protected) void numeleMetodei (cu parametrii sau fără) {
    // logica / corpul metodei
    // }

    // (b) cu return - returnează un tip de date specific
    // modificator de acces (public/private/protected) tipulReturnat(int/string) numeleMetodei (cu parametrii sau fără) {
    // logica / corpul metodei
    // return valoarea tipului returnat
    // }

    // declaram variabile globale (de instanta)
    String numelePersoanei = "Popescu";
    String prenumelePersoanei = "Adrian";
    char sexulPersoanei = 'M';
    int anDeNastere = 2000;


    // metoda de test
    @Test // annotare
    public void afisareVariabileGlobaleTest() {
        System.out.println("Persoana are numele: " + numelePersoanei);
        System.out.println("Persoana are prenumele: " + prenumelePersoanei);
        System.out.println("Persoana e de sexul: " + sexulPersoanei);
    }

    @Test
    public void afisareDetaliiPersoana() {
        // declaram niște variabile locale   CTRL+ALT+L -> aliniaza frumos totul
        double inaltimeaPersoanei = 1.85;
        int varstaPersoanei = 28;
        String adresaPersoanei = "Strada Ana Ipatescu n.126";

        System.out.println("Detaliile persoanei sunt: ");

        System.out.println("Persoana are numele: " + numelePersoanei);
        System.out.println("Persoana are prenumele: " + prenumelePersoanei);
        System.out.println("Persoana e de sexul: " + sexulPersoanei);

        System.out.println("Inaltimea persoanei este: " + inaltimeaPersoanei);
        System.out.println("Varsta persoanei este: " + varstaPersoanei);
        System.out.println("Adresa persoanei este: " + adresaPersoanei);

    }

    @Test
    public void afisareDateProfesionale() {
        System.out.println("Varsta actuala a persoanei este: " + calculeazaVarsta(2025));
        System.out.println("Persoana este adulta? " + esteAdult(16));
        System.out.println("Persoana este adulta? " + esteAdult(calculeazaVarsta(2023)));
    }

    public int calculeazaVarsta(int anulActual){

        return anulActual - anDeNastere;
    }

    public boolean esteAdult(int varsta){

        return varsta >= 18;
    }
}
