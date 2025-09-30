public class Main {
    public static void main(String[] args) {
        //test avec age negatif
        Animal lion = new Animal("Felidae", "Lion", -3, true);
        System.out.println(lion);

        //test avec zoo sans nom
        Zoo zoo = new Zoo("", "Tunis");
        zoo.displayZoo();
    }
}

