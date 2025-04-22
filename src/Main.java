import firmapozice.Manager;
import firmapozice.Tester;
import firmapozice.Vyvojar;
import firmapozice.Zamestnanec;

public class Main {
    public static void main(String[] args) {


        Zamestnanec jarda = new Zamestnanec("Jarda", "Vrumda", "sklep", 12);
        Manager jirda = new Manager("Jirda", "Vyrda", "Mangir", 5000, 271000);
        Vyvojar jenda = new Vyvojar("Jenda", "Vendja", "Stresnik", 152, String[] Jazyky)
        Tester jordan = new Tester("Jordan", "Varda", "Opicka", 5000, 0);

        jarda.vypisInfo();
        jirda.vypisInfo();
        jenda.vypisInfo();
        jordan.vypisInfo();

        for (int i = 0;i<20;i++){
            jordan.naselJsemNovouChybu();
        }
        jordan.vypisInfo();
    }
}