package mvc.Models;

public abstract class Document {

    private Integer id;
    private String titre;

    public Document(Integer id, String titre) {
        this.id = id;
        this.titre = titre;
    }

    public Document(String titre) {
        this.titre = titre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Document [titre=" + titre + "]";
    }

}
