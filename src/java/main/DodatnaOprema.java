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
@Table(name = "dodatna_oprema")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DodatnaOprema.findAll", query = "SELECT d FROM DodatnaOprema d")
    , @NamedQuery(name = "DodatnaOprema.findByDoId", query = "SELECT d FROM DodatnaOprema d WHERE d.doId = :doId")
    , @NamedQuery(name = "DodatnaOprema.findByDoVrednost", query = "SELECT d FROM DodatnaOprema d WHERE d.doVrednost = :doVrednost")
    , @NamedQuery(name = "DodatnaOprema.findByDoCena", query = "SELECT d FROM DodatnaOprema d WHERE d.doCena = :doCena")})
public class DodatnaOprema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "do_id")
    private Integer doId;
    @Size(max = 250)
    @Column(name = "do_vrednost")
    private String doVrednost;
    @Size(max = 50)
    @Column(name = "do_cena")
    private String doCena;
    @JoinColumn(name = "dog_id", referencedColumnName = "dog_id")
    @ManyToOne
    private DodatnaOpremaGrupe dogId;
    @JoinColumn(name = "akc_id", referencedColumnName = "akc_id")
    @ManyToOne
    private AkcijskaPonuda akcId;

    public DodatnaOprema() {
    }

    public DodatnaOprema(Integer doId) {
        this.doId = doId;
    }

    public Integer getDoId() {
        return doId;
    }

    public void setDoId(Integer doId) {
        this.doId = doId;
    }

    public String getDoVrednost() {
        return doVrednost;
    }

    public void setDoVrednost(String doVrednost) {
        this.doVrednost = doVrednost;
    }

    public String getDoCena() {
        return doCena;
    }

    public void setDoCena(String doCena) {
        this.doCena = doCena;
    }

    public DodatnaOpremaGrupe getDogId() {
        return dogId;
    }

    public void setDogId(DodatnaOpremaGrupe dogId) {
        this.dogId = dogId;
    }

    public AkcijskaPonuda getAkcId() {
        return akcId;
    }

    public void setAkcId(AkcijskaPonuda akcId) {
        this.akcId = akcId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (doId != null ? doId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DodatnaOprema)) {
            return false;
        }
        DodatnaOprema other = (DodatnaOprema) object;
        if ((this.doId == null && other.doId != null) || (this.doId != null && !this.doId.equals(other.doId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "main.DodatnaOprema[ doId=" + doId + " ]";
    }
    
}
