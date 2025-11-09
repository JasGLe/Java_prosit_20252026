package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.*;
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
        Animal[] animals = {
                new Animal("Lion", "Simba", 5, true),
                new Animal("Tiger", "Shere Khan", -3, true),      //  Âge négatif
                new Animal("Bear", "Baloo", 8, true),
                new Animal("Elephant", "Dumbo", 10, true),
                new Animal("Giraffe", "Melman", 7, true),
                new Animal("Zebra", "Marty", 6, true),
                new Animal("Hippo", "Gloria", -2, true),          // Âge négatif
                new Animal("Penguin", "Skipper", 3, true),
                new Animal("Monkey", "King Julien", 4, true),
                new Animal("Wolf", "Akela", 7, true),
                new Animal("Fox", "Nick", 4, true),
                new Animal("Rabbit", "Judy", 2, true),
                new Animal("Sloth", "Flash", 5, true),
                new Animal("Cheetah", "Fuli", 4, true),
                new Animal("Hyena", "Shenzi", 5, true),
                new Animal("Crocodile", "Tick-Tock", 15, true),
                new Animal("Snake", "Kaa", 10, true),
                new Animal("Parrot", "Iago", 3, true),
                new Animal("Gorilla", "Kerchak", 20, true),
                new Animal("Rhino", "Rocksteady", 12, true),
                new Animal("Kangaroo", "Roo", 4, true),
                new Animal("Koala", "Blinky", 3, true),
                new Animal("Puma", "Diego", 6, true),
                new Animal("Jaguar", "Jaggy", 5, true),
                new Animal("Leopard", "Leo", 7, true),
                new Animal("Panda", "Po", 5, true),              // 25ème animal
                new Animal("Penguin2", "Rico", 3, true)          //  Zoo plein
        };
        for (int i = 0; i < animals.length; i++) {
            System.out.println("\n Tentative d'ajout : " + animals[i].getName() + " (âge: " + animals[i].getAge() + ")");
            try {
                myZoo.addAnimal(animals[i]);
            } catch (ZooFullException e) {
                System.out.println("❌ " + animals[i].getName() + " : " +e.getMessage());
            } catch (InvalidAgeException e) {
                System.out.println("❌ " + animals[i].getName() + " : " +e.getMessage());
            }

            System.out.println("Animaux dans le zoo : " + myZoo.getNbrAnimals() + "/" + myZoo.getNbrCages());
        }

            // Afficher le nombre total d'animaux après chaque tentative
            System.out.println("Nombre total d'animaux dans le zoo : " + myZoo.getNbrAnimals() + "/" + myZoo.getNbrCages());
            System.out.println("---");
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

