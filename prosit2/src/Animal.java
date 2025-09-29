public class Animal {
    // Instruction 5: Attributs de la classe Animal
    String family;
    String name;
    int age;
    boolean isMammal;

    // Instruction 6 : Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    // Instruction 9
    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}