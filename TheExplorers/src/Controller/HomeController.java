/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.NodeOrientation;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import utilitaire.QRCodeReader;
import utilitaire.UserSession;
//import utilitaire.QRCodeReaders;

/**
 *
 * @author OumaymaFrioui
 */
public class HomeController implements Initializable {
    
    
    @FXML
    private VBox pnl_scroll;
    @FXML
    private JFXButton stat;
    @FXML
    private JFXButton idGestionEmploye;
    @FXML
    private JFXButton idBlockage;
    @FXML
    private JFXButton gs;
    @FXML
    private JFXButton gp;
    @FXML
    private JFXButton stat1;
    @FXML
    private ImageView idDeconnecter;
    
    private void handleButtonAction(MouseEvent event) {        
       refreshNodes();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
         //refreshNodes();
    }    
    
    private void refreshNodes()
    {
        pnl_scroll.getChildren().clear();
        
        Node [] nodes = new  Node[15];
        
        for(int i = 0; i<10; i++)
        {
            try {
                nodes[i] = (Node)FXMLLoader.load(getClass().getResource("View/AdminRec.fxml"));
               pnl_scroll.getChildren().add(nodes[i]);
                
            } catch (IOException ex) {
                Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }  
    }

//    @FXML
//    private void scan(ActionEvent event) {
//        
//        
//        try {
//                ReservationService rs=new ReservationService();
//                //System.out.println(this.idRES.getText());
//                // System.out.println(Integer.valueOf(this.idRES.getText()));
//                
//                String CodeQr;
//                
//                    CodeQr = QRCodeReaders.ReadQRCodeImage();
//                      String nq=CodeQr.replace("QR-Code:","");
//                     
//                      try{
//                          int qr=Integer.parseInt(nq);
//                      
//                      
//Reservation res=new Reservation();
//res=rs.rechercheReservationParIdRes(qr);
//Ticket t=rs.getUser(res.getId_user());
//if (res.getSiege()!=null){
//
//    System.out.println("oui");
//Alert alert = new Alert(Alert.AlertType.INFORMATION);
//alert.setTitle("Information");
//alert.setHeaderText("VALIDE");
//alert.setContentText(t.getNom()+" "+t.getPrenom()+"  nombre de place:"+res.getNb_place()+"  PRIX:"+res.getPrix()+"DT");
//
//alert.showAndWait();
//rs.supprimerReservation(qr);
////pane.setVisible(false);
//
//    /*alert.setTitle("Confirmation");
//alert.setHeaderText("Look, a Confirmation Dialog");
//alert.setContentText("Are you ok with this?");*/}
//else{
//    System.out.println("non");
//Alert alert = new Alert(Alert.AlertType.ERROR);
//alert.setTitle("ERREUR");
//alert.setHeaderText("INFORMATION");
//alert.setContentText("VOUS NE DISPOSEZ PAS DE RESERVATION");
//
//alert.showAndWait();
////pane.setVisible(false);
//
//   }
//
//                      }catch(Exception e){
//                      
//                          System.out.println("non2");
//Alert alert = new Alert(Alert.AlertType.ERROR);
//alert.setTitle("Error Dialog");
//alert.setHeaderText("Look, an Error Dialog");
//alert.setContentText("Ooops, there was an error!");
//
//alert.showAndWait();
////pane.setVisible(false);
//                          
//                      
//                      }
//                } catch (ClassNotFoundException| IOException ex) {
//                    Logger.getLogger(TicketReadController.class.getName()).log(Level.SEVERE, null, ex);
//                }
//        
//        // TODO
//        
//        
//        
//        
//        
//        
//        
//        
//    }

    private void stat(ActionEvent event) {
        
           try {
              pnl_scroll.getChildren().clear();
              
              
              
              FXMLLoader.load(getClass().getResource("/View/FXML.fxml"));
              pnl_scroll.getChildren().add(FXMLLoader.load(getClass().getResource("/View/FXML.fxml")));
          } catch (IOException ex) {
              Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
          }
        }  

    @FXML
    private void Adminreclamation(ActionEvent event) {
         try {
              pnl_scroll.getChildren().clear();
              
              
              
              FXMLLoader.load(getClass().getResource("/View/AdminRec.fxml"));
              pnl_scroll.getChildren().add(FXMLLoader.load(getClass().getResource("/View/AdminRec.fxml")));
          } catch (IOException ex) {
              Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
          }
    }

    @FXML
    private void AdminGestionSalle (ActionEvent event) {
    
         try {
              pnl_scroll.getChildren().clear();
              
              
              
              FXMLLoader.load(getClass().getResource("/View/SalleInterface.fxml"));
              pnl_scroll.getChildren().add(FXMLLoader.load(getClass().getResource("/View/SalleInterface.fxml")));
          } catch (IOException ex) {
              Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
          }
       } 

    private void scan(ActionEvent event) {
          try {
              pnl_scroll.getChildren().clear();
              
              
              
              FXMLLoader.load(getClass().getResource("/View/ticketReader.fxml"));
              pnl_scroll.getChildren().add(FXMLLoader.load(getClass().getResource("/View/AdminRec.fxml")));
          } catch (IOException ex) {
              Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
          }
    }

    @FXML
    private void GestionEmploye(ActionEvent event) {
          try {
              pnl_scroll.getChildren().clear();
              
              
              
              FXMLLoader.load(getClass().getResource("/View/inscription.fxml"));
              pnl_scroll.getChildren().add(FXMLLoader.load(getClass().getResource("/View/inscription.fxml")));
          } catch (IOException ex) {
              Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
          }
        
    }

    @FXML
    private void Blockage(ActionEvent event) {
         try {
              pnl_scroll.getChildren().clear();
              
              
              
              FXMLLoader.load(getClass().getResource("/View/admin.fxml"));
              pnl_scroll.getChildren().add(FXMLLoader.load(getClass().getResource("/View/admin.fxml")));
          } catch (IOException ex) {
              Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
          }
    }

    @FXML
    private void touslesgestions(ActionEvent event) {
        try {
              pnl_scroll.getChildren().clear();
              
              
              
              FXMLLoader.load(getClass().getResource("/View/GestionDesEvenements.fxml"));
              pnl_scroll.getChildren().add(FXMLLoader.load(getClass().getResource("/View/GestionDesEvenements.fxml")));
          } catch (IOException ex) {
              Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
          }
    }

    @FXML
    private void touslespropositions(ActionEvent event) {
         try {
              pnl_scroll.getChildren().clear();
              
              
              
              FXMLLoader.load(getClass().getResource("/View/validerProposition.fxml"));
              pnl_scroll.getChildren().add(FXMLLoader.load(getClass().getResource("/View/validerProposition.fxml")));
          } catch (IOException ex) {
              Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
          }
    }

    @FXML
    private void reservation(ActionEvent event) {
         try {
              pnl_scroll.getChildren().clear();
              
              
              
              FXMLLoader.load(getClass().getResource("/View/FXML.fxml"));
              pnl_scroll.getChildren().add(FXMLLoader.load(getClass().getResource("/View/FXML.fxml")));
          } catch (IOException ex) {
              Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
          }
    }

    @FXML
    private void check(ActionEvent event) {
        
          //   TODO
            
            
            
            
            
            
            
            
        }

     @FXML
    private void GCF(ActionEvent event) {
        try {
              pnl_scroll.getChildren().clear();
              
              
              
              FXMLLoader.load(getClass().getResource("/View/GestionCFideliteFXML.fxml"));
              pnl_scroll.getChildren().add(FXMLLoader.load(getClass().getResource("/View/GestionCFideliteFXML.fxml")));
          } catch (IOException ex) {
              Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
          }
    }

    @FXML
    private void GererCours(ActionEvent event) {
        try {
              pnl_scroll.getChildren().clear();
              
              
              
              FXMLLoader.load(getClass().getResource("/View/cours.fxml"));
              pnl_scroll.getChildren().add(FXMLLoader.load(getClass().getResource("/View/cours.fxml")));
          } catch (IOException ex) {
              Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
          }
    }

    @FXML
    private void article(ActionEvent event) {

        try {
              pnl_scroll.getChildren().clear();
              
              
              
            FXMLLoader.load(getClass().getResource("/View/admin_publication.fxml"));
      
            pnl_scroll.getChildren().add(FXMLLoader.load(getClass().getResource("/View/admin_publication.fxml")));
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void Deconnecter(MouseEvent event) throws IOException {
         UserSession session=new UserSession();
    session.resetUser();
//        UserSession.clear();
  //      System.err.println(UserSession.getInstance(new Utilisateur()).getUser().getUsername());
        
  Stage primaryStage= new Stage();
      
         Parent root = FXMLLoader.load(getClass().getResource("/View/connection.fxml"));
        Scene scene = new Scene(root);
       
FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("/View/connection.fxml"));
        try{
        loader.load();
        }catch (IOException ex){
        Logger.getLogger(Connect.class.getName()).log(Level.SEVERE,null,ex);
        
        }
                Parent p =loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(p));
              
        
               

         final Node source =(Node) event.getSource();
        final Stage stage2= (Stage)source.getScene().getWindow();
        

        stage2.close();
                 stage.show();
    }
        
    }

    
    

