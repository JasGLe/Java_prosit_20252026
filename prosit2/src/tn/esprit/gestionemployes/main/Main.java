package tn.esprit.gestionemployes.main;

import tn.esprit.gestionemployes.entities.Employe;
import tn.esprit.gestionemployes.services.SocieteArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        // Ajout des employés
        System.out.println("=== Ajout des employés ===");
        societe.ajouterEmploye(new Employe(105, "Ben Ali", "Mohamed", "Informatique", 3));
        societe.ajouterEmploye(new Employe(102, "Trabelsi", "Fatma", "RH", 2));
        societe.ajouterEmploye(new Employe(108, "Hamdi", "Ahmed", "Informatique", 1));
        societe.ajouterEmploye(new Employe(101, "Saidi", "Leila", "Finance", 2));
        societe.ajouterEmploye(new Employe(110, "Khaled", "Sami", "RH", 3));
        societe.ajouterEmploye(new Employe(103, "Mejri", "Nour", "Finance", 1));

        // Affichage initial
        System.out.println("\n--- Liste initiale ---");
        societe.displayEmploye();

        // Test de recherche par nom
        System.out.println("=== Test de recherche par nom ===");
        String nomRecherche = "Ben Ali";
        System.out.println("Recherche de '" + nomRecherche + "': " +
                (societe.rechercherEmploye(nomRecherche) ? "Trouvé" : "Non trouvé"));

        // Test de recherche par objet
        System.out.println("\n=== Test de recherche par objet ===");
        Employe empTest = new Employe(105, "", "", "", 0);
        System.out.println("Recherche de l'employé avec id 105: " +
                (societe.rechercherEmploye(empTest) ? "Trouvé" : "Non trouvé"));

        // Tri naturel par id
        System.out.println("\n=== Tri par ID (Comparable) ===");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Tri personnalisé par département, grade et nom
        System.out.println("=== Tri par Département, Grade et Nom (Comparator) ===");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        // Test de recherche par département
        System.out.println("=== Recherche par département ===");
        String deptRecherche = "Informatique";
        List<Employe> employesInfo = societe.rechercherParDepartement(deptRecherche);
        System.out.println("Employés du département " + deptRecherche + ":");
        for (Employe emp : employesInfo) {
            System.out.println("  - " + emp);
        }

        // Test de suppression
        System.out.println("\n=== Test de suppression ===");
        Employe empASupprimer = new Employe(102, "", "", "", 0);
        societe.supprimerEmploye(empASupprimer);
        System.out.println("Après suppression de l'employé avec id 102:");
        societe.displayEmploye();
    }
}
