import java.util.*;

public class DepartementHashSet implements IDepartement<Departement> {
    Set<Departement> departements;
    public DepartementHashSet(){
        departements =new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement departement){
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement){
        for(Departement departement :departements){
            if(departement.getNomDepartement().equals(nomDepartement)){
                System.out.println("Département trouvé ");
                return true;
            }
        }
        System.out.println("Département non trouvé ");
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement){
        if(departements.contains(departement)){
            System.out.println("Département trouvé ");
            return true;
        }
        System.out.println("Département non trouvé ");
        return false;
    }

    @Override
    public void supprimerDepartement(Departement departement){
        departements.remove(departement);
    }

    @Override
    public void afficherDepartements(){
        for(Departement departement :departements){
            System.out.println(departement.getNomDepartement());
        }
    }

    @Override
    public void trierDepartementsParId(){
        List<Departement> departementsParId = new ArrayList<>();
        Collections.sort(departementsParId);
    }
    @Override
    public void trierDepartementsParNomEtNombreEmployes(){
        List<Departement> listeDepartements= new ArrayList<>(departements);
        Collections.sort(listeDepartements,
                new TriParNomDepartement()
                        .thenComparing(new TriParNombreEmployes()));
    }
}
