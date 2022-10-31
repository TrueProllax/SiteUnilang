
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
@Table(name = "ratingsets")
@XmlRootElement
public class Ratingsets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRating")
    private Integer idRating;
    @Column(name = "mark")
    private Integer mark;
    @JoinColumn(name = "set", referencedColumnName = "idSet")
    @ManyToOne
    private Sets set1;
    @JoinColumn(name = "user", referencedColumnName = "idUser")
    @ManyToOne
    private Users user;

    public Ratingsets() {
    }

    public Ratingsets(Integer idRating) {
        this.idRating = idRating;
    }

    public Integer getIdRating() {
        return idRating;
    }

    public void setIdRating(Integer idRating) {
        this.idRating = idRating;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Sets getSet1() {
        return set1;
    }

    public void setSet1(Sets set1) {
        this.set1 = set1;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRating != null ? idRating.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ratingsets)) {
            return false;
        }
        Ratingsets other = (Ratingsets) object;
        if ((this.idRating == null && other.idRating != null) || (this.idRating != null && !this.idRating.equals(other.idRating))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.server.persistance.entity.Ratingsets[ idRating=" + idRating + " ]";
    }
    
}
