package com.server.database.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@Entity
@Table(name = "sets")
@XmlRootElement
public class Sets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSet")
    private Integer idSet;
    @Column(name = "imageHref")
    private String imageHref;
    @Column(name = "name")
    private String name;
    @Column(name = "dateCreate")
    @Temporal(TemporalType.DATE)
    private Date dateCreate;
    @OneToMany(mappedBy = "set1")
    private List<Ratingsets> ratingsetsList;
    @JoinColumn(name = "category", referencedColumnName = "idCategory")
    @ManyToOne
    private Category category;
    @JoinColumn(name = "userCreator", referencedColumnName = "idUser")
    @ManyToOne
    private Users userCreator;
    @OneToMany(mappedBy = "set1")
    private List<Setcards> setcardsList;

    public Sets() {
    }

    public Sets(Integer idSet) {
        this.idSet = idSet;
    }

    public Integer getIdSet() {
        return idSet;
    }

    public void setIdSet(Integer idSet) {
        this.idSet = idSet;
    }

    public String getImageHref() {
        return imageHref;
    }

    public void setImageHref(String imageHref) {
        this.imageHref = imageHref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    @XmlTransient
    public List<Ratingsets> getRatingsetsList() {
        return ratingsetsList;
    }

    public void setRatingsetsList(List<Ratingsets> ratingsetsList) {
        this.ratingsetsList = ratingsetsList;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Users getUserCreator() {
        return userCreator;
    }

    public void setUserCreator(Users userCreator) {
        this.userCreator = userCreator;
    }

    @XmlTransient
    public List<Setcards> getSetcardsList() {
        return setcardsList;
    }

    public void setSetcardsList(List<Setcards> setcardsList) {
        this.setcardsList = setcardsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSet != null ? idSet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sets)) {
            return false;
        }
        Sets other = (Sets) object;
        if ((this.idSet == null && other.idSet != null) || (this.idSet != null && !this.idSet.equals(other.idSet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.server.persistance.entity.Sets[ idSet=" + idSet + " ]";
    }
    
}
