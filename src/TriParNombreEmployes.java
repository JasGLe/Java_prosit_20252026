import java.util.Comparator;

public class TriParNombreEmployes implements Comparator<Departement>{
    public int compare(Departement d1,Departement d2){
        return d1.getNombreEmployes()-d2.getNombreEmployes();
    }

}
