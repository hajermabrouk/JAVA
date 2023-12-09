package tn.esprit.gestionZoo.entities;

public sealed class Animal permits Aquatic,Terrestrial {
    private  String family;
    private   String name;
    private int age;
    private boolean isMammal;

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {   //instruction 18
        if (age>=0)
            this.age = age;
        else
            System.out.println("l'age ne doit pas etre négative");
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }



    public String getFamily() {
        return family;
    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public Animal(){}
    // instruction 6
    public Animal(String family, String name, int age, boolean
            isMammal) {
        this.family=family;     //instruction 18
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }
    // instruction 9
    public String toString() {
        return family + " " + name + " " + age + " " + isMammal;
    }
}