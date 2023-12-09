package tn.esprit.gestionZoo.entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    Penguin() {
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString()+" "+swimmingDepth;
    }
    @Override
    public void swim(){

        System.out.println("This penguin is swimming.");
    } //instruction 28
}

