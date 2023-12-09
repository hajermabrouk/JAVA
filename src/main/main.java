package main;

import entities.Employe;
import entities.IGestion;
import entities.SocieteArrayList;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Employe employe1 = new Employe(1, "nawres", "ellafi", "gestion", 3);
        Employe employe2 = new Employe(2, "nana", "eeeee", "IT", 5);
        Employe employe3 = new Employe(3, "nnn", "ee", "bb", 4);

        IGestion<Employe> employes = new SocieteArrayList();
        employes.ajouterEmploye(employe1);
        employes.ajouterEmploye(employe2);
        employes.ajouterEmploye(employe3);
        employes.rechercherEmploye("nawres");
        employes.rechercherEmploye("nawres1");
        employes.rechercherEmploye(employe2);
        employes.supprimerEmploye(employe3);
        employes.displayEmploye();
        employes.trierEmployeParId();
        employes.displayEmploye();  // affichage trie par id
        employes.trierEmployeParNomDépartementEtGrade();
        employes.displayEmploye();    //affichage trie par nomdep et grade
    }
}
