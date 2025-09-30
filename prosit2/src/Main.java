public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("fruigia", "sousse");
        for (int i = 1; i <= 24; i++) {
            zoo1.addAnimal(new Animal("test", "Animal" + i, i, true));
        }
        System.out.println("Zoo plein ? " + zoo1.isZooFull());
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal eagle = new Animal("bazwich", "aasfour", 2, true);
        zoo1.addAnimal(lion);
        zoo1.removeAnimal(lion);
        zoo1.addAnimal(eagle);
        System.out.println("Zoo plein ? " + zoo1.isZooFull());

    }
}

