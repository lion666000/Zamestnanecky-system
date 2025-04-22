package firmapozice;

public class Vyvojar extends Zamestnanec{
    private String[] Jazyky;

    public Vyvojar(String jmeno, String prijmeni, String pozice, int plat,String[] Jazyky) {
        super(jmeno, prijmeni, pozice, plat);
        this.Jazyky = Jazyky;
    }

    public void JazykyToString() {
        String[] jazyky = new String[];

    }

    public void vypisInfo(){
        System.out.println("Jmeno: " + jmeno+" Prijmeni: " + prijmeni+" Pozice: " + pozice+" Plat: " + plat + "Jazyky: " + Jazyky[0]);
    }

}
