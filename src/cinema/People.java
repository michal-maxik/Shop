package cinema;

public class People {
    private String name;
    private String rodMesto;
    private Gender gender;

    public People(String name, String rodMesto, Gender gender) {
        this.name = name;
        this.rodMesto = rodMesto;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRodMesto() {
        return rodMesto;
    }

    public void setRodMesto(String rodMesto) {
        this.rodMesto = rodMesto;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void printInfo(){
        System.out.println( name +" - " + gender);
    }





















}
