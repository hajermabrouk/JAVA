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

    final int nbrCages = 25; // instruction 14

    // instruction 6
    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }

    // instruction 10
    boolean addAnimal(Animal animal) {

        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }
        }
        return false;
    }

    // instruction 8
    public void displayZoo() {
        System.out.println("name: " + this.name + " city: " + this.city + " nbrCages: " + this.nbrCages);

    }

    // instruction 9
    public String toString() {
        return name + " " + city + " " + nbrCages;
    }

    //instruction 11
    public void afficherAnimal() {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i]);
            }
        }
    }

    // instruction 11
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] == animal) {
                return i;
            }
        }
        return -1;
    }

    //instruction 12
    boolean addUniq(Animal animal) {

        for (int i = 0; i < nbrCages; i++) {
            if ((searchAnimal(animal) == -1) && (animals[i] == null)) {
                animals[i] = animal;
                return true;
            }
        }
        return false;
    }

    // instruction 13
    boolean removeAnimal(Animal animal) {
        int indice = searchAnimal(animal);
        if (indice != -1) {
            animals[indice] = null;
            return true; // suppression réuissie
        }
        return false;
    }


    // instruction 15
    public int totalAnimals() {
        int nbrAnimaux = 0;
        for (Animal animal : animals) {
            if (animal != null)
                nbrAnimaux++;

        }
        return nbrAnimaux;
    }

    boolean isZooFull() {

        if (totalAnimals() == nbrCages) {
            System.out.println("le zoo est plein");
            return true;
        }
        return false;
    }

    //instruction 16
    public static Zoo CamparerZoo(Zoo z1, Zoo z2) {
    if (z1.totalAnimals()>z2.totalAnimals())
         return z1;
    else if (z1.totalAnimals()<z2.totalAnimals())
        return z2;
    else return null;
    }

    public static void main(String[] args) {
       Zoo myZoo1 = new Zoo("belvidère", "tunis"); //instruction 7
        Zoo myZoo2 = new Zoo("zoo", "Ariana"); //instruction 7

        myZoo1.displayZoo(); // instruction 8
        System.out.println(myZoo1);
        System.out.println(myZoo1.toString());
        Animal lion = new Animal("chiens", "loulou", 1, true); // instruction 7
        System.out.println(lion); // // instruction 9
        System.out.println(lion.toString()); // instruction 9
        Animal chat = new Animal("chats", "simba", 2, true); // instruction 7
        Animal chien = new Animal("chiots", "foufou", 2, true); // instruction 7
        Animal chat2 = new Animal("chiots", "simba2", 2, true); // instruction 7

        System.out.println(myZoo1.addAnimal(lion));
        System.out.println(myZoo2.addAnimal(chat));
        myZoo1.afficherAnimal(); // appel instruction 11
        System.out.println("l'indice est :"+ myZoo1.searchAnimal(chat)); // appel instruction 11
        System.out.println(myZoo1.addUniq(chien)); //appel instrurctin 12
        System.out.println(myZoo1.addUniq(lion)); //appel instrurctin 12
        System.out.println(myZoo1.addUniq(chat2));
        System.out.println(myZoo1.removeAnimal(lion));
        myZoo1.afficherAnimal();
        System.out.println(myZoo1.isZooFull());
        System.out.println("le zoo qui contient plus d'animaux :"+ Zoo.CamparerZoo(myZoo1,myZoo2));
    }
}