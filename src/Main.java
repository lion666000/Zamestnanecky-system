import firmapozice.Manager;
import firmapozice.Tester;
import firmapozice.Vyvojar;
import firmapozice.Zamestnanec;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Zamestnanec> zamestnanec = new ArrayList<>();

        for (int i = 0;i<20;i--){
            System.out.println("Co chceš udělat?");
            System.out.println("1 - Přidat člověka");
            System.out.println("2 - idk");
            System.out.println("3 - Výpis");
            int a = sc.nextInt();
            sc.nextLine();
            switch (a){
                case 1:
                    System.out.println("Co chceš udělat?");
                    System.out.println("1 - Přidat Manager");
                    System.out.println("1 - Přidat Vyvojar");
                    System.out.println("1 - Přidat Tester");
                    int b = sc.nextInt();
                    sc.nextLine();
                    switch (b){
                        case 1:
                            System.out.println("Kolik managerů chceš přidat?");
                            int z = sc.nextInt();
                            sc.nextLine();
                            for (int gyat = 0;gyat<z;gyat++){
                                System.out.println("Jméno zaměstnance:");
                                String jmeno = sc.next();
                                System.out.println("Příjmení zaměstnance:");
                                String prijmeni = sc.next();
                                System.out.println("Pozice zaměstnance:");
                                String pozice = sc.next();
                                System.out.println("Plat zaměstnance:");
                                int plat = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Počet řízených zaměstnanců");
                                int prz = sc.nextInt();
                                sc.nextLine();

                                zamestnanec.add(new Manager(jmeno, prijmeni, pozice, plat, prz));
                            }
                            break;
                        case 2:
                            System.out.println("Kolik vyvojar chceš přidat?");
                            int h = sc.nextInt();
                            sc.nextLine();
                            for (int rizz = 0;rizz<h;rizz++){
                                System.out.println("Jméno zaměstnance:");
                                String jmeno = sc.next();
                                System.out.println("Příjmení zaměstnance:");
                                String prijmeni = sc.next();
                                System.out.println("Pozice zaměstnance:");
                                String pozice = sc.next();
                                System.out.println("Plat zaměstnance:");
                                int plat = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Jazyky:");



                                System.out.println("Kolik jazyků zná vývojář?:");
                                int pocetJazyku = sc.nextInt();
                                sc.nextLine();
                                String[] jazyky = {};
                                for(int g = 0;g<pocetJazyku;g++){
                                    System.out.println("Jazyk "+(g+1)+": ");
                                    jazyky[jazyky.length-1] = sc.next();
                                }


                                zamestnanec.add(new Vyvojar(jmeno, prijmeni, pozice, plat, jazyky));
                            }
                            break;
                        case 3:
                            System.out.println("Kolik managerů chceš přidat?");
                            int u = sc.nextInt();
                            sc.nextLine();
                            for (int ughh = 0;ughh<u;ughh++){
                                System.out.println("Jméno zaměstnance:");
                                String jmeno = sc.next();
                                System.out.println("Příjmení zaměstnance:");
                                String prijmeni = sc.next();
                                System.out.println("Pozice zaměstnance:");
                                String pozice = sc.next();
                                System.out.println("Plat zaměstnance:");
                                int plat = sc.nextInt();
                                sc.nextLine();
                                int pnc = 0;

                                zamestnanec.add(new Tester(jmeno, prijmeni, pozice, plat, pnc));
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1 - Tester našel chybu");

                    int l = sc.nextInt();
                    sc.nextLine();
                    switch (l){
                        case 1:
                            int q = 1;
                            for (Zamestnanec zam : zamestnanec){
                                System.out.print(q+ " - "); zam.vypisInfo();
                                q++;
                            }
                            System.out.println("Který tester našel chybu?");
                            int t = sc.nextInt();
                            sc.nextLine();
                            t--;

                            if (zamestnanec.get(t) instanceof Tester) {
                                Tester tester = (Tester) zamestnanec.get(t);
                                tester.naselJsemNovouChybu();
                            } else {
                                System.err.println("Neni tester");
                            }
                            break;

                    }
                    break;
                case 3:
                    System.out.println("1 - Počet managerů");
                    System.out.println("2 - Počet zaměsnanců");

                    int hawk_tuah = sc.nextInt();
                    sc.nextLine();
                    switch (hawk_tuah){
                        case 1:
                            int pm = 0;
                            for (Zamestnanec zam : zamestnanec){
                                if (zam instanceof Manager) {
                                    pm++;
                                }
                            }
                            System.out.println("Počet managerů: "+pm);

                            break;
                        case 2:
                            System.out.println("Počet zaměstnanců: "+zamestnanec.size());
                            break;
                        case 3:

                            for (Zamestnanec zam : zamestnanec){
                                if (zam instanceof Tester) {

                                }
                            }
                            System.out.println("Tester s nejvíce nalezenými chybami: ");
                            break;
                    }
                    break;

                default:
                    System.err.println("Špatně");
                    break;

            }
        }


    }
}