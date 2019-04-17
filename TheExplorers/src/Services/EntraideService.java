/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Dao.MyDB;
import Entities.Entraide;
import IServices.IEntraide;
import com.google.zxing.WriterException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilitaire.QRCodeGenerator;

/**
 *
 * @author OumaymaFrioui
 */
public class EntraideService implements IEntraide {
    
      Connection conn;

    public EntraideService() throws ClassNotFoundException{
        this.conn = MyDB.getInstance().getConnexion();
}
    
    

    @Override
    public void AjoutEntraide(Entraide e) {
          String sql = "INSERT INTO `entraide`(`postulant`, `type`, `lieu`, `date`, `description`, `image`,"
           + "VALUES ('"+e.getPostulant() + "','" + e.getType() + "','" + e.getLieu() + "','" + e.getDate() + "','" +
                      e.getDescription() + "','" + e.getImage() +"');";                     
          try {
      Statement stl = conn.createStatement();
          
          int rs =stl.executeUpdate(sql);
   
                   } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
           
        } catch (Exception ex) {
            Logger.getLogger(UtilisateurService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void SupprimerEntraide(Entraide e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateEntraide(int id, String Lieu, Date date, String image) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Entraide> rechercheEntraideType(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Entraide> rechercheEntraideLieu(String lieu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InterseEntraide(Entraide e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
