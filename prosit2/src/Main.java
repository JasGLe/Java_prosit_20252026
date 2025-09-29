public class Main {
    // Instruction 5
    public static void main(String[] args) {
        Animal lion = new Animal("Félidés", "Simba", 5, true);
        //instruction 7: ajout d'autres objets
        Animal eagle = new Animal("Accipitridae", "Eagle", 3, false);
        Animal dolphin = new Animal("Delphinidae", "Dolphin", 8, true);

        Zoo myZoo = new Zoo("Zoo de Tunis", "Tunis", 20);

        //instruction 10 - prosit3
        System.out.println("Ajout Lion: " + myZoo.addAnimal(lion));
        System.out.println("Ajout Eagle: " + myZoo.addAnimal(eagle));
        System.out.println("Ajout Dolphin: " + myZoo.addAnimal(dolphin));
        //ajouter plus que 25 animaux
        for (int i = 0; i < 30; i++) {
            Animal temp = new Animal("TestFamily", "Animal" + i, i, true);
            boolean result = myZoo.addAnimal(temp);
            System.out.println("Ajout de Animal" + i + ": " + result);
        }

        myZoo.displayZoo();
        System.out.println(myZoo);
    }
}