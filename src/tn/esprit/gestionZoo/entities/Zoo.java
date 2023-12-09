package tn.esprit.gestionZoo.entities;


public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 3; // instruction 14
    private final int nbrAquatic = 10;
     //instruction 25
    public Aquatic[] aquaticAnimals= new Aquatic[nbrAquatic];
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setName(String name) {
        if (!name.isEmpty())
            this.name = name;
        else
            System.out.println("le nom ne doit pas etre une chaine vide");
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrCages() {
        return nbrCages;
    }


    // instruction 6
    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;         //instruction 18
        this.city = city;
    }

    // instruction 32/33/34
    public void addAnimal(Animal animal) throws ZooFullException , InvalidAgeException {

        if(totalAnimals()<nbrCages) {
            if (animal.getAge() < 0) {
                throw new InvalidAgeException("l'age ne doit pas etre négatif");
            }
            animals[totalAnimals()] = animal;
            int nbr = totalAnimals();
            nbr++;
        }else {
          throw new ZooFullException("le zoo est plein");
        }

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


    public boolean addUniq(Animal animal) {

       /* for (int i = 0; i < nbrCages; i++) {          //instruction 12
            if ((searchAnimal(animal) == -1) && (animals[i] == null)) {
                animals[i] = animal;
                return true;
            }
        }
        return false;
        */
        //instruction 17
        int nb = totalAnimals();
        if ((searchAnimal(animal) == -1) && (isZooFull() == false)) {
            animals[nb] = animal;
            return true;
        }

        return false;
    }


    // instruction 13
    public boolean removeAnimal(Animal animal) {
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

    public boolean isZooFull() {

        if (totalAnimals() == nbrCages) {
            System.out.println("le zoo est plein");
            return true;
        }
        return false;
    }

    //instruction 16
    public static Zoo CamparerZoo(Zoo z1, Zoo z2) {
        if (z1.totalAnimals() > z2.totalAnimals())
            return z1;
        else if (z1.totalAnimals() < z2.totalAnimals())
            return z2;
        else return null;
    }

    public int searchAquatic(Aquatic aquatic) {
        for (int i = 0; i <10; i++) {
            if (aquaticAnimals[i] == aquatic) {
                return i;
            }
        }
        return -1;
    }

    public void addAquaticAnimal(Aquatic aquatic) {    // instruction 26 (Ajout unique)
        for (int i = 0; (i <10) && (searchAquatic(aquatic) == -1); i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                System.out.println(" aquatic animal ajouté");
            }

        }


    }


    //instruction 27
    public void swimAquatic() {
        for (Aquatic aquatic : aquaticAnimals) {
            aquatic.swim();
        }
    }

    public float maxPenguinSwimmingDepth() {   //instruction 29
        float maxDepth = 0.f;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                if (((Penguin) aquatic).swimmingDepth > maxDepth)
                    maxDepth = ((Penguin) aquatic).swimmingDepth;
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {     //instruction 30
        int nbrPenguin = 0;
        int nbrDauphin = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin)
                nbrPenguin++;
            else
                nbrDauphin++;
        }
        System.out.println("le nombre de Penguin:" + nbrPenguin);
        System.out.println("le nombre de Dauphin:" + nbrDauphin);
    }

}


