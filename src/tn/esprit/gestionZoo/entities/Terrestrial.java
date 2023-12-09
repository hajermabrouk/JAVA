package tn.esprit.gestionZoo.entities;

public final class Terrestrial extends Animal implements Omnivore<Food> {
   protected int nbrLegs;

   Terrestrial() {
   }

   public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
      super(family, name, age, isMammal);
      this.nbrLegs = nbrLegs;
   }
   @Override
  public void eatPlant(Food plant){
       if(plant.equals(Food.PLANT))
           System.out.println("Terrestrial animal est un herbivore");
       else
           System.out.println("Terrestrial animal n'est pas herbivore");
   }
   @Override
   public void eatMeat(Food meat){
       if(meat.equals(Food.MEAT))
           System.out.println("Terrestrial animal est carnivore");
       else
           System.out.println("Terrestrial animal n'est pas carnivore");
   }
 @Override
   public void eatPlantAndMeet(Food food){
     if(food.equals(Food.BOTH))
         System.out.println("Terrestrial animal est un omnivore ");
     else
       System.out.println("Terrestrial animal n'est  pas un omnivore ");
 }
}
