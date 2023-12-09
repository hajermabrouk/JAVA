package tn.esprit.gestionZoo.main;

import tn.esprit.gestionZoo.entities.*;

import java.sql.SQLOutput;


public class Main {

    public static void main(String[] args) {
        Zoo myZoo1 = new Zoo("belvidère", "tunis"); //instruction 7
        Zoo myZoo2 = new Zoo("zoo", "Ariana");
        Zoo myZoo5 = new Zoo();
        myZoo5.setName("");  // tester instructin 18
        myZoo5.setCity("tunis");
        myZoo1.displayZoo(); // instruction 8
        System.out.println(myZoo1);
        System.out.println(myZoo1.toString());
        Animal lion = new Animal("chiens", "loulou", 1, true); // instruction 7
        System.out.println(lion); // // instruction 9
        System.out.println(lion.toString()); // instruction 9
        Animal chat = new Animal("chats", "simba", 2, true);
        Animal chien = new Animal("chiots", "foufou", 2, true);
        Animal chat2 = new Animal("chiots", "simba2", 2, true);
        Animal chien2 = new Animal("chiots", "foufou2", 3, true);
        Animal chien3 = new Animal();//  tester instruction 18
        chien3.setName("foufou3");
        chien3.setFamily("chiots");
        chien3.setAge(-2);  // tester instruction 18
        chien3.setMammal(true);
        System.out.println(myZoo1.addAnimal(lion));
        System.out.println(myZoo2.addAnimal(chat));
        myZoo1.afficherAnimal(); // appel instruction 11
        System.out.println("l'indice est :"+ myZoo1.searchAnimal(chat)); //  instruction 11
        System.out.println(myZoo1.addUniq(chien)); //instrurctin 12
        System.out.println(myZoo1.addUniq(lion)); // instrurctin 12
        System.out.println(myZoo1.addUniq(chat2));
        System.out.println(myZoo1.addUniq(chien2));
        System.out.println(myZoo1.removeAnimal(lion));
        myZoo1.afficherAnimal();
        System.out.println(myZoo1.isZooFull());
        System.out.println("le zoo qui contient plus d'animaux :"+ Zoo.CamparerZoo(myZoo1,myZoo2));
        // instruction 21
        /*Aquatic aquatic1= new Aquatic();
        Dolphin dolphin1 = new Dolphin();
        Penguin penguin1 = new Penguin();
        Terrestrial terrestrial1= new Terrestrial();*/
        //instruction 22
        Aquatic aquatic1= new Aquatic("chats", "simba", 2, true,"habitat");
        Dolphin dolphin1 = new Dolphin("chiots", "foufou", 2, true,"habitat",15.5f);
        Penguin penguin1 = new Penguin("chiots", "foufou", 2, true,"habitat",1.5f);
        Terrestrial terrestrial1= new Terrestrial("chats", "simba", 2, true,4);
        // instruction 23
        System.out.println(aquatic1.toString());
        System.out.println(dolphin1.toString());
        System.out.println(penguin1.toString());
        //instruction 24
        aquatic1.swim();
        dolphin1.swim();
        penguin1.swim();





    }
}
