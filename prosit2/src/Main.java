public class Main {
    public static void main(String[] args) {
        //affichage pour instruction 16
        Zoo zoo1 = new Zoo("fruigia", "sousse");
        Zoo zoo2 = new Zoo("belveder", "tunis");

        zoo1.addAnimal(new Animal("Felidae", "Lion", 5, true));
        zoo1.addAnimal(new Animal("Accipitridae", "Eagle", 3, false));

        zoo2.addAnimal(new Animal("Delphinidae", "Dolphin", 8, true));

        Zoo winner = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d'animaux est : " + winner.name);
    }
}

