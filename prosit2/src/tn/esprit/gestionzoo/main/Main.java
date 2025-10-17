package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

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
        Animal lion = new Animal("predator","simba",4,true);
        Zoo myZoo = new Zoo("myZoo","Tunis");
        myZoo.displayZoo();

//        System.out.println(myZoo);
//        System.out.println(myZoo.toString());



        System.out.println(myZoo);
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

