package tn.esprit.gestionZoo.entities;

public final class Terrestrial extends Animal {
   protected int nbrLegs;
   Terrestrial(){}
   public Terrestrial(String family, String name, int age, boolean isMammal,int nbrLegs)
   {  super(family,name,age,isMammal);
      this.nbrLegs=nbrLegs;}

}
