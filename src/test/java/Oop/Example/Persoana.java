package Oop.Example;

public abstract class Persoana {

    private String nume;
    private String prenume;
    private Integer varsta;

    public Persoana(String nume, Integer varsta, String prenume) {
        this.nume = nume;
        this.varsta = varsta;
        this.prenume = prenume;
    }

    public void infoPersoana(){
        System.out.println("Numele persoanei este: " + nume);
        System.out.println("Prenumele persoanei este: " + prenume);
        System.out.println("Varsta persoanei este: " + varsta);
    }

    // fortam implementarea actiunii in clasele copil (angajat si student)
    public abstract void doarme();

    // Polimorfism dinamic - prima implementare a metodei
    public void mananca(){
        System.out.println("Persoana mananca de plictiseala");
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}
