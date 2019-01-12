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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kameni
 */
@Entity
@Table(name = "grupa_specifikacija")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GrupaSpecifikacija.findAll", query = "SELECT g FROM GrupaSpecifikacija g")
    , @NamedQuery(name = "GrupaSpecifikacija.findByGsId", query = "SELECT g FROM GrupaSpecifikacija g WHERE g.gsId = :gsId")
    , @NamedQuery(name = "GrupaSpecifikacija.findByGsNaziv", query = "SELECT g FROM GrupaSpecifikacija g WHERE g.gsNaziv = :gsNaziv")})
public class GrupaSpecifikacija implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "gs_id")
    private Integer gsId;
    @Size(max = 50)
    @Column(name = "gs_naziv")
    private String gsNaziv;
    @OneToMany(mappedBy = "gsId")
    private List<Specifikacija> specifikacijaList;

    public GrupaSpecifikacija() {
    }

    public GrupaSpecifikacija(Integer gsId) {
        this.gsId = gsId;
    }

    public Integer getGsId() {
        return gsId;
    }

    public void setGsId(Integer gsId) {
        this.gsId = gsId;
    }

    public String getGsNaziv() {
        return gsNaziv;
    }

    public void setGsNaziv(String gsNaziv) {
        this.gsNaziv = gsNaziv;
    }

    @XmlTransient
    public List<Specifikacija> getSpecifikacijaList() {
        return specifikacijaList;
    }

    public void setSpecifikacijaList(List<Specifikacija> specifikacijaList) {
        this.specifikacijaList = specifikacijaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gsId != null ? gsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrupaSpecifikacija)) {
            return false;
        }
        GrupaSpecifikacija other = (GrupaSpecifikacija) object;
        if ((this.gsId == null && other.gsId != null) || (this.gsId != null && !this.gsId.equals(other.gsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "main.GrupaSpecifikacija[ gsId=" + gsId + " ]";
    }
    
}
