package Y;

/**
 * Created by malle on 17/07/2016.
 */
public class Test {
    private String nom;
    private String prenom;
    private Utilis utilis;


    public Test(Utilis utilis){
        this.utilis=utilis;
    }

    public Utilis getUtilis() {
        return utilis;
    }

    public void setUtilis(Utilis utilis) {
        this.utilis = utilis;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
