public class ZooManagement {

    // Instruction 1: Variables membres
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");
    }
}