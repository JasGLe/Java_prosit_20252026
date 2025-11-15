import java.util.Objects;

public class Departement implements Comparable<Departement>{
    private int id;
    private String nomDepartement;
    private int nombreEmployes;

    public Departement(){
    }

    public Departement(int nombreEmployes, String nomDepartement, int id) {
        this.nombreEmployes = nombreEmployes;
        this.nomDepartement = nomDepartement;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Departement that)) return false;
        return id == that.id && nombreEmployes == that.nombreEmployes && Objects.equals(nomDepartement, that.nomDepartement);
    }

    @Override
    public int hashCode() {
        int result = 16;
        result = 9 * result + id;
        result = 9 * result + nomDepartement.hashCode();
        result = 9 * result + nombreEmployes;
        return result;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nombreEmployes=" + nombreEmployes +
                '}';
    }

    @Override
    public int compareTo(Departement d){
        return this.id-d.id;
    }
}
