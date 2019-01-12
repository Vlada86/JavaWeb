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
@Table(name = "korisnik")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Korisnik.findAll", query = "SELECT k FROM Korisnik k")
    , @NamedQuery(name = "Korisnik.findByKorId", query = "SELECT k FROM Korisnik k WHERE k.korId = :korId")
    , @NamedQuery(name = "Korisnik.findByKorIme", query = "SELECT k FROM Korisnik k WHERE k.korIme = :korIme")
    , @NamedQuery(name = "Korisnik.findByKorPrezime", query = "SELECT k FROM Korisnik k WHERE k.korPrezime = :korPrezime")
    , @NamedQuery(name = "Korisnik.findByKorEmail", query = "SELECT k FROM Korisnik k WHERE k.korEmail = :korEmail")
    , @NamedQuery(name = "Korisnik.findByKorPassword", query = "SELECT k FROM Korisnik k WHERE k.korPassword = :korPassword")
    , @NamedQuery(name = "Korisnik.findByKorFunkcija", query = "SELECT k FROM Korisnik k WHERE k.korFunkcija = :korFunkcija")})
public class Korisnik implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kor_id")
    private Integer korId;
    @Size(max = 50)
    @Column(name = "kor_ime")
    private String korIme;
    @Size(max = 50)
    @Column(name = "kor_prezime")
    private String korPrezime;
    @Size(max = 50)
    @Column(name = "kor_email")
    private String korEmail;
    @Size(max = 50)
    @Column(name = "kor_password")
    private String korPassword;
    @Size(max = 50)
    @Column(name = "kor_funkcija")
    private String korFunkcija;
    @OneToMany(mappedBy = "korId")
    private List<Polovnitelefoni> polovnitelefoniList;
    @OneToMany(mappedBy = "korId")
    private List<Telefoni> telefoniList;
    @OneToMany(mappedBy = "korId")
    private List<Korpa> korpaList;

    public Korisnik() {
    }

    public Korisnik(Integer korId) {
        this.korId = korId;
    }

    public Integer getKorId() {
        return korId;
    }

    public void setKorId(Integer korId) {
        this.korId = korId;
    }

    public String getKorIme() {
        return korIme;
    }

    public void setKorIme(String korIme) {
        this.korIme = korIme;
    }

    public String getKorPrezime() {
        return korPrezime;
    }

    public void setKorPrezime(String korPrezime) {
        this.korPrezime = korPrezime;
    }

    public String getKorEmail() {
        return korEmail;
    }

    public void setKorEmail(String korEmail) {
        this.korEmail = korEmail;
    }

    public String getKorPassword() {
        return korPassword;
    }

    public void setKorPassword(String korPassword) {
        this.korPassword = korPassword;
    }

    public String getKorFunkcija() {
        return korFunkcija;
    }

    public void setKorFunkcija(String korFunkcija) {
        this.korFunkcija = korFunkcija;
    }

    @XmlTransient
    public List<Polovnitelefoni> getPolovnitelefoniList() {
        return polovnitelefoniList;
    }

    public void setPolovnitelefoniList(List<Polovnitelefoni> polovnitelefoniList) {
        this.polovnitelefoniList = polovnitelefoniList;
    }

    @XmlTransient
    public List<Telefoni> getTelefoniList() {
        return telefoniList;
    }

    public void setTelefoniList(List<Telefoni> telefoniList) {
        this.telefoniList = telefoniList;
    }

    @XmlTransient
    public List<Korpa> getKorpaList() {
        return korpaList;
    }

    public void setKorpaList(List<Korpa> korpaList) {
        this.korpaList = korpaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (korId != null ? korId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Korisnik)) {
            return false;
        }
        Korisnik other = (Korisnik) object;
        if ((this.korId == null && other.korId != null) || (this.korId != null && !this.korId.equals(other.korId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "main.Korisnik[ korId=" + korId + " ]";
    }
    
}
