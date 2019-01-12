/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kameni
 */
@Entity
@Table(name = "servis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servis.findAll", query = "SELECT s FROM Servis s")
    , @NamedQuery(name = "Servis.findBySerId", query = "SELECT s FROM Servis s WHERE s.serId = :serId")
    , @NamedQuery(name = "Servis.findBySerPoruka", query = "SELECT s FROM Servis s WHERE s.serPoruka = :serPoruka")
    , @NamedQuery(name = "Servis.findBySerIme", query = "SELECT s FROM Servis s WHERE s.serIme = :serIme")
    , @NamedQuery(name = "Servis.findBySerPrezime", query = "SELECT s FROM Servis s WHERE s.serPrezime = :serPrezime")
    , @NamedQuery(name = "Servis.findBySerTelefon", query = "SELECT s FROM Servis s WHERE s.serTelefon = :serTelefon")})
public class Servis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ser_id")
    private Integer serId;
    @Size(max = 200)
    @Column(name = "ser_poruka")
    private String serPoruka;
    @Size(max = 50)
    @Column(name = "ser_ime")
    private String serIme;
    @Size(max = 50)
    @Column(name = "ser_prezime")
    private String serPrezime;
    @Size(max = 50)
    @Column(name = "ser_telefon")
    private String serTelefon;

    public Servis() {
    }

    public Servis(String serPoruka, String serIme, String serPrezime, String serTelefon) {
        this.serPoruka = serPoruka;
        this.serIme = serIme;
        this.serPrezime = serPrezime;
        this.serTelefon = serTelefon;
    }
    

    public Servis(Integer serId) {
        this.serId = serId;
    }

    public Integer getSerId() {
        return serId;
    }

    public void setSerId(Integer serId) {
        this.serId = serId;
    }

    public String getSerPoruka() {
        return serPoruka;
    }

    public void setSerPoruka(String serPoruka) {
        this.serPoruka = serPoruka;
    }

    public String getSerIme() {
        return serIme;
    }

    public void setSerIme(String serIme) {
        this.serIme = serIme;
    }

    public String getSerPrezime() {
        return serPrezime;
    }

    public void setSerPrezime(String serPrezime) {
        this.serPrezime = serPrezime;
    }

    public String getSerTelefon() {
        return serTelefon;
    }

    public void setSerTelefon(String serTelefon) {
        this.serTelefon = serTelefon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serId != null ? serId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servis)) {
            return false;
        }
        Servis other = (Servis) object;
        if ((this.serId == null && other.serId != null) || (this.serId != null && !this.serId.equals(other.serId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "main.Servis[ serId=" + serId + " ]";
    }
    
}
