package firmapozice;

public class Tester extends Zamestnanec{
    private int pocetnalezenychChyb;

    public Tester(String jmeno, String prijmeni, String pozice, int plat, int pocetnalezenychChyb) {
        super(jmeno, prijmeni, pozice, plat);
        this.pocetnalezenychChyb = pocetnalezenychChyb;
    }

    public int naselJsemNovouChybu(){
        pocetnalezenychChyb++;
        return pocetnalezenychChyb;
    }

    public void vypisInfo(){
        System.out.println("Jmeno: " + jmeno+" Prijmeni: " + prijmeni+" Pozice: " + pozice+" Plat: " + plat + "Pcet nalezenych chyb: " + pocetnalezenychChyb);
    }
}
