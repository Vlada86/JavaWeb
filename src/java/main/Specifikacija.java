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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "specifikacija")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Specifikacija.findAll", query = "SELECT s FROM Specifikacija s")
    , @NamedQuery(name = "Specifikacija.findBySpcId", query = "SELECT s FROM Specifikacija s WHERE s.spcId = :spcId")
    , @NamedQuery(name = "Specifikacija.findBySpcNaziv", query = "SELECT s FROM Specifikacija s WHERE s.spcNaziv = :spcNaziv")})
public class Specifikacija implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "spc_id")
    private Integer spcId;
    @Size(max = 50)
    @Column(name = "spc_naziv")
    private String spcNaziv;
    @JoinColumn(name = "gs_id", referencedColumnName = "gs_id")
    @ManyToOne
    private GrupaSpecifikacija gsId;
    @OneToMany(mappedBy = "spcId")
    private List<SpecifikacijaModela> specifikacijaModelaList;

    public Specifikacija() {
    }

    public Specifikacija(Integer spcId) {
        this.spcId = spcId;
    }

    public Integer getSpcId() {
        return spcId;
    }

    public void setSpcId(Integer spcId) {
        this.spcId = spcId;
    }

    public String getSpcNaziv() {
        return spcNaziv;
    }

    public void setSpcNaziv(String spcNaziv) {
        this.spcNaziv = spcNaziv;
    }

    public GrupaSpecifikacija getGsId() {
        return gsId;
    }

    public void setGsId(GrupaSpecifikacija gsId) {
        this.gsId = gsId;
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
        hash += (spcId != null ? spcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Specifikacija)) {
            return false;
        }
        Specifikacija other = (Specifikacija) object;
        if ((this.spcId == null && other.spcId != null) || (this.spcId != null && !this.spcId.equals(other.spcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "main.Specifikacija[ spcId=" + spcId + " ]";
    }
    
}
