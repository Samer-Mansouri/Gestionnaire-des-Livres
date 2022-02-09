package mvc.Models;

import java.util.Date;

public class Emprunte {

    private Date dateEmprunt;
    private Date dateRetour;
    private Adherent emprunteur;
    private Livre livre;

    public Emprunte(Date dateEmprunt, Date dateRetour, Adherent emprunteur, Livre livre) {
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = dateRetour;
        this.emprunteur = emprunteur;
        this.livre = livre;
    }

    public Date getdateEmprunt() {
        return dateEmprunt;
    }

    public void setdateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public Date getdateRetour() {
        return dateRetour;
    }

    public void setdateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    }

    public Adherent getEmprunteur() {
        return emprunteur;
    }

    public void setEmprunteur(Adherent emprunteur) {
        this.emprunteur = emprunteur;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    @Override
    public String toString() {
        return "Emprunte [dateEmprunt=" + dateEmprunt + ", dateRetour=" + dateRetour + ", emprunteur=" + emprunteur
                + ", livre=" + livre + "]";
    }




}
