package com.server.database.entity;

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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "tags")
@XmlRootElement
public class Tags {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTags")
    private Integer idTags;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "tag")
    private List<Forumtags> forumtagsList;

    public Tags() {
    }

    public Tags(Integer idTags) {
        this.idTags = idTags;
    }

    public Integer getIdTags() {
        return idTags;
    }

    public void setIdTags(Integer idTags) {
        this.idTags = idTags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<Forumtags> getForumtagsList() {
        return forumtagsList;
    }

    public void setForumtagsList(List<Forumtags> forumtagsList) {
        this.forumtagsList = forumtagsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTags != null ? idTags.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tags)) {
            return false;
        }
        Tags other = (Tags) object;
        if ((this.idTags == null && other.idTags != null) || (this.idTags != null && !this.idTags.equals(other.idTags))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.server.persistance.entity.Tags[ idTags=" + idTags + " ]";
    }
    
}
