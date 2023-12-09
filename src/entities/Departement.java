package entities;
public class Departement implements Comparable<Departement> {
    private int id;
    private String nomDep;
    private int nbr;

    public Departement() {
    }

    public Departement(int id, String nomDep, int nbr) {
        this.id = id;
        this.nomDep = nomDep;
        this.nbr = nbr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDep() {
        return nomDep;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public int getNbr() {
        return nbr;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }

    @Override
    public String toString() {
        return "Departement{" + "id=" + id + ",nomDep=" + nomDep + ", nbr=" + nbr + '}';
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null)
            return false;
        if(obj==this)
            return true;
        if(obj instanceof Departement dep)
        {
            return id==dep.id && nomDep.equals(dep.getNomDep());
        }
        return false;
    }
    @Override
    public int compareTo(Departement dep){
        return this.id-dep.id;
    }
    @Override
    public int hashCode(){
        return id+ nomDep.hashCode();  }
}
