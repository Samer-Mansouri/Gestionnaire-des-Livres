package mvc.Models;

import java.util.ArrayList;

public class Bibliotheque {
    private String nomBiblio;
    private ArrayList<Adherent> adherents;
    private ArrayList<Document> documents;

    public Bibliotheque(String nomBiblio) {
        this.nomBiblio = nomBiblio;
        adherents = new ArrayList<Adherent>();
        documents = new ArrayList<Document>();
    }

    public Bibliotheque(String nomBiblio, ArrayList<Adherent> adherents, ArrayList<Document> documents) {
        this.nomBiblio = nomBiblio;
        this.adherents = adherents;
        this.documents = documents;
    }

    public void ajouterAdherent(Adherent a){
        boolean existe = false;
        for(Adherent ad: adherents){
            if(ad.getNom().equals(a.getNom()) && ad.getPrenom().equals(ad.getPrenom())){
                existe = true;
                break;
            }
        }

        if(!existe){
            adherents.add(a);
            System.out.println("Adherent ajouté avec succées");
        } else {
            System.out.println("Adherent existe deja");
        }
    }

    public void ajouterDocument(Document d){
        boolean existe = false;
        for(Document doc: documents){
            if(doc.getTitre().equals(d.getTitre())){
                existe = true;
                break;
            }
        }

        if(!existe){
            documents.add(d);
            System.out.println("Document ajouté avec succées");
        } else {
            System.out.println("document existe deja");
        }
    }


    public void supprimerAdherent(String nom, String prenom){
        boolean delete = false;
        for(Adherent ad: adherents){
            if(ad.getNom().equals(nom) && ad.getPrenom().equals(prenom)){
                adherents.remove(ad);
                System.out.println("Adherent supprimé avec succées");
                delete = true;
                break;
            }
        }
        if(!delete){
            System.out.println("Adherenet n'existe pas");
        }
    }


    public String getNomBiblio() {
        return nomBiblio;
    }

    public void setNomBiblio(String nomBiblio) {
        this.nomBiblio = nomBiblio;
    }


    public ArrayList<Adherent> getAdherents() {
        return adherents;
    }

    public void setAdherents(ArrayList<Adherent> adherents) {
        this.adherents = adherents;
    }



    public ArrayList<Document> getDocuments() {
        return documents;
    }



    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
    }



    @Override
    public String toString() {
        return "Bibliotheque [adherents=" + adherents + ", nomBiblio=" + nomBiblio + "]";
    }

}
