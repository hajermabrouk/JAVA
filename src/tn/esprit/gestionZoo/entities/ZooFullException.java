package tn.esprit.gestionZoo.entities;

public class ZooFullException extends Exception {
    public ZooFullException(){
    }
    public ZooFullException(String message){
        super(message);
    }
}