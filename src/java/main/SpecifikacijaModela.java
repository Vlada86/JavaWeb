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
@Table(name = "specifikacija_modela")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SpecifikacijaModela.findAll", query = "SELECT s FROM SpecifikacijaModela s")
    , @NamedQuery(name = "SpecifikacijaModela.findBySmId", query = "SELECT s FROM SpecifikacijaModela s WHERE s.smId = :smId")
    , @NamedQuery(name = "SpecifikacijaModela.findBySmVrednost", query = "SELECT s FROM SpecifikacijaModela s WHERE s.smVrednost = :smVrednost")})
public class SpecifikacijaModela implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sm_id")
    private Integer smId;
    @Size(max = 250)
    @Column(name = "sm_vrednost")
    private String smVrednost;
    @JoinColumn(name = "tel_id", referencedColumnName = "tel_id")
    @ManyToOne
    private Telefoni telId;
    @JoinColumn(name = "spc_id", referencedColumnName = "spc_id")
    @ManyToOne
    private Specifikacija spcId;

    public SpecifikacijaModela() {
    }

    public SpecifikacijaModela(Integer smId) {
        this.smId = smId;
    }

    public Integer getSmId() {
        return smId;
    }

    public void setSmId(Integer smId) {
        this.smId = smId;
    }

    public String getSmVrednost() {
        return smVrednost;
    }

    public void setSmVrednost(String smVrednost) {
        this.smVrednost = smVrednost;
    }

    public Telefoni getTelId() {
        return telId;
    }

    public void setTelId(Telefoni telId) {
        this.telId = telId;
    }

    public Specifikacija getSpcId() {
        return spcId;
    }

    public void setSpcId(Specifikacija spcId) {
        this.spcId = spcId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (smId != null ? smId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SpecifikacijaModela)) {
            return false;
        }
        SpecifikacijaModela other = (SpecifikacijaModela) object;
        if ((this.smId == null && other.smId != null) || (this.smId != null && !this.smId.equals(other.smId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "main.SpecifikacijaModela[ smId=" + smId + " ]";
    }
    
}
