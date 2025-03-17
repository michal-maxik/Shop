package library;

import java.util.Scanner;

public class Book implements IItem{
    Scanner sc = new Scanner(System.in);
private String nazev;
private String autor;
private int pocetStran;

    public Book() {
        System.out.println("Jak se kniha jmenuje: ");
        String jmeno=sc.nextLine();
        System.out.println("Kolik má kniha stran: ");
        int strana=sc.nextInt();
        sc.nextLine();
        System.out.println("Autor knihy je :");
        autor=sc.nextLine();
        this.nazev = jmeno;
        this.autor = autor;
        this.pocetStran = strana;
    }

    public void setPocetStran(int pocetStran) {
        this.pocetStran = pocetStran;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public int getPocetStran() {
        return pocetStran;
    }

    public String getAutor() {
        return autor;
    }

    public String getNazev() {
        return nazev;
    }
    public void printDelka(){
        System.out.println("Kniha má " + pocetStran + " stran.");
    }
    public void printInfo(){
        System.out.println("Kniha s názvem " + nazev+ " má " +pocetStran + " stran a napsal/a ji " + autor);

    }
}
