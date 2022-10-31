
package com.server.database.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "articles")
@XmlRootElement
public class Articles {

    @Column(name = "describe")
    private String describe;
    @Column(name = "imageHref")
    private String imageHref;
    @Lob
    @Column(name = "content")
    private String content;
    @OneToMany(mappedBy = "articles")
    private List<Ratingarticles> ratingarticlesList;
    @JoinColumn(name = "category", referencedColumnName = "idCategory")
    @ManyToOne
    private Category category;
    @JoinColumn(name = "userCreator", referencedColumnName = "idUser")
    @ManyToOne
    private Users userCreator;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idArticles")        
    int idArticles;
    @Column(name = "name")        
    String name;

    public Articles() {
    }
    

    public Articles(int idArticles, String name) {
        this.idArticles = idArticles;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Articles{" + "idArticles=" + idArticles + ", name=" + name + '}';
    }

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getImageHref() {
        return imageHref;
    }

    public void setImageHref(String imageHref) {
        this.imageHref = imageHref;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @XmlTransient
    public List<Ratingarticles> getRatingarticlesList() {
        return ratingarticlesList;
    }

    public void setRatingarticlesList(List<Ratingarticles> ratingarticlesList) {
        this.ratingarticlesList = ratingarticlesList;
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

    public int getIdArticles() {
        return idArticles;
    }

    public void setIdArticles(int idArticles) {
        this.idArticles = idArticles;
    }
    
    
    
    
    
}
