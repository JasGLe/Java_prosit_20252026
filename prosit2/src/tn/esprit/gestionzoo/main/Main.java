package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.ZooFullException;
public class Main {
    public static void main(String[] args) {
        //test avec age negatif
        //Animal lion = new Animal("Felidae", "Lion", -3, true);
        //System.out.println(lion);

        //test avec zoo sans nom
        //Zoo zoo = new Zoo("", "Tunis");
        //zoo.displayZoo();
        //zoo.addAnimal(lion);
        //zoo.displayZoo();

//        Dolphin dauphin = new Dolphin();
//        Penguin penguin = new Penguin();
//
        Zoo myZoo = new Zoo("myZoo","Tunis");
        String[] families = {"Lion", "Tiger", "Bear","jdid"};
        for (int i = 0; i < families.length; i++) {
            Animal animal = new Animal(families[i], families[i] + (i+1), 5, true);

            try {
                myZoo.addAnimal(animal);
            } catch (ZooFullException e) {
                System.out.println(" Exception attrapée : " + e.getMessage());
            }

            // Afficher le nombre total d'animaux après chaque tentative
            System.out.println("Nombre total d'animaux dans le zoo : " + myZoo.getNbrAnimals() + "/" + myZoo.getNbrCages());
            System.out.println("---");
        }
        myZoo.displayZoo();
//        System.out.println(myZoo);
//        System.out.println(myZoo.toString());



        System.out.println("------******=====******------");
        Terrestrial terrestre = new Terrestrial("predator","simba",4,true,4);
        Aquatiques aquatique = new Aquatiques("bahouri","houta",5,false,"mer");
        Penguin penguin = new Penguin("penguin","shaun",4,true,"arctique",8);
        Dolphin dauphin = new Dolphin("dauphin","zak",5,false,"ocean",5);
        System.out.println(penguin);
        System.out.println("------******=====******------");
        System.out.println(dauphin);
        System.out.println("------******=====******------");

    }
}

