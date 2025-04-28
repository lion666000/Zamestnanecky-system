package firmapozice;
import java.time.LocalDate;
import java.util.*;

public class Zamestnanec {
    public String jmeno;
    public String prijmeni;
    public String pozice;
    public int plat;
    private String datumNastupu;

    public Zamestnanec(String jmeno, String prijmeni, String pozice, int plat) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.pozice = pozice;
        this.plat = plat;
    }

    public void vypisInfo(){
        System.out.println("Jmeno: " + jmeno+" Prijmeni: " + prijmeni+" Pozice: " + pozice+" Plat: " + plat);
    }

    Scanner sc = new Scanner(System.in);

    public void vypoctiOdpracovaneDny(){
        System.out.println("Rok nástupu: ");
        int year = sc.nextInt();
        System.out.println("Měsíc nástupu: ");
        int month = sc.nextInt();
        System.out.println("Den nástupu: ");
        int day = sc.nextInt();
        LocalDate.of(year, month, day);
        System.out.println(LocalDate.of(year, month, day));
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public String getPozice() {
        return pozice;
    }

    public int getPlat() {
        return plat;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setPozice(String pozice) {
        this.pozice = pozice;
    }

    public void setPlat(int plat) {
        this.plat = plat;
    }
}
