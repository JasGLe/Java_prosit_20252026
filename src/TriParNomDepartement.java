import java.util.Comparator;

public class TriParNomDepartement implements Comparator<Departement> {
    public int compare(Departement d1,Departement d2){
        return d1.getNomDepartement().compareTo(d2.getNomDepartement());
    }
}
