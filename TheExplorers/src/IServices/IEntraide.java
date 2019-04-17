/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IServices;

import Entities.Entraide;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author OumaymaFrioui
 */
public interface IEntraide {
    public void AjoutEntraide(Entraide e);
    public void SupprimerEntraide(Entraide e);
    public void updateEntraide(int id,String Lieu,Date date,String image);
    public List<Entraide> rechercheEntraideType(String type);
    public List<Entraide> rechercheEntraideLieu(String lieu);
    public void InterseEntraide(Entraide e);
}
