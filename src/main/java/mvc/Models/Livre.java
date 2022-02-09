package mvc.Models;

public class Livre extends Volume{
    private boolean disponnible;

    public Livre(Integer id, String titre, String auteur, boolean disponnible) {
        super(id, titre, auteur);
        this.disponnible = disponnible;
    }

    public Livre(String titre, String auteur, boolean disponnible) {
        super(titre, auteur);
        this.disponnible = disponnible;
    }

    public boolean isDisponnible() {
        return disponnible;
    }

    public void setDisponnible(boolean disponnible) {
        this.disponnible = disponnible;
    }



    @Override
    public String toString() {
        return "Livre [titre= " + getTitre() + ", auteur= "+  getAuteur()+ ", disponnible=" + disponnible + "]";
    }

}
