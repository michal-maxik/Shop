package library;

import java.util.Scanner;

public class Magazin implements IItem{
    Scanner sc = new Scanner(System.in);
private int pocetStran;
private String nazev;
private String jmeno;

    public Magazin() {
        System.out.println("Jak se magazín jmenuje: ");
        String jmeno=sc.nextLine();
        System.out.println("Kolik má magazín stran: ");
        int strana=sc.nextInt();
        sc.nextLine();
        System.out.println("Vydavatelsvý se jmenuje :");
        String vydavatel =sc.nextLine();
        this.nazev = jmeno;
        this.jmeno = vydavatel;
        this.pocetStran = strana;
    }
    public int getPocetStran() {
        return pocetStran;
    }
    public void setPocetStran(int pocetStran) {
        this.pocetStran = pocetStran;
    }

    public String getNazev() {
        return nazev;
    }
    public void setNazev(String nazev) {
        this.nazev = nazev;
    }
    public String getJmeno() {
        return jmeno;
    }
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    @Override
    public void printDelka() {
        System.out.println("Magazín má " + pocetStran + " stran.");
    }

    @Override
    public void printInfo() {
       System.out.println("Magazín se jmenuje " + nazev + " má " + pocetStran + " stran a vydává ho " + jmeno );
    }
}
