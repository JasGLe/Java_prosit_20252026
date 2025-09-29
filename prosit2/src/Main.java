public class Main {
    public static void main(String[] args) {
        //test pour instruction 13
        Zoo myZoo = new Zoo("friguia", "Tunis", 5);

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal eagle = new Animal("Accipitridae", "Eagle", 3, false);
        Animal dolphin = new Animal("Delphinidae", "Dolphin", 8, true);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(eagle);
        myZoo.addAnimal(dolphin);

        myZoo.displayAnimals();

        myZoo.removeAnimal(eagle);
        myZoo.removeAnimal(eagle);

        myZoo.displayAnimals();
    }
}
