package tn.esprit.gestionzoo.main;
//importation de la class Animal et Zoo depuis l'autre package
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        //test avec age negatif
        Animal lion = new Animal("Felidae", "Lion", -3, true);
        System.out.println(lion);

        //test avec zoo sans nom
        Zoo zoo = new Zoo("", "Tunis");
        zoo.displayZoo();
        zoo.addAnimal(lion);
        zoo.displayZoo();
    }
}

