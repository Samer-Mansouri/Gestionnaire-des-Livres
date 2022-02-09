package mvc.Models;

public class Dictionnaire extends Volume {

    public Dictionnaire(String titre, String auteur) {
        super(titre, auteur);
    }

    @Override
    public String toString() {
        return "Dictionnaire [titre= " + getTitre() + ", auteur= "+  getAuteur() +"]";
    }


}
