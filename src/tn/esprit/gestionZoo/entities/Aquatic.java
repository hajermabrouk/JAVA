package tn.esprit.gestionZoo.entities;

public non-sealed abstract class  Aquatic extends Animal{

   protected String habitat ;
   public Aquatic(){}
    public abstract void swim();  // instruction 28
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
    /* public void swim(){
        System.out.println("This aquatic animal is swimming.");
    } */
    //instruction 31
    public boolean equals(Object object) {
        if (this == object) return true;
        if (null == object || getClass() != object.getClass()) return false;
        Aquatic aquatic =(Aquatic) object;
        return getAge() == aquatic.getAge() && getName().equals(aquatic.getName()) && habitat.equals(aquatic.habitat) ;

    }
}




