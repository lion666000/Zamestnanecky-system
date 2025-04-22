package firmapozice;

public class Vyvojar extends Zamestnanec{
    private String[] jazyky;

    public Vyvojar(String jmeno, String prijmeni, String pozice, int plat,String[] jazyky) {
        super(jmeno, prijmeni, pozice, plat);
        this.jazyky = jazyky;
    }


    public void vypisInfo(){
        System.out.println("Jmeno: " + jmeno+" Prijmeni: " + prijmeni+" Pozice: " + pozice+" Plat: " + plat + " Jazyky: " + jazyky);
    }

}
