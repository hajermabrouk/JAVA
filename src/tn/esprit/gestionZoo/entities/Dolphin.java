package tn.esprit.gestionZoo.entities;

public class Dolphin extends Aquatic {
    protected float swimmmingSpeed ;
    Dolphin(){}
    public Dolphin(String family, String name, int age, boolean isMammal,String habitat,float swimmmingSpeed){
        super(family,name,age,isMammal,habitat);
        this.swimmmingSpeed=swimmmingSpeed;
    }
     // instruction 23
    @Override
    public String toString() {
        return super.toString() +" "+swimmmingSpeed;
    }
    // instruction 24
    public void swim(){
        System.out.println("This dolphin is swimming.");
    }
}
