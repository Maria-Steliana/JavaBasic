package objectConstructor;

public class Avion {

    // Constructorul are rolul de a initia variabilele unei clase
    // Recunoastem un constructor dupa numele clasei
    // Intr-o clasa putem avea 'n' constructori care se diferentiaza dupa parametri
    // Intr-o clasa exista intotdeauna un constructor default (fara parametri)
    // Constructorul trebuie sa fie public
    // Obiect = instanta unei clase
    // Dintr-o clasa putem sa facem mai multe obiecte
    // Ca sa initializezi un obiect folosim cuvantul cheie "new"
    // Cand se initializeaza un obiect se apeleaza constructorul clasei

    public String marca;
    public String model;
    public String tip;
    public String taraOrigine;
    public Integer capacitatePasageri;
    public Integer bagaje;
    public Integer echipajAvion;

    public Avion(String marca, String model, String tip, String taraOrigine, Integer capacitatePasageri, Integer bagaje, Integer echipajAvion){
        this.marca = marca;
        this.model = model;
        this.tip = tip;
        this.taraOrigine = taraOrigine;
        this.capacitatePasageri = capacitatePasageri;
        this.bagaje = bagaje;
        this.echipajAvion = echipajAvion;

    }

    public Avion(String marca, String model, String tip, String taraOrigine, Integer capacitatePasageri, Integer echipajAvion){
        this.marca = marca;
        this.model = model;
        this.tip = tip;
        this.taraOrigine = taraOrigine;
        this.capacitatePasageri = capacitatePasageri;
        this.echipajAvion = echipajAvion;

    }

    public void infoAvion(){
        System.out.println("Marca avionului este: " + marca);
        System.out.println("Modeulul avionului este: " + model);
        System.out.println("Tipul avionului este: " + tip);
        System.out.println("Tara de origine a avionului este: " + taraOrigine);
        System.out.println("Caapacitatea pasagerilor in avion este de: " + capacitatePasageri);
        System.out.println("Echipajul avionului contine: " + echipajAvion + " membri");
        if(bagaje != null) {
            System.out.println("Numarul de bagaje suportat de avion este: " + bagaje);
        }
        else{
            System.out.println("Avionul nu are bagaje.");
        }
    }


}
