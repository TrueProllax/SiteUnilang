package com.server.database.entity;

import com.server.database.entity.Articles;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "users")
@XmlRootElement
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUser")
    private Integer idUser;
    @Column(name = "fullName")
    private String fullName;
    @Column(name = "dateRegistration")
    @Temporal(TemporalType.DATE)
    private Date dateRegistration;
    @Column(name = "nick")
    private String nick;
    @Column(name = "email")
    private String email;
    @Column(name = "active")
    private Boolean active;
    @OneToMany(mappedBy = "userCreator")
    private List<Forum> forumList;
    @OneToMany(mappedBy = "user")
    private List<Ratingsets> ratingsetsList;
    @OneToMany(mappedBy = "userCreator")
    private List<Sets> setsList;
    @OneToMany(mappedBy = "user")
    private List<Ratingarticles> ratingarticlesList;
    @OneToMany(mappedBy = "userCreator")
    private List<Articles> articlesList;

    public Users() {
    }

    public Users(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @XmlTransient
    public List<Forum> getForumList() {
        return forumList;
    }

    public void setForumList(List<Forum> forumList) {
        this.forumList = forumList;
    }

    @XmlTransient
    public List<Ratingsets> getRatingsetsList() {
        return ratingsetsList;
    }

    public void setRatingsetsList(List<Ratingsets> ratingsetsList) {
        this.ratingsetsList = ratingsetsList;
    }

    @XmlTransient
    public List<Sets> getSetsList() {
        return setsList;
    }

    public void setSetsList(List<Sets> setsList) {
        this.setsList = setsList;
    }

    @XmlTransient
    public List<Ratingarticles> getRatingarticlesList() {
        return ratingarticlesList;
    }

    public void setRatingarticlesList(List<Ratingarticles> ratingarticlesList) {
        this.ratingarticlesList = ratingarticlesList;
    }

    @XmlTransient
    public List<Articles> getArticlesList() {
        return articlesList;
    }

    public void setArticlesList(List<Articles> articlesList) {
        this.articlesList = articlesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.server.persistance.entity.Users[ idUser=" + idUser + " ]";
    }
    
}
