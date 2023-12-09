package entities;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class DepartementHashSet implements IDepartement<Departement> {

    Set <Departement> hashset=new HashSet<>();
    @Override
    public void ajouterDepartement(Departement departement) {
    hashset.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for(Departement set:hashset){
            if(set.getNomDep().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
     return hashset.contains(departement);

    }
    @Override
    public void supprimerDepartement(Departement departement) {
        if(hashset.remove(departement))
            System.out.println("le département est supprimé");
        else
            System.out.println("le département n'existe pas");
    }
    @Override
    public void displayDepartement() {
        Iterator<Departement> it = hashset.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet treeset = new TreeSet<>();
        treeset.addAll(hashset);
        return  treeset;
    }
}
