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
@Table(name = "proizvodi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proizvodi.findAll", query = "SELECT p FROM Proizvodi p")
    , @NamedQuery(name = "Proizvodi.findByProId", query = "SELECT p FROM Proizvodi p WHERE p.proId = :proId")
    , @NamedQuery(name = "Proizvodi.findByProNaziv", query = "SELECT p FROM Proizvodi p WHERE p.proNaziv = :proNaziv")})
public class Proizvodi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pro_id")
    private Integer proId;
    @Size(max = 50)
    @Column(name = "pro_naziv")
    private String proNaziv;
    @OneToMany(mappedBy = "proId")
    private List<Telefoni> telefoniList;

    public Proizvodi() {
    }

    public Proizvodi(Integer proId) {
        this.proId = proId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProNaziv() {
        return proNaziv;
    }

    public void setProNaziv(String proNaziv) {
        this.proNaziv = proNaziv;
    }

    @XmlTransient
    public List<Telefoni> getTelefoniList() {
        return telefoniList;
    }

    public void setTelefoniList(List<Telefoni> telefoniList) {
        this.telefoniList = telefoniList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proId != null ? proId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proizvodi)) {
            return false;
        }
        Proizvodi other = (Proizvodi) object;
        if ((this.proId == null && other.proId != null) || (this.proId != null && !this.proId.equals(other.proId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "main.Proizvodi[ proId=" + proId + " ]";
    }
    
}
