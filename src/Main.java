public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        Departement d1 = new Departement(10, "IT", 100);
        Departement d2 = new Departement(5, "Marketing", 50);
        Departement d3 = new Departement(1, "Finance", 20);
        Departement d4 = new Departement(10, "IT", 100);

        gestionDepartements.ajouterDepartement(d1);
        gestionDepartements.ajouterDepartement(d2);
        gestionDepartements.ajouterDepartement(d3);
        gestionDepartements.ajouterDepartement(d4);

        gestionDepartements.afficherDepartements();

        gestionDepartements.rechercherDepartement("IT");
        gestionDepartements.rechercherDepartement(new Departement(2, "Marketing", 8));

        //gestionDepartements.trierDepartementsParId();
        //gestionDepartements.afficherDepartements();

        gestionDepartements.trierDepartementsParNomEtNombreEmployes();
        gestionDepartements.afficherDepartements();

        //gestionDepartements.supprimerDepartement(d3);
        //gestionDepartements.afficherDepartements();

    }
}