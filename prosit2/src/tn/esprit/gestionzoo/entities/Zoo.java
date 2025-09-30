package tn.esprit.gestionzoo.entities;

public class Zoo {
    // Instruction 5: Attributs de la classe Animal
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25; //constante
    private int nbrAnimals;

    // Instruction 6 : Constructeur paramétré
    public Zoo(String name, String city) {
        setName(name); //setter
        this.city = city;
        this.animals = new Animal[nbrCages]; // tableau de 25 animaux max
        this.nbrAnimals = 0;
    }
    //instruction 18 - getter et setter
    public String getName() {
        return name;
    }
    //instruction 18 - contrainte de nom
    public void setName(String name) {
        if (name!=null && !name.trim().isEmpty()){
            this.name=name;
        }else{
            System.out.println("nom de zoo ne doit pas etre vide");
            this.name="zoo par defaut"; //c'est la valeur par defaut en cas de valeur vide
        }
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getNbrAnimals() {
        return nbrAnimals;
    }
    public int getNbrCages() {
        return nbrCages;
    }

    //instruction 15
    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }

    // Instruction 8 : Méthode displayZoo()
    public void displayZoo() {
        System.out.println("Zoo Name: " + getName());
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
            System.out.println("Impossible d’ajouter " + animal.getName() + " : zoo plein !");
            return false;
        }
        //verifier si animal existe déjà
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].equals(animal)) {
                System.out.println("Impossible d’ajouter " + animal.getName() + " : animal déjà présent");
                return false;
            }
        }
        // Ajout autorisé
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println( animal.getName() + " ajouté au zoo !");
        return true;
    }

        //instruction 11 - méthode displayAnimals()
    public void displayAnimals() {
        System.out.println("Animaux du zoo " + getName() + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println((i + 1) + ". " + animals[i]);
        }
    }
    //instruction 11 - méthode searchAnimal()
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
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
                System.out.println(  animal.getName() + " supprimé du zoo !");
                return true;
            }
        }
        System.out.println(animal.getName() + " n'existe pas dans le zoo !");
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
                "name='" + getName() + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", nbrAnimals=" + nbrAnimals +
                '}';
    }
}