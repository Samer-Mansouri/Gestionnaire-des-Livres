package mvc.Controllers.CRUDLivres;

import mvc.DataBaseConnection;
import mvc.Models.Livre;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public abstract class CRUDL {

    public static DataBaseConnection db = new DataBaseConnection();

    public static int seConnecter(String username, String password){
        Connection conn = null;
        try{
            conn = db.connect();
            String query = "SELECT * FROM admins WHERE username ='"+username+"' AND password='"+password+"';";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                if(!rs.getString(2).isEmpty() && !rs.getString(3).isEmpty()){
                    return 1;
                }
                return 2;
            }
            return 2;
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }

    public static int createLivre(Livre l){
        Connection conn = null;
        try{
            conn = db.connect();
            String query = "INSERT INTO livres (titre, auteur, disponnible) VALUES('"+l.getTitre()+"', '"+l.getAuteur()+"', "+ l.isDisponnible()+");";
            Statement stmt = conn.createStatement();
            return stmt.executeUpdate(query);
        } catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }

    public static void readLivre(int livre_id){
        Connection conn = null;
        try{
            conn = db.connect();
            String query = "SELECT * FROM livres WHERE livre_id =" + livre_id + ";";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
        } catch(SQLException e){
            System.out.println(e);
        }
    }

    public static ArrayList<ArrayList<String>> readLivres(){
        Connection conn = null;
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
        try{
            conn = db.connect();
            String query = "SELECT * FROM livres;";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                ArrayList<String> data1 = new ArrayList<String>();
                data1.add(rs.getInt(1)+"");
                data1.add(rs.getString(2));
                data1.add(rs.getString(3));
                if(rs.getBoolean(4)){
                    data1.add("Oui");
                } else{
                    data1.add("Non");
                }
                data.add(data1);

            }
        } catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }

    public static int updateLivre(Livre l){
        Connection conn = null;
        try {
            conn = db.connect();
            String query = "UPDATE livres SET titre ='" + l.getTitre() + "', auteur ='" +l.getAuteur()+"', disponnible="+l.isDisponnible()+" WHERE livre_id="+l.getId()+";";
            Statement stmt = conn.createStatement();
            return stmt.executeUpdate(query);
        } catch (SQLException e){
            System.out.println(e);
        }
        return 0;
    }

    public static int deleteLivre(int livre_id){
        Connection conn = null;
        try{
            conn = db.connect();
            String query = "DELETE FROM livres WHERE livre_id =" +livre_id+";";
            Statement stmt = conn.createStatement();
            return stmt.executeUpdate(query);
        } catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
}
