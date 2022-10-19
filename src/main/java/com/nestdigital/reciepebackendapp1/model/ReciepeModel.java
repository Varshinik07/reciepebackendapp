package com.nestdigital.reciepebackendapp1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "reciepe")
public class ReciepeModel {
    @Id
    @GeneratedValue
    private int id;
    private String reciepename;
    private String description;
    private String flavour;
    private String color;

    public ReciepeModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReciepename() {
        return reciepename;
    }

    public void setReciepename(String reciepename) {
        this.reciepename = reciepename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ReciepeModel(int id, String reciepename, String description, String flavour, String color) {
        this.id = id;
        this.reciepename = reciepename;
        this.description = description;
        this.flavour = flavour;
        this.color = color;
    }
}
