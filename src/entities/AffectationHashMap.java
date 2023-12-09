package entities;

import entities.Departement;
import entities.Employe;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    Map<Employe, Departement> map = new HashMap<>();

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        map.put(e, d);
    }

    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employe, Departement> entry : map.entrySet()) {
            System.out.println(entry.getKey().getNom() + ":" + entry.getValue().getNomDep());
        }
    }

    public void supprimerEmploye(Employe e) {
        map.remove(e);
        System.out.println("suppression effectuée");
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (map.containsKey(e) && map.get(e).equals(d)) {
            map.remove(e);
            System.out.println("suppression du employe" + e.getNom() + "qui travaille dans le departement" + d.getNomDep());
        } else {
            System.out.println("suppression non effectuée");
        }
    }

    public void afficherEmployes() {
        for (Employe e : map.keySet()) {
            System.out.println(e.getNom());
        }
    }

    public void afficherDepartements() {
        for (Departement d : map.values()) {
            System.out.println(d.getNomDep());
        }
    }

    public boolean rechercherEmploye(Employe e) {
        return map.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return map.containsValue(d);
    }

    Comparator<Employe> idComparator = new Comparator<Employe>() {
        @Override
        public int compare(Employe e1, Employe e2) {
            return e1.getIdentifiant() - e2.getIdentifiant();
        }
    };
       public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> treeMap = new TreeMap<>(idComparator);
        treeMap.putAll(map);
         return treeMap;
    }

}

