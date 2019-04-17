/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;
import java.sql.Date;
/**
 *
 * @author OumaymaFrioui
 */
public class Entraide {
    
    private String type;
    private int id;
    private String postulant;
    private String description;
    private String lieu;
    private String image;
    private Date date;
    private Boolean resolu;

    public Entraide() {
    }

    public Entraide(String type, int id, String postulant, String description, String lieu, String image, Date date, Boolean resolu) {
        this.type = type;
        this.id = id;
        this.postulant = postulant;
        this.description = description;
        this.lieu = lieu;
        this.image = image;
        this.date = date;
        this.resolu = resolu;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostulant() {
        return postulant;
    }

    public void setPostulant(String postulant) {
        this.postulant = postulant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getResolu() {
        return resolu;
    }

    public void setResolu(Boolean resolu) {
        this.resolu = resolu;
    }

    @Override
    public String toString() {
        return "Entraide{" + "type=" + type + ", id=" + id + ", postulant=" + postulant + ", description=" + description + ", lieu=" + lieu + ", image=" + image + ", date=" + date + ", resolu=" + resolu + '}';
    }
    
    
 }
