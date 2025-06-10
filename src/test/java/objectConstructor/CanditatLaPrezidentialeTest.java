package objectConstructor;

import org.testng.annotations.Test;

public class CanditatLaPrezidentialeTest {
    @Test
    public void verificatPresedinte(){
        System.out.println("==== Exemplul 1 ====");
        CandidatLaPrezidentiale candidatPromitator = new CandidatLaPrezidentiale(10000, "Ionescu");
        System.out.println("Numele canditatului este " + candidatPromitator.getNume() + " cu numar de voturi de: " + candidatPromitator.getNumarVoturi());
        System.out.println(" ");
        System.out.println("==== Exemplul 2 ====");
        CandidatLaPrezidentiale candidatPromitator2 = new CandidatLaPrezidentiale(2000, "Popescu");
        System.out.println("Numele canditatului este " + candidatPromitator2.getNume() + " cu numar de voturi de: " + candidatPromitator2.getNumarVoturi());
        System.out.println(" ");
        System.out.println("==== Exemplul 3 ====");
        CandidatLaPrezidentiale candidatPromitator3 = new CandidatLaPrezidentiale(300, "");
        System.out.println("Numele canditatului este " + candidatPromitator3.getNume() + " cu numar de voturi de: " + candidatPromitator3.getNumarVoturi());
    }
}
