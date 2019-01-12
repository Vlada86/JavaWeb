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
@Table(name = "akcijska_ponuda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AkcijskaPonuda.findAll", query = "SELECT a FROM AkcijskaPonuda a")
    , @NamedQuery(name = "AkcijskaPonuda.findByAkcId", query = "SELECT a FROM AkcijskaPonuda a WHERE a.akcId = :akcId")
    , @NamedQuery(name = "AkcijskaPonuda.findByAkcNaziv", query = "SELECT a FROM AkcijskaPonuda a WHERE a.akcNaziv = :akcNaziv")
    , @NamedQuery(name = "AkcijskaPonuda.findByAkcCena", query = "SELECT a FROM AkcijskaPonuda a WHERE a.akcCena = :akcCena")})
public class AkcijskaPonuda implements Serializable {

    @OneToMany(mappedBy = "akcId")
    private List<Telefoni> telefoniList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "akc_id")
    private Integer akcId;
    @Size(max = 50)
    @Column(name = "akc_naziv")
    private String akcNaziv;
    @Size(max = 50)
    @Column(name = "akc_cena")
    private String akcCena;
    @OneToMany(mappedBy = "akcId")
    private List<DodatnaOprema> dodatnaOpremaList;

    public AkcijskaPonuda() {
    }

    public AkcijskaPonuda(Integer akcId) {
        this.akcId = akcId;
    }

    public Integer getAkcId() {
        return akcId;
    }

    public void setAkcId(Integer akcId) {
        this.akcId = akcId;
    }

    public String getAkcNaziv() {
        return akcNaziv;
    }

    public void setAkcNaziv(String akcNaziv) {
        this.akcNaziv = akcNaziv;
    }

    public String getAkcCena() {
        return akcCena;
    }

    public void setAkcCena(String akcCena) {
        this.akcCena = akcCena;
    }

    @XmlTransient
    public List<DodatnaOprema> getDodatnaOpremaList() {
        return dodatnaOpremaList;
    }

    public void setDodatnaOpremaList(List<DodatnaOprema> dodatnaOpremaList) {
        this.dodatnaOpremaList = dodatnaOpremaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (akcId != null ? akcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AkcijskaPonuda)) {
            return false;
        }
        AkcijskaPonuda other = (AkcijskaPonuda) object;
        if ((this.akcId == null && other.akcId != null) || (this.akcId != null && !this.akcId.equals(other.akcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "main.AkcijskaPonuda[ akcId=" + akcId + " ]";
    }

    @XmlTransient
    public List<Telefoni> getTelefoniList() {
        return telefoniList;
    }

    public void setTelefoniList(List<Telefoni> telefoniList) {
        this.telefoniList = telefoniList;
    }
    
}
