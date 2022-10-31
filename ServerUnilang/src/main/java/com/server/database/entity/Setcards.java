package com.server.database.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "setcards")
@XmlRootElement
public class Setcards{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCard")
    private Integer idCard;
    @Column(name = "word")
    private String word;
    @Column(name = "tanslate")
    private String tanslate;
    @JoinColumn(name = "set", referencedColumnName = "idSet")
    @ManyToOne
    private Sets set1;

    public Setcards() {
    }

    public Setcards(Integer idCard) {
        this.idCard = idCard;
    }

    public Integer getIdCard() {
        return idCard;
    }

    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTanslate() {
        return tanslate;
    }

    public void setTanslate(String tanslate) {
        this.tanslate = tanslate;
    }

    public Sets getSet1() {
        return set1;
    }

    public void setSet1(Sets set1) {
        this.set1 = set1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCard != null ? idCard.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Setcards)) {
            return false;
        }
        Setcards other = (Setcards) object;
        if ((this.idCard == null && other.idCard != null) || (this.idCard != null && !this.idCard.equals(other.idCard))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.server.persistance.entity.Setcards[ idCard=" + idCard + " ]";
    }
    
}
