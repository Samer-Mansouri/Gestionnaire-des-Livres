package mvc.Models;

public class Volume extends Document{

    private String auteur;

    public Volume(Integer id, String titre, String auteur) {
        super(id, titre);
        this.auteur = auteur;
    }

    public Volume(String titre, String auteur) {
        super(titre);
        this.auteur = auteur;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Volume [titre= " + getTitre() + ", auteur=" + auteur + "]";
    }

}
