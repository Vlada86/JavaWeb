/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kameni
 */
@Entity
@Table(name = "telefoni")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telefoni.findAll", query = "SELECT t FROM Telefoni t")
    , @NamedQuery(name = "Telefoni.findByTelId", query = "SELECT t FROM Telefoni t WHERE t.telId = :telId")
    , @NamedQuery(name = "Telefoni.findByTelNaziv", query = "SELECT t FROM Telefoni t WHERE t.telNaziv = :telNaziv")
    , @NamedQuery(name = "Telefoni.findByTelCena", query = "SELECT t FROM Telefoni t WHERE t.telCena = :telCena")})
public class Telefoni implements Serializable {

    @JoinColumn(name = "akc_id", referencedColumnName = "akc_id")
    @ManyToOne
    private AkcijskaPonuda akcId;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "tel_id")
    private Integer telId;
    @Size(max = 50)
    @Column(name = "tel_naziv")
    private String telNaziv;
    @Size(max = 50)
    @Column(name = "tel_cena")
    private String telCena;
    @JoinColumn(name = "pro_id", referencedColumnName = "pro_id")
    @ManyToOne
    private Proizvodi proId;
    @JoinColumn(name = "kor_id", referencedColumnName = "kor_id")
    @ManyToOne
    private Korisnik korId;
    @OneToMany(mappedBy = "telId")
    private List<SpecifikacijaModela> specifikacijaModelaList;

    public Telefoni() {
    }

    public Telefoni(Integer telId) {
        this.telId = telId;
    }

    public Integer getTelId() {
        return telId;
    }

    public void setTelId(Integer telId) {
        this.telId = telId;
    }

    public String getTelNaziv() {
        return telNaziv;
    }

    public void setTelNaziv(String telNaziv) {
        this.telNaziv = telNaziv;
    }

    public String getTelCena() {
        return telCena;
    }

    public void setTelCena(String telCena) {
        this.telCena = telCena;
    }

    public Proizvodi getProId() {
        return proId;
    }

    public void setProId(Proizvodi proId) {
        this.proId = proId;
    }

    public Korisnik getKorId() {
        return korId;
    }

    public void setKorId(Korisnik korId) {
        this.korId = korId;
    }

    @XmlTransient
    public List<SpecifikacijaModela> getSpecifikacijaModelaList() {
        return specifikacijaModelaList;
    }

    public void setSpecifikacijaModelaList(List<SpecifikacijaModela> specifikacijaModelaList) {
        this.specifikacijaModelaList = specifikacijaModelaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (telId != null ? telId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefoni)) {
            return false;
        }
        Telefoni other = (Telefoni) object;
        if ((this.telId == null && other.telId != null) || (this.telId != null && !this.telId.equals(other.telId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "main.Telefoni[ telId=" + telId + " ]";
    }

    public AkcijskaPonuda getAkcId() {
        return akcId;
    }

    public void setAkcId(AkcijskaPonuda akcId) {
        this.akcId = akcId;
    }
    
}
