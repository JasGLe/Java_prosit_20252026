package tn.esprit.gestionemployes.services;

import tn.esprit.gestionemployes.entities.Employe;
import tn.esprit.gestionemployes.interfaces.IGestion;
import tn.esprit.gestionemployes.interfaces.IRechercheAvancee;
import java.util.*;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {
    private ArrayList<Employe> employes;

    public SocieteArrayList() {
        this.employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe emp : employes) {
            if (emp.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        if (employes.isEmpty()) {
            System.out.println("Aucun employé dans la liste.");
            return;
        }
        System.out.println("\n=== Liste des Employés ===");
        for (Employe emp : employes) {
            System.out.println(emp);
        }
        System.out.println("==========================\n");
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(employes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                // Tri par département
                int compareDept = e1.getNomDepartement().compareTo(e2.getNomDepartement());
                if (compareDept != 0) {
                    return compareDept;
                }
                // Si même département, tri par grade
                int compareGrade = Integer.compare(e1.getGrade(), e2.getGrade());
                if (compareGrade != 0) {
                    return compareGrade;
                }
                // Si même grade, tri par nom
                return e1.getNom().compareTo(e2.getNom());
            }
        });
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> resultat = new ArrayList<>();
        for (Employe emp : employes) {
            if (emp.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                resultat.add(emp);
            }
        }
        return resultat;
    }
}
