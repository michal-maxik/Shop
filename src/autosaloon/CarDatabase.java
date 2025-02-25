
package autosaloon;
import java.util.Scanner;
public class CarDatabase {

   private String owner;
     private Car[] cars;
      Scanner scanner = new Scanner(System.in);
     public CarDatabase( String owner  ) {
          this.owner = owner;
     }

    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu aut. A ty prida do pole aut.
     * @param count - pozadovany pocet aut
     */
    public void addCars(int count) {
         cars = new Car[count];
        for (int i=0; i<count;i++){
            System.out.println("Adding car " + i+1 + " to the database");


            System.out.print("Enter year of manufacture: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter mileage (km): ");
            int mileage = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter color: ");
            String color = scanner.nextLine();

            System.out.print("Enter car condition (good, excellant, bad, demaged): ");

            String condice = scanner.nextLine().toLowerCase();
           Condition c=  Condition.valueOf(condice);


            cars[i] = new Car(c,color,mileage,year);
        }
            // :D nacti od uzivatele rok vyroby, pocet najetych km, barvu a stav auta
            // :D vytvor instanci auta - nutno upravit i tridu Car, chceme instanci nastavit atributy na nactene hodnoty od uzivatele
            // :D pridej auto do pole aut
        }
    public void printCarInGoodCondition(){
        for (int i=0; i<cars.length; i++){
            if(cars[i].getStavAuta() == Condition.good) {
                System.out.println(cars[i].toString());
                cars[i].printInfo();
            }
            else{
                System.out.println("");
            }
        }

    }


    public void MostKM(){
        int mostKm;
        mostKm = scanner.nextInt();

        System.out.println(cars[mostKm].toString());
        }

    }


    /**
     * Vypise vsechna auta, jejijz stav je "good". Vypis bude ve formatu: Na prvnim radku bude vypis: Dobra auta jsou: .
     * Na kazdem dalsim radku bude vypis informaci o jednom aute - pouzij mezodu printInfo() tridy Car
     */

