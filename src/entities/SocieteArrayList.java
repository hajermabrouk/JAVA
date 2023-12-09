package entities;

import java.util.*;

public class SocieteArrayList implements IGestion<Employe>{
    List<Employe> employes=new ArrayList<>();
     @Override
    public void ajouterEmploye(Employe employe){
         employes.add(employe);

     }
    @Override
    public boolean rechercherEmploye(String nom){

         for(Employe employe :employes){
             if (employe.getNom().equals(nom)){
                 return true;
             }
         }
         return false;
    }
    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }
    @Override
    public void supprimerEmploye(Employe employe) {
       if (employes.remove(employe))
        System.out.println("la liste des employés aprés suppression" +employes);

       else
           System.out.println("l'element ne setrouve pas ");
    }
    @Override
    public void displayEmploye() {
        System.out.println("la liste des employés"+employes);
    }
    @Override
    public void trierEmployeParId() {
     Collections.sort(employes);
    }

    Comparator<Employe> nomDepComparator = new Comparator<Employe>() {
         @Override
        public int compare(Employe e1, Employe e2) {
            return e1.getNomdep().compareTo(e2.getNomdep());
        }
    };
    Comparator<Employe> gradeComparator = new Comparator<Employe>() {
        @Override
        public int compare(Employe e1, Employe e2) {
            return e1.getGrade()-e2.getGrade();
        }
    };
    @Override
    public void trierEmployeParNomDépartementEtGrade() {
   Collections.sort(employes,nomDepComparator.thenComparing(gradeComparator));
    }
}
