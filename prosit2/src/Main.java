public class Main {
    public static void main(String[] args) {
        //test pour instruction 12
        Zoo myZoo = new Zoo("friguia", "Tunis", 3);

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal eagle = new Animal("Accipitridae", "Eagle", 3, false);
        Animal dolphin = new Animal("Delphinidae", "Dolphin", 8, true);
        Animal lion2 = new Animal("Felidae", "Lion", 5, true);
        Animal lion3 = new Animal("asad","simba", 5, true);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(eagle);
        myZoo.addAnimal(lion2);
        myZoo.addAnimal(dolphin);
        myZoo.addAnimal(lion3);

        myZoo.displayZoo();
        myZoo.displayAnimals();
    }
}
