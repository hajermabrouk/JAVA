package entities;

import java.util.Comparator;

public class Employe implements Comparable<Employe> {
  public  int identifiant;
    public String nom;
    public String prenom;
    public  String nomDep;
    public int grade;
 public Employe(){};
    public Employe(int identifiant, String nom, String prenom, String nomdep, int grade) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDep = nomdep;
        this.grade = grade;
    }
    public int getIdentifiant() {
        return identifiant;
    }
    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getNomdep() {
        return nomDep;
    }
    public void setNomdep(String nomdep) {
        this.nomDep = nomdep;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    @Override
    public boolean equals(Object obj){
        if (obj==null)
            return false;
        if(obj==this)
            return true;
        if(obj instanceof Employe e) {
          return e.identifiant==identifiant && nom.equals(e.nom);
        }
        return false;
    }
    @Override
    public String toString(){
 return "Employe: identifiant=" +identifiant +",nom= "  + nom +  ",prenom= "  + prenom +  ",nomdeparetement= "  + nomDep +  ",grade= " + grade ;
    }

    @Override
    public int compareTo(Employe employe) {
        return this.identifiant - employe.identifiant;
    }
    public int hashCode(){
        return identifiant + nom.hashCode();  }
}


