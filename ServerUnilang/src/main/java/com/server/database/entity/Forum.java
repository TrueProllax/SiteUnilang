/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.server.database.entity;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "forum")
@XmlRootElement
public class Forum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idBlock")
    private Integer idBlock;
    @Column(name = "name")
    private String name;
    @Column(name = "describe")
    private String describe;
    @JoinColumn(name = "category", referencedColumnName = "idCategory")
    @ManyToOne
    private Category category;
    @JoinColumn(name = "userCreator", referencedColumnName = "idUser")
    @ManyToOne
    private Users userCreator;
    @OneToMany(mappedBy = "blockForum")
    private List<Forumtags> forumtagsList;

    public Forum() {
    }

    public Forum(Integer idBlock) {
        this.idBlock = idBlock;
    }

    public Integer getIdBlock() {
        return idBlock;
    }

    public void setIdBlock(Integer idBlock) {
        this.idBlock = idBlock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
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
    public List<Forumtags> getForumtagsList() {
        return forumtagsList;
    }

    public void setForumtagsList(List<Forumtags> forumtagsList) {
        this.forumtagsList = forumtagsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBlock != null ? idBlock.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Forum)) {
            return false;
        }
        Forum other = (Forum) object;
        if ((this.idBlock == null && other.idBlock != null) || (this.idBlock != null && !this.idBlock.equals(other.idBlock))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.server.persistance.entity.Forum[ idBlock=" + idBlock + " ]";
    }
    
}
