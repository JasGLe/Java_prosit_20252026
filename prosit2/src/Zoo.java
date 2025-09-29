public class Zoo {
    // Instruction 5: Attributs de la classe Animal
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int nbrAnimals;

    // Instruction 6 : Constructeur paramétré
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
        this.nbrAnimals = 0;

    }
    // Instruction 8 : Méthode displayZoo()
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
        System.out.println("Number of Animals: " + nbrAnimals);
    }
    // Instruction 9
    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", nbrAnimals=" + nbrAnimals +
                '}';
    }

    //instruction 10 - prosit3
    // méthode d'ajout animal
    public boolean addAnimal(Animal animal) {
        if (nbrAnimals < animals.length) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        } else {
            return false;
        }
    }

    //instruction 11 - méthode displayAnimals()
    public void displayAnimals() {
        System.out.println("Animaux du zoo " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println((i + 1) + ". " + animals[i]);
        }
    }
    //instruction 11 - méthode searchAnimal()
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }
}