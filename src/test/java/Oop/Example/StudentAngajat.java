package Oop.Example;

public class StudentAngajat extends Persoana implements StudentInterface,AngajatInterface{

    public String companie;
    public Double salariu;
    public Integer experienta;

    private String facultate;
    private String cursuri;
    private Boolean bursa;

    public StudentAngajat(String nume, Integer varsta, String prenume, String companie, Double salariu,
                          Integer experienta, String facultate, String cursuri, Boolean bursa) {
        super(nume, varsta, prenume);
        this.companie = companie;
        this.salariu = salariu;
        this.experienta = experienta;
        this.facultate = facultate;
        this.cursuri = cursuri;
        this.bursa = bursa;
    }

    public StudentAngajat(String nume, Integer varsta, String prenume) {
        super(nume, varsta, prenume);
    }


    @Override
    public void primesteSalairu() {
        System.out.println("Studenutul angajat primeste salariu mai mic.");
    }

    @Override
    public void mergeLaMunca() {
        System.out.println("Studenutul angajat munceste part-time.");
    }

    @Override
    public void munceste() {
        System.out.println("Studenutul angajat munceste mereu.");
    }

    @Override
    public void primesteConcediu() {
        System.out.println("Studenutul angajat nu are concediu.");
    }

    @Override
    public void doarme() {
        System.out.println("Studenutul angajat doarme cum apuca.");
    }

    @Override
    public void invata() {
        System.out.println("Studenutul angajat invata noaptea.");
    }

    @Override
    public void sustineExamene() {
        System.out.println("Studenutul angajat merge la examene obosit.");
    }

    @Override
    public void mergeInClub() {
        System.out.println("Studenutul angajat merge la club cand mai are timp.");
    }

    @Override
    public void prezentaCurs() {
        System.out.println("Studenutul angajat nu prea merge la cursuri.");
    }

    public String getFacultate() {
        return facultate;
    }

    public String getCursuri() {
        return cursuri;
    }

    public Boolean getBursa() {
        return bursa;
    }
}
