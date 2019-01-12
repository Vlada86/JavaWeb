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
@Table(name = "dodatna_oprema_grupe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DodatnaOpremaGrupe.findAll", query = "SELECT d FROM DodatnaOpremaGrupe d")
    , @NamedQuery(name = "DodatnaOpremaGrupe.findByDogId", query = "SELECT d FROM DodatnaOpremaGrupe d WHERE d.dogId = :dogId")
    , @NamedQuery(name = "DodatnaOpremaGrupe.findByDogNaziv", query = "SELECT d FROM DodatnaOpremaGrupe d WHERE d.dogNaziv = :dogNaziv")})
public class DodatnaOpremaGrupe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "dog_id")
    private Integer dogId;
    @Size(max = 50)
    @Column(name = "dog_naziv")
    private String dogNaziv;
    @OneToMany(mappedBy = "dogId")
    private List<DodatnaOprema> dodatnaOpremaList;

    public DodatnaOpremaGrupe() {
    }

    public DodatnaOpremaGrupe(Integer dogId) {
        this.dogId = dogId;
    }

    public Integer getDogId() {
        return dogId;
    }

    public void setDogId(Integer dogId) {
        this.dogId = dogId;
    }

    public String getDogNaziv() {
        return dogNaziv;
    }

    public void setDogNaziv(String dogNaziv) {
        this.dogNaziv = dogNaziv;
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
        hash += (dogId != null ? dogId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DodatnaOpremaGrupe)) {
            return false;
        }
        DodatnaOpremaGrupe other = (DodatnaOpremaGrupe) object;
        if ((this.dogId == null && other.dogId != null) || (this.dogId != null && !this.dogId.equals(other.dogId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "main.DodatnaOpremaGrupe[ dogId=" + dogId + " ]";
    }
    
}
