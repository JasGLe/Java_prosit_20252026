class Zoo {
    // Instruction 5: Attributs de la classe Animal
    Animal[] animals;
    String name;
    String city;
    final int nbrCages = 25; //constante
    int nbrAnimals;

    // Instruction 6 : Constructeur paramétré
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages]; // tableau de 25 animaux max
        this.nbrAnimals = 0;
    }

    //instruction 15
    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }

    // Instruction 8 : Méthode displayZoo()
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages ( max): " + nbrCages);
        System.out.println("Number of Animals: " + nbrAnimals);
    }


    //instruction 10 - prosit3
    // méthode d'ajout animal
    //update- instruction 12 -contrainte d'ajout
    public boolean addAnimal(Animal animal) {
        // Vérifier si zoo plein
        //instruction 17 prosit 4 - on a utilisé la methode isZooFull
        if (isZooFull()) {
            System.out.println("Impossible d’ajouter " + animal.name + " : zoo plein !");
            return false;
        }
        //verifier si animal existe déjà
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].equals(animal)) {
                System.out.println("Impossible d’ajouter " + animal.name + " : animal déjà présent");
                return false;
            }
        }
        // Ajout autorisé
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println( animal.name + " ajouté au zoo !");
        return true;
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
    //instruction 13 - methode removeAnimal()
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].equals(animal)) {
                for (int j = i; j < nbrAnimals - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[nbrAnimals - 1] = null;
                nbrAnimals--;
                System.out.println(  animal.name + " supprimé du zoo !");
                return true;
            }
        }
        System.out.println(animal.name + " n'existe pas dans le zoo !");
        return false;
    }

    //instr 16
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else if (z2.nbrAnimals > z1.nbrAnimals) {
            return z2;
        } else {
            System.out.println("kifkif");
            return z1;
        }
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
}