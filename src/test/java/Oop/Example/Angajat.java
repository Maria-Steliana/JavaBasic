package Oop.Example;

public class Angajat extends Persoana implements AngajatInterface{

    public String companie;
    public Double salariu;
    public Integer experienta;

    public Angajat(String nume, Integer varsta, String prenume, String companie, Double salariu, Integer experienta) {
        super(nume, varsta, prenume);
        this.companie = companie;
        this.salariu = salariu;
        this.experienta = experienta;
    }

    public void infoAngajat(){
        System.out.println("Angajatul " + getNume() + " lucreaza la compania " + companie);
        System.out.println("Angajatul " + getPrenume() + " are salariul de " + salariu + " euro.");
        System.out.println("Varsta angajatului " + getNume() + " " + getPrenume() +  " este " + getVarsta() + " si are experienta de " + experienta + " ani.");
    }

    @Override
    public void doarme() {
        System.out.println("Angajatul trebuie sa doarma cel putin 8h pe noapte pentru a putea lucra.");
    }



    // Polimorfism dinamic - a doua implementare a metodei
    public void mananca(){
        System.out.println("Angajatul mananca in pauza de masa");
    }

    public void marire(String grad){
        System.out.println("Angajatul este promovat la gradul de: " + grad);
    }

    public void marire(double procent){
        System.out.println("Angajatul primeste o maririe de:  " + procent + "%");
    }

    public void marire(String prima, int suma){
        System.out.println("Angajatul primeste o prima de:  " + prima + " in valoare de: " + suma);
    }


    public String getCompanie() {
        return companie;
    }

    public void setCompanie(String companie) {
        this.companie = companie;
    }

    public Double getSalariu() {
        return salariu;
    }

    public void setSalariu(Double salariu) {
        this.salariu = salariu;
    }

    public Integer getExperienta() {
        return experienta;
    }

    public void setExperienta(Integer experienta) {
        this.experienta = experienta;
    }

    @Override
    public void primesteSalairu() {
        System.out.println("Angajatul primeste salariu daca merge la munca.");
    }

    @Override
    public void mergeLaMunca() {
        System.out.println("Angajatul merge la munca pentru ca trebuie sa isi plateasca chiria");
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul munceste ca nu are incotro.");
    }

    @Override
    public void primesteConcediu() {

    }
}
