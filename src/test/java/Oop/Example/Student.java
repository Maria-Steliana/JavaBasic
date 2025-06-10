package Oop.Example;

public class Student extends Persoana implements StudentInterface{

    private String facultate;
    private String cursuri;
    private Boolean bursa;

    public Student(String nume, Integer varsta, String prenume, String facultate, String cursuri, Boolean bursa) {
        super(nume, varsta, prenume); // apelez constructorul parintelui
        this.facultate = facultate;
        this.cursuri = cursuri;
        this.bursa = bursa;
    }

    public void infoStudent(){
        System.out.println("Studentul " + getNume() + " este student la facultatea " + facultate);
        System.out.println("Studentul " + getPrenume() + " are cursuri de " + cursuri);
        System.out.println("Varsta studentului cu numele " + getNume() + " " + getPrenume() +  " este " + getVarsta() + " si are/sau nu bursa " + bursa);
    }

    @Override
    public void doarme() {
        System.out.println("Studentul doarme cand nu invata pentru examene.");
    }

    // Polimorfism dinamic - a doua implementare a metodei
    public void mananca(){
        System.out.println("Studentul mananca cand are bani");
    }

    public void invata(){
        System.out.println("Studentul invata doar in sesiunie.");
    }

    @Override
    public void sustineExamene() {
        System.out.println("Studentul sustine examene in sesiune.");
    }

    @Override
    public void mergeInClub() {
        System.out.println("Studentul merge la petreceri.");
    }

    @Override
    public void prezentaCurs() {
        System.out.println("Studentul este prezent la cursurile obligatorii.");
    }

    public void invata(String cursuri){
        System.out.println("Studentul invata pentru cursul de " + cursuri);
    }

    public void invata(int timp){
        System.out.println("Studentul invata " + timp + " ore pe zi.");
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public String getCursuri() {
        return cursuri;
    }

    public void setCursuri(String cursuri) {
        this.cursuri = cursuri;
    }

    public Boolean getBursa() {
        return bursa;
    }

    public void setBursa(Boolean bursa) {
        this.bursa = bursa;
    }
}
