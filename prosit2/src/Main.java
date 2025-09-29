public class Main {
    public static void main(String[] args) {
        //test pour instruction 13
        Zoo myZoo = new Zoo("friguia", "Tunis"); // on a enlevé le nbr de cages

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal eagle = new Animal("Accipitridae", "Eagle", 3, false);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(eagle);

        myZoo.displayZoo();
        myZoo.displayAnimals();


    }
}
