package autosaloon;

public class Car {
  private Condition stavAuta;
  private String barva;
  private int najeto;
  private int rokVyroby;
  public Car( Condition stav, String barva, int najeto, int rokVyroby) {
      this.stavAuta = stav;
      this.barva = barva;
      this.najeto = najeto;
      this.rokVyroby = rokVyroby;
  }
     public Condition getStavAuta() {
      return stavAuta;
     }

    public int getRokVyroby() {
        return rokVyroby;
    }

    public int getNajeto() {
        return najeto;
    }

    public String getBarva() {
        return barva;
    }
    public void printInfo(){
      System.out.println("Stav Auta: " + stavAuta);
        System.out.println("");
      System.out.println("Barva: " + barva);
        System.out.println("");
      System.out.println("Najeto: " + najeto);
        System.out.println("");
      System.out.println("Rok Vyroby: " + rokVyroby);
      System.out.println("");
    }
}
