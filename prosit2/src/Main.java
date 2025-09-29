public class Main {
    public static void main(String[] args) {
        //test pour intruction 11 - prosit3
        Zoo myZoo = new Zoo("belvedere", "Tunis", 10);

        Animal lion = new Animal("asad", "Lion", 5, true);

        // Ajout du lion au zoo
        myZoo.addAnimal(lion);

        // Affichage des animaux
        myZoo.displayAnimals();

        //Recherche du lion
        int index1 = myZoo.searchAnimal(lion);
        System.out.println("Résultat de la recherche du lion : " + index1);

        Animal lion2 = new Animal("asad", "simba", 5, true);

        // Recherche du nouveau lion
        int index2 = myZoo.searchAnimal(lion2);
        System.out.println("Résultat de la recherche du lion2 : " + index2);
    }
}
