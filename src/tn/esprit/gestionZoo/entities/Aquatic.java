package tn.esprit.gestionZoo.entities;

public class Aquatic extends Animal{
   protected String habitat ;
   public Aquatic(){}
  public Aquatic(String family, String name, int age, boolean isMammal,String habitat){
       super(family,name,age,isMammal);
       this.habitat=habitat;
   }

    //instruction 23
   @Override
    public String toString() {
        return super.toString()+" " +habitat;
    }
    // instruction 24
    public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }
}

