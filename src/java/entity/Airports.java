/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Rasmus
 */
@Entity
public class Airports implements Serializable {
    private static final long serialVersionUID = 1L;
        
    @Id
    private String iata;
    private String iso;
    private int status;
    private String name;
    private String continent;
    private String type;
    private String size;

    public Airports(String iata, String iso, int status, String name, String continent, String type, String size) {
        this.iata = iata;
        this.iso = iso;
        this.status = status;
        this.name = name;
        this.continent = continent;
        this.type = type;
        this.size = size;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public Airports() {
    }

    @Override
    public String toString() {
        return "Airports{" + "iata=" + iata + ", iso=" + iso + ", status=" + status + ", name=" + name + ", continent=" + continent + ", type=" + type + ", size=" + size + '}';
    }

   
    
}
