/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;


import Dao.MyDB;
import Entities.Utilisateur;
import IServices.IAdmin;
import com.google.zxing.WriterException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import utilitaire.QRCodeGenerator;
import utilitaire.cryptpasswords;
/**
 *
 * @author OumaymaFrioui
 */
public class AdminService implements IAdmin{
         Connection conn;

    public AdminService() throws ClassNotFoundException {
                this.conn = MyDB.getInstance().getConnexion();
    }

    @Override
    public void ajouterEmploye(Utilisateur c) {
        System.out.println(c);
   String role=  "a:1:{i:0;s:10:\"ROLE_ADMIN\";}" ;
        String sql = "INSERT INTO `user`(`username`, `username_canonical`, `email`, `email_canonical`, `enabled`, `salt`, `password`, `locked`, "
           + "`expired`, `roles`, `qr`, `image`, `nom`, `prenom`, `ville`,"
           + " `date_naissance`,`adresse`, `code_postal`, `sexe`, `telephone`, `cin`) "
           + "VALUES ('"+c.getUsername() + "','" + c.getUsername() + "','" + c.getEmail() + "','" + c.getEmail() + "','" +
                      c.getEnabled() + "','" + c.getSalt() + "','" + c.getPassword()  + "','" + c.getLocked() + "','" +
                      c.getExpired() + "','"+role+"','" +c.getQr() + "','" + c.getImage() + "','" + 
                      c.getNom() + "','" + c.getPrenom() + "','" + c.getVille() + "','"+ c.getDate_naissance() +"','" + c.getAdresse()+"','" +
                      c.getCode_postal()+"','" + c.getSexe()+"','" + c.getTelephone()+"','" + c.getCin()+"');";

 
  
    try {
      Statement stl = conn.createStatement();
//            
          int rs =stl.executeUpdate(sql);
         //  QRCodeGenerator.generateQRCodeImage(c.getQr(),c.getUsername(),c.getEmail());
             //      } catch (SQLException |IOException|WriterException ex) {
           // System.err.println("SQLException: " + ex.getMessage());
           
        } catch (Exception ex) {
            Logger.getLogger(UtilisateurService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public boolean verifEmail(String Email) {
 boolean verif =true;
            
         //   String sql = "SELECT * FROM fos_user  WHERE roles like '%ROLE_UTILISATEUR%'and email='"+ Email+"';";
            String sql = "SELECT * FROM fos_user  WHERE  email='"+ Email+"';";

            try {
                Statement stl = conn.createStatement();
                ResultSet rs = stl.executeQuery(sql);

                if (rs.next()) {
                 verif=false;
                }

            } catch (SQLException ex) {
                Logger.getLogger(UtilisateurService.class.getName()).log(Level.SEVERE, null, ex);
            }
        return verif;            }


}
