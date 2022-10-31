/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.server.database.entity;

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
@Table(name = "forumtags")
@XmlRootElement
public class Forumtags {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idForumTags")
    private Integer idForumTags;
    @JoinColumn(name = "blockForum", referencedColumnName = "idBlock")
    @ManyToOne
    private Forum blockForum;
    @JoinColumn(name = "tag", referencedColumnName = "idTags")
    @ManyToOne
    private Tags tag;

    public Forumtags() {
    }

    public Forumtags(Integer idForumTags) {
        this.idForumTags = idForumTags;
    }

    public Integer getIdForumTags() {
        return idForumTags;
    }

    public void setIdForumTags(Integer idForumTags) {
        this.idForumTags = idForumTags;
    }

    public Forum getBlockForum() {
        return blockForum;
    }

    public void setBlockForum(Forum blockForum) {
        this.blockForum = blockForum;
    }

    public Tags getTag() {
        return tag;
    }

    public void setTag(Tags tag) {
        this.tag = tag;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idForumTags != null ? idForumTags.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Forumtags)) {
            return false;
        }
        Forumtags other = (Forumtags) object;
        if ((this.idForumTags == null && other.idForumTags != null) || (this.idForumTags != null && !this.idForumTags.equals(other.idForumTags))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.server.persistance.entity.Forumtags[ idForumTags=" + idForumTags + " ]";
    }
    
}
