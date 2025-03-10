package cinema;

import elektroshop.Fridge;
import elektroshop.Spotreba;

import java.util.Scanner;

public class Film {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private int year;
    private People[] actors;
    private String city;
    private People director;

      public Film (String name, int year) {
          this.name = name;
          this.year = year;

      }
    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu hercu. A ty prida do pole actors.
     * @param count - pozadovany pocet hercu
     */
    public void addActors(int count) {
        actors = new People[count];

        for (int i=0; i<count; i++){
            System.out.println("Adding actor " + i + " to the film");

            System.out.println("Name of the actor: ");
            String name = scanner.nextLine();
            System.out.println("Birth city: ");
            String city = scanner.nextLine();
            System.out.println("Gender(MALE,FEMALE): ");
            scanner.nextLine();
            String conditionString = scanner.nextLine().toUpperCase();
            Gender gender = Gender.valueOf(conditionString);
            //nacti od uzivatele jmeno, rodne mesto a pohlavi herce
            //pridej herce do pole hercu
            actors[i] = new People(name,city,gender);
        }

    }

    /**
     * Tato metoda vypise informace o filmu. Na prvnim rádku bude text "-----INFO O FILMU----- ", na druhem bude nazev, rok vydani filmu.
     * Na tretim radku bude text "herci" a následne budou vypsani vsichni herci oddeleni od sebe carkou a to ve formatu "jmeno - pohlavi" (Vyuzijte metodu printInfo() tridy People.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo(){
        System.out.println("-----INFO O FILMU-----");
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Actors " + actors.length);
        System.out.println("-----");
    }
    public void genderCount(){

    int countMale = 0, countFemale = 0;



    for (People people : actors){


                 switch (people.getGender()) {
                     case MALE:
                         countMale++;
                         break;
                     case FEMALE:
                         countFemale++;
                         break;


                 }

         System.out.println("Male actor: " + countMale);
        System.out.println("Female actor: " + countFemale);


    }

}
}