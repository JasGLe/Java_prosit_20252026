public class Main {
    public static void main(String[] args) {
        //affichage test pour instruction 15
        //verifie si zoo est plein
        // si oui, afficher un message
        Zoo myZoo = new Zoo("friguia", "Tunis");

        for (int i = 1; i <= 25; i++) {
            myZoo.addAnimal(new Animal("test", "Animal" + i, i, true));
        }

        System.out.println("Zoo plein ? " + myZoo.isZooFull());

        Animal extra = new Animal("test", "onemore", 99, true);
        myZoo.addAnimal(extra);
    }
    }
