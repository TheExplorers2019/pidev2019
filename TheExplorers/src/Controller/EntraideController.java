/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entities.Entraide;
import Services.EntraideService;
import Services.UtilisateurService;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.stage.FileChooser;
import utilitaire.ControlesaisieJ;

/**
 * FXML Controller class
 *
 * @author OumaymaFrioui
 */
public class EntraideController implements Initializable {
ObservableList<String> ListVille = FXCollections.observableArrayList("Tunis","Sfax","Sousse","Kairouan","Bizerte","Gabès","La Soukra","Ariana","Sidi Hassine","El Mourouj","Gafsa","Raoued","Monastir","La Marsa","Ben Arous","Kasserine ","Douar Hicher","Djerba - Houmt Souk","Le Kram","Hammamet","Zarzis","Le Bardo","Médenine","Nabeul","Tataouine","Ben Gardane","Djerba - Midoun ","Béja","M'saken","Radès","Oued Ellil","Moknine","Le Kef","Menzel Bourguiba","Kalâa Kebira ","Sakiet Ezzit ","Mahdia ","Jemmal ","Ksar Hellal ","Sidi Bouzid ","Kélibia ","Sakiet Eddaïer ","La Goulette ","Jendouba ","El Aïn ","Hammam Sousse ","Hammam Lif ","Dar Chaâbane ","El Hamma","Gremda ","Bou Mhel el-Bassatine ","Menzel Temime ","Korba ","Métlaoui ","Soliman ","Téboulba ","Tozeur ","Ezzahra ","Kalâa Seghira ","Mateur ","El Ksar ","Thyna ","La Manouba ","Hammam Chott ","Siliana ","Douz ","Mornag ","Fériana ","Ksour Essef ","Djedeida ","Ras Jebel ","Ghannouch ","Tebourba ","Akouda ","Mégrine ","Den Den ","Chihia ","Redeyef ","Sbeïtla ","Grombalia ","Djerba - Ajim ","El Fahs ","Menzel Jemil ","Chebba ","Takelsa ","Ouerdanine ","Nefta ","Medjez el-Bab ","Bou Salem ","Béni Khiar ","Moularès ","El Jem ","Tinja ","Zaghouan ","Zaouiet Sousse ","Kébili ","Mornaguia ","Tabarka ","Ghardimaou ","Menzel Abderrahmane ","Sahline Moôtmar ","Souk Lahad ","Menzel Bouzelfa ","El Alia ","Thala ","Kalâat el-Andalous ","Bekalta ","Tajerouine ","Ezzouhour ","Carthage ","Zéramdine ","Bembla ","Mahrès ","Kerkennah ","Béni Khalled ","Chenini Nahal ","Meknassy ","Bennane-Bodheur ","El Guettar ","Makthar ","Testour ","Bou Arada ","Ksibet el-Médiouni ","Dahmani ","Sayada","Menzel Hayet","Messaadine"," Mdhilla"," Le Sers"," Bou Argoub"," Skhira"," Téboursouk"," Zriba"," Menzel Ennour"," Mareth"," Ksibet Thrayet"," Agareb"," Regueb"," Sidi Thabet"," Khniss"," Enfida"," Rejiche"," Métouia"," Hajeb El Ayoun"," Gaâfour"," Sidi Bou Ali"," Oudhref"," Bouficha"," Metline"," Raf Raf"," Jérissa"," Aïn Draham"," Ghomrassen"," Sened"," El Haouaria"," Tazarka"," Sidi Ali Ben Aoun"," Hammam Ghezèze"," Oueslatia"," Beni Hassen"," Khalidia"," Menzel Kamel"," Haffouz"," Sidi Ameur"," Bir Mcherga"," Kalaat Senan"," Amiret Hajjaj"," El Maâmoura"," Sbikha"," Bir Lahmar"," El Golâa"," Degache"," Zaouiet Djedidi"," El Krib"," Bou Hajla"," El Maâgoula"," Foussana"," El Hencha"," Nadhour"," Nouvelle Matmata"," Sidi Alouane"," Kerker"," Hergla"," El Bradâa"," Mezzouna"," Nefza"," Touza"," Jemna"," Jebiniana"," Menzel Bouzaiane"," Somâa"," Thélepte"," Zaouiet Kontoch"," Melloulèche"," Borj El Amri"," Sbiba"," Bir El Hafey"," Majel Bel Abbès"," El Batan"," El Hamma du Jérid"," Sakiet Sidi Youssef"," Remada"," Amiret Touazra"," Bouhjar"," Sidi Bou Saïd"," El Ksour"," Jilma"," Lamta"," Chorbane"," Sejnane"," Zarat"," Essouassi"," Ghar El Melh"," Djebel Oust"," Amiret El Fhoul"," Menzel Horr"," Amdoun"," Aousja"," Ouled Chamekh"," El Ghnada"," Azmour"," Nasrallah"," Bargou"," Bir Ali Ben Khalifa"," El Masdour"," Rouhia"," Dar Allouch"," Sidi Bennour"," Cherahil"," Jedelienne"," Bou Merdes"," Dehiba"," El Mida"," Goubellat"," Menzel Mehiri"," Fernana"," Kondar"," Menzel Fersi"," Korbous"," Haïdra"," Cebbala Ouled Asker"," Nebeur"," El Alâa"," Sidi Bou Rouis"," Graïba"," Hebira"," Sidi Makhlouf"," Beni Khedache"," Chebika","El Aroussa","Sidi El Hani"," Kesra"," Kalâat Khasba"," Ouchtata"," Slouguia"," Sidi Ismail"," Ouled Haffouz"," Oued Meliz"," Tamerza"," Menzel Chaker"," Touiref"," Matmata"," Menzel Salem"," Aïn Djeloula"," Echrarda","Beni M'Tir","Aachech"," Al Ahouaz-El Assouda"," Belkhir","Bouchemma"," El Amra"," El Ayoun","Ennasr","Ezzouhour"," Essaïda","Faouar","Fouchana ","Ghezala ","Hadjeb","Hassi El Ferid ","Hazeg Ellouza ","Hazoua ","Hkaima ","Joumine ","Lela ","Menzel El Habib ","Mohamedia ","Mnihla ","Nadhour Sidi Ali Ben Abed ","Ouabed Khazanet ","Rjim Maatoug ","Saouaf ","Sidi Aïch ","Sidi Zid ","Smâr ","Souk Jedid ","Teboulbou ","Thibar ","Tlelsa ","Utique ","Zarzis Nord ","Zelba");
private List <String> GrosMots=new ArrayList<>();

    @FXML
    private JFXRadioButton covoiturage;
    @FXML
    private JFXRadioButton collocation;
    @FXML
    private JFXRadioButton objet_perdu;
    @FXML
    private ChoiceBox<String> lieu;
    @FXML
    private DatePicker date;
    @FXML
    private TextArea description;
    @FXML
    private JFXButton passer_demande;
    @FXML
    private ToggleGroup typeEnt;
    @FXML
    private JFXButton joindrebtn;
    @FXML
    private JFXTextField path;
    @FXML
    private Label Ltype;
    @FXML
    private Label Llieu;
    @FXML
    private Label Ldescription;
    @FXML
    private Label Limage;
    @FXML
    private Label LDate;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            lieu.setValue("Tunis");
            lieu.setItems(ListVille);   
            GrosMots.add("BONJOUR");
            GrosMots.add("SALUT");
        }    

    @FXML
    private void AjouterEntraide(ActionEvent event) throws ClassNotFoundException {
        
     EntraideService e = new EntraideService();

       String type=null;
       String postulant=null;
       String descriptions=null;
     String lie=lieu.getValue();
     String image=null;
     java.sql.Date dates = null;
          
        ControlesaisieJ cn=new ControlesaisieJ();
         int v=0;
         /********************************************************/
if (typeEnt.selectedToggleProperty().getValue() != null){
               RadioButton button = (RadioButton) typeEnt.getSelectedToggle();
        type=button.getText();
      //  this.Lsexe.setText("");
        v++;
        }else {
        //                     this.LDate.setText("* veuillez choisir votre sexe");

        }
 
         /********************************************************/
                    java.sql.Date d=new Date(System.currentTimeMillis());

         if (date.getValue()!=null){
           dates=java.sql.Date.valueOf(date.getValue());
        //   testdateEMB_dateEXP1(java.sql.Date d1, java.sql.Date d2)
             if (cn.datenow(dates)){
           //  this.LDate.setText("");
             v++;
             }else{
            // this.LDate.setText("Date erroné");
             }
        }else {
                     this.LDate.setText("Date vide");
}
         
         /********************************************************/
         Boolean b=false;
               if (!this.description.getText().equals("")){
            //     this.LNom.setText("");
                 descriptions=description.getText();
                      String[] result = descriptions.toUpperCase().split(" ");
     for (int x=0; x<result.length; x++){
                      for (int i=0;i<GrosMots.size();i++){
                          if (GrosMots.get(i).equals(result[x])){
                          b=true;
                          break;
                          }}}
            if(b==false)
            {
                 v++;
         }else {
             
          //   this.LNom.setText("* Gros mot");
                
         }}
         
         /********************************************************/
         if (!path.getText().equals(""))
 {
 
  v++;      
 //this.LImage.setText("");
 
 }else{
 //this.LImage.setText("* Veuillez inserer une image");
 
 } 
 
         
         /********************************************************/
        
        System.out.println(type);
        System.out.println(dates);
        System.out.println(descriptions);
        System.out.println(path.getText());
        System.out.println(v);
        
        
        
        
        
        
    }
    


    @FXML
    private void joinde(ActionEvent event) {
           FileChooser fileChooser = new FileChooser();
           
 FileChooser.ExtensionFilter imageFilter
                = new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png");
  fileChooser.getExtensionFilters().add(imageFilter);
		File selectedFile = fileChooser.showOpenDialog(null);

		if (selectedFile != null) {

			this.path.setText(selectedFile.getAbsolutePath());
    }}
}
