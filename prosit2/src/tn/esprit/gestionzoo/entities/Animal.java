package tn.esprit.gestionzoo.entities;
import java.util.Objects;

public class Animal {
    // Instruction 5: Attributs de la classe Animal
    private String family;
    private String name;
    private int age;
    private boolean isMammal;


    // Instruction 6 : Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age); // ici on utilise le setter
        this.isMammal = isMammal;
    }
    //instruction 18 - setter et getter afin de valider l'age de l'animal.
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age>=0) {
            this.age = age;
        }else{
            System.out.println("impossible d'ajouter car age negatif !");
            this.age = 0; //valeur par défaut
        }
    }
    public boolean isMammal() {
        return isMammal;
    }
    public void setMammal(boolean mammal) {
        isMammal = mammal;
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