package elektroshop;

import elektroshop.Spotreba;

public class Fridge {
    private String model;
    private Spotreba spotreba;
    private String znacka;
    private int rokvyroby;

    public Fridge(String model, String znacka, int rokvyroby, Spotreba spotreba) {
        this.model = model;
        this.znacka = znacka;
        this.rokvyroby = rokvyroby;
        this.spotreba = spotreba;
    }

    public void setRokvyroby(int rokvyroby) {
        this.rokvyroby = rokvyroby;
    }

    public int getRokvyroby() {
        return rokvyroby;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public String getZnacka() {
        return znacka;
    }

    public void setSpotreba(Spotreba spotreba) {
        this.spotreba = spotreba;
    }

    public Spotreba getSpotreba() {
        return spotreba;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }


    public void printInfo() {
        System.out.println("Fridge Information:");
        System.out.println("Year of Manufacture: " + rokvyroby);
        System.out.println("Brand of the fridge: " +  znacka);
        System.out.println("Model of fridge: " + model );
        if (Spotreba.A == spotreba) {
            System.out.println(+ rokvyroby+" : " + spotreba + "  - very low");
        }
        else if (Spotreba.B == spotreba) {
            System.out.println(+ rokvyroby+" : " + spotreba + "  - low");
        }
        else if (Spotreba.C == spotreba) {
            System.out.println(+ rokvyroby+" : " + spotreba + "  - normal");
        }
        else if (Spotreba.D == spotreba) {

                System.out.println(+ rokvyroby+" : " + spotreba + "  - above normal");

        }
        else if (Spotreba.E == spotreba) {
            System.out.println(+ rokvyroby+"  : " + spotreba + "  - high");
        }
        else if (Spotreba.F == spotreba) {
            System.out.println(+ rokvyroby+" : " + spotreba + " - very high");
        }
        else if (Spotreba.G == spotreba) {
            System.out.println(+ rokvyroby+" : " + spotreba + " - extremely high");
        }
    }
}
