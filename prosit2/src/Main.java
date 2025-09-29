public class Main {
    // Instruction 5
    public static void main(String[] args) {
        Animal lion = new Animal("Félidés", "Simba", 5, true);
        //instruction 7: ajout d'autres objets
        Animal eagle = new Animal("Accipitridae", "Eagle", 3, false);
        Animal dolphin = new Animal("Delphinidae", "Dolphin", 8, true);

        Zoo myZoo = new Zoo("Zoo de Tunis", "Tunis", 20);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
    }
}