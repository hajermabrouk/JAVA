// instruction 5
class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
     // instruction 6
    public Animal(String family, String name, int age, boolean
            isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    // instruction 9
    public String toString() {
        return family + " " + name + " " + age + " " + isMammal;
    }

}

// instruction 5
public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    // instruction 6
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    boolean addAnimal(Animal animal) {   // instruction 10

     for (int i = 0; i < nbrCages; i++) {
         if (animals[i] == null) {
             animals[i] = animal;
             return true;
         }
     }
     return false;
 }
    public void displayZoo() { // instruction 8
        System.out.println("name: " + this.name + " city: " + this.city + " nbrCages: " + this.nbrCages);

    }

    public String toString() {  // instruction 9
        return name + " " + city + " " + nbrCages;
    }
    //instruction 11
    public void  afficherAnimal() { // instruction 11
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i]);
            }
        }
    }
    public int searchAnimal(Animal animal) { // instruction 11
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] == animal) {
                return i;
            }
        }
        return -1;
    }
    boolean addUniq(Animal animal) { //instruction 12

        for (int i = 0; i < nbrCages; i++) {
            if ((searchAnimal(animal)==-1)&&(animals[i]==null)) {
                animals[i] = animal;
                return true;
            }
        }
        return false;
    }
    boolean removeAnimal(Animal animal){ // instruction 13
   int indice=searchAnimal(animal);
            if (indice!=-1){
                animals[indice]=null;
               return true; // suppression réuissie
            }
        return false;
    }
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("belvidère", "tunis", 25); //instruction 7
        myZoo.displayZoo(); // instruction 8
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        Animal lion = new Animal("chiens", "loulou", 1, true); // instruction 7
        System.out.println(lion); // // instruction 9
        System.out.println(lion.toString()); // instruction 9
        Animal chat = new Animal("chats", "simba", 2, true); // instruction 7
        Animal chien = new Animal("chiots", "foufou", 2, true); // instruction 7

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(chat));
        myZoo.afficherAnimal(); // appel instruction 11
        System.out.println("l'indice est :"+ myZoo.searchAnimal(chat)); // appel instruction 11
        System.out.println(myZoo.addUniq(chien)); //appel instrurctin 12
        System.out.println(myZoo.addUniq(lion)); //appel instrurctin 12
        System.out.println(myZoo.removeAnimal(lion));
        myZoo.afficherAnimal();
    }
}

