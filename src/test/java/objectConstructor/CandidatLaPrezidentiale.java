package objectConstructor;

public class CandidatLaPrezidentiale {
    public String nume;
    public Integer numarVoturi;

    public CandidatLaPrezidentiale(Integer numarVoturi, String nume) {
        this.numarVoturi = validareNumarVoturi(numarVoturi);
        this.nume = verificaNume(nume);
    }

    // O metoda pentru validarea numelui
    public String verificaNume(String nume){
        if(nume == null || nume.isEmpty()){
            return "Necunoscut";
        }
    return nume;
    }

    // O metoda pentru validarea numarului de voturi
    public Integer validareNumarVoturi(Integer numarVoturi){
        if (numarVoturi <= 5000){
            return 0;
        }
        return numarVoturi;
    }

    public String getNume() {
        return nume;
    }

    public Integer getNumarVoturi() {
        return numarVoturi;
    }
}
