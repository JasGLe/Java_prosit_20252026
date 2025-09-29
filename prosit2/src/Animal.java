import java.util.Objects;

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
    // comparaison d’animaux : ils sont égaux si tous leurs attributs sont identiques
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Animal)) return false;
        Animal other = (Animal) obj;
        return age == other.age &&
                isMammal == other.isMammal &&
                Objects.equals(family, other.family) &&
                Objects.equals(name, other.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(family, name, age, isMammal);
    }
}