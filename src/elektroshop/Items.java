package elektroshop;
import autosaloon.Car;
import autosaloon.Condition;

import java.util.Comparator;
import java.util.Scanner;
public class Items {
    private Fridge[] items;
    Scanner scanner = new Scanner(System.in);


    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu ledniček. A ty prida do pole items.
     *
     * @param count - pozadovany pocet lednicek
     */
    public void addItems(int count) {
        items = new Fridge[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Adding " + i + " to the fridge");

            System.out.print("Enter the manufacture year of the fridge: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter the fridge brand: ");
            String name = scanner.nextLine();
            System.out.print("Enter the fridge model: ");
            String model = scanner.nextLine();
            System.out.print("Enter the energy waste of the fridge(A,B,C,D,E,F,G): ");
            String conditionString = scanner.nextLine().toUpperCase();
            Spotreba condition = Spotreba.valueOf(conditionString);
            //nacti od uzivatele míru spotreby a rok výroby ledničky
            //pridej lednicku do pole lednicek


            items[i] = new Fridge(model, name, year, condition);
        }
    }


    /**
     * Tato metoda vypise informace o lednickach. Na prvnim rádku bude text "-----INFO O LEDNICKACH----- ",
     * na dalsich radkach bude vzdy rok vyroby lednick, dvojtecka a popis spotreby. (Vyuzijte metodu printInfo() tridy Fridge.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo() {
        System.out.println("-----INFO O LEDNICKACH-----");
        if (items != null) {
            for (Fridge fridge : items) {
                if (fridge != null) {
                    fridge.printInfo();
                }
            }
        }

        System.out.println("--------------");
    }


    public void printA() {
        boolean A = false;
        for (Fridge fridge : items) {
            if (fridge.getSpotreba() == Spotreba.A) {
                A = true;
                System.out.println("-----A Energy Waste-----");
                fridge.printInfo();
                System.out.print("--------------------------");


            } else {
                System.out.println("-----Not A Energy Waste-----");
                System.out.println("----------------------------");
            }
        }
    }

    public void pocet() {
        int length = items.length;
        System.out.print("Number of fridge: " + length + "\n");


    }

    public void Zajimavosti() {
        System.out.println("----------Interests of Fridges-----------");


        int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0, countF = 0, countG = 0;

        for (Fridge fridge : items) {
            switch (fridge.getSpotreba()) {
                case A:
                    countA++;
                    break;
                case B:
                    countB++;
                    break;
                case C:
                    countC++;
                    break;
                case D:
                    countD++;
                    break;
                case E:
                    countE++;
                    break;
                case F:
                    countF++;
                    break;
                case G:
                    countG++;
                    break;
            }
        }
        System.out.println("Number of all Fridges"+"\n");
       pocet();
        System.out.println("A: " + countA);
        System.out.println("B: " + countB);
        System.out.println("C: " + countC);
        System.out.println("D: " + countD);
        System.out.println("E: " + countE);
        System.out.println("F: " + countF);
        System.out.println("G: " + countG);
        System.out.println("-----------------------------------------");
    }


}
