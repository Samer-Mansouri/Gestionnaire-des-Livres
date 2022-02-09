package mvc.Models;

import java.util.Date;

public class Journal extends Document {
    private Date dateParution;

    public Journal(String titre, Date dateParution) {
        super(titre);
        this.dateParution = dateParution;
    }

    public Date getdateParution() {
        return dateParution;
    }

    public void setdateParution(Date dateParution) {
        this.dateParution = dateParution;
    }

    @Override
    public String toString() {
        return "Journal [titre= " + getTitre() + ", dateParution=" + dateParution + "]";
    }


}
