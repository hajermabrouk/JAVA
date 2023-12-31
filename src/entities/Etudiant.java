package entities;

public class Etudiant {
    private int id,age;
    private String nom;

    public Etudiant() {}
    public Etudiant(int id, int age, String nom) {
        this.id = id;
        this.age = age;
        this.nom = nom;
    }
    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", age=" + age + ", nom='" + nom + '\'' + '}';
    }

}
