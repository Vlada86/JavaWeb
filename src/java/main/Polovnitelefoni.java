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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "polovnitelefoni")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Polovnitelefoni.findAll", query = "SELECT p FROM Polovnitelefoni p")
    , @NamedQuery(name = "Polovnitelefoni.findByPtId", query = "SELECT p FROM Polovnitelefoni p WHERE p.ptId = :ptId")
    , @NamedQuery(name = "Polovnitelefoni.findByPtCena", query = "SELECT p FROM Polovnitelefoni p WHERE p.ptCena = :ptCena")
    , @NamedQuery(name = "Polovnitelefoni.findByPtModel", query = "SELECT p FROM Polovnitelefoni p WHERE p.ptModel = :ptModel")
    , @NamedQuery(name = "Polovnitelefoni.findByPtDisplej", query = "SELECT p FROM Polovnitelefoni p WHERE p.ptDisplej = :ptDisplej")
    , @NamedQuery(name = "Polovnitelefoni.findByPtRammemorija", query = "SELECT p FROM Polovnitelefoni p WHERE p.ptRammemorija = :ptRammemorija")
    , @NamedQuery(name = "Polovnitelefoni.findByPtProcesor", query = "SELECT p FROM Polovnitelefoni p WHERE p.ptProcesor = :ptProcesor")
    , @NamedQuery(name = "Polovnitelefoni.findByPtKraciopis", query = "SELECT p FROM Polovnitelefoni p WHERE p.ptKraciopis = :ptKraciopis")})
public class Polovnitelefoni implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pt_id")
    private Integer ptId;
    @Size(max = 50)
    @Column(name = "pt_cena")
    private String ptCena;
    @Size(max = 50)
    @Column(name = "pt_model")
    private String ptModel;
    @Size(max = 50)
    @Column(name = "pt_displej")
    private String ptDisplej;
    @Size(max = 50)
    @Column(name = "pt_rammemorija")
    private String ptRammemorija;
    @Size(max = 50)
    @Column(name = "pt_procesor")
    private String ptProcesor;
    @Size(max = 250)
    @Column(name = "pt_kraciopis")
    private String ptKraciopis;
    @JoinColumn(name = "kor_id", referencedColumnName = "kor_id")
    @ManyToOne
    private Korisnik korId;

    public Polovnitelefoni() {
    }

    public Polovnitelefoni(String ptCena, String ptModel, String ptDisplej, String ptRammemorija, String ptProcesor, String ptKraciopis) {
        this.ptCena = ptCena;
        this.ptModel = ptModel;
        this.ptDisplej = ptDisplej;
        this.ptRammemorija = ptRammemorija;
        this.ptProcesor = ptProcesor;
        this.ptKraciopis = ptKraciopis;
    }

    

    public Polovnitelefoni(Integer ptId) {
        this.ptId = ptId;
    }

    public Integer getPtId() {
        return ptId;
    }

    public void setPtId(Integer ptId) {
        this.ptId = ptId;
    }

    public String getPtCena() {
        return ptCena;
    }

    public void setPtCena(String ptCena) {
        this.ptCena = ptCena;
    }

    public String getPtModel() {
        return ptModel;
    }

    public void setPtModel(String ptModel) {
        this.ptModel = ptModel;
    }

    public String getPtDisplej() {
        return ptDisplej;
    }

    public void setPtDisplej(String ptDisplej) {
        this.ptDisplej = ptDisplej;
    }

    public String getPtRammemorija() {
        return ptRammemorija;
    }

    public void setPtRammemorija(String ptRammemorija) {
        this.ptRammemorija = ptRammemorija;
    }

    public String getPtProcesor() {
        return ptProcesor;
    }

    public void setPtProcesor(String ptProcesor) {
        this.ptProcesor = ptProcesor;
    }

    public String getPtKraciopis() {
        return ptKraciopis;
    }

    public void setPtKraciopis(String ptKraciopis) {
        this.ptKraciopis = ptKraciopis;
    }

    public Korisnik getKorId() {
        return korId;
    }

    public void setKorId(Korisnik korId) {
        this.korId = korId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ptId != null ? ptId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Polovnitelefoni)) {
            return false;
        }
        Polovnitelefoni other = (Polovnitelefoni) object;
        if ((this.ptId == null && other.ptId != null) || (this.ptId != null && !this.ptId.equals(other.ptId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "main.Polovnitelefoni[ ptId=" + ptId + " ]";
    }
    
}
