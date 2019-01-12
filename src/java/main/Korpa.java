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
@Table(name = "korpa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Korpa.findAll", query = "SELECT k FROM Korpa k")
    , @NamedQuery(name = "Korpa.findByKpId", query = "SELECT k FROM Korpa k WHERE k.kpId = :kpId")
    , @NamedQuery(name = "Korpa.findByKpKupljeno", query = "SELECT k FROM Korpa k WHERE k.kpKupljeno = :kpKupljeno")})
public class Korpa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kp_id")
    private Integer kpId;
    @Size(max = 150)
    @Column(name = "kp_kupljeno")
    private String kpKupljeno;
    @JoinColumn(name = "kor_id", referencedColumnName = "kor_id")
    @ManyToOne
    private Korisnik korId;

    public Korpa() {
    }

    public Korpa(String kpKupljeno, Korisnik korId) {
        this.kpKupljeno = kpKupljeno;
        this.korId = korId;
    }

    public Korpa(Integer kpId) {
        this.kpId = kpId;
    }

    public Integer getKpId() {
        return kpId;
    }

    public void setKpId(Integer kpId) {
        this.kpId = kpId;
    }

    public String getKpKupljeno() {
        return kpKupljeno;
    }

    public void setKpKupljeno(String kpKupljeno) {
        this.kpKupljeno = kpKupljeno;
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
        hash += (kpId != null ? kpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Korpa)) {
            return false;
        }
        Korpa other = (Korpa) object;
        if ((this.kpId == null && other.kpId != null) || (this.kpId != null && !this.kpId.equals(other.kpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "main.Korpa[ kpId=" + kpId + " ]";
    }
    
}
