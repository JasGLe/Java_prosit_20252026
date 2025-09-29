import java.util.Scanner;

public class ZooManagement {

    // Instruction 1: Variables membres
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        Scanner scanner = new Scanner(System.in);

        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");

        // Instruction 2: Interaction avec l'utilisateur
        String newZooName = "";
        while (newZooName.trim().isEmpty()) {
            System.out.print("Entrez le nom du zoo : ");
            newZooName = scanner.nextLine();
            if (newZooName.trim().isEmpty()) {
                System.out.println("Le nom du zoo ne peut pas être vide ");
            }
        }
        zoo.zooName = newZooName;
        int newNbrCages = 0;
        while (newNbrCages <= 0) {
            System.out.print("Entrez le nombre de cages : ");
            try {
                newNbrCages = scanner.nextInt();
                if (newNbrCages <= 0) {
                    System.out.println("Le nombre de cages doit être un entier positif");
                }
            } catch (Exception e) {
                System.out.println("Veuillez entrer un nombre entier valide");
                scanner.nextLine();
            }
        }
        zoo.nbrCages = newNbrCages;
        scanner.close();
    }

}