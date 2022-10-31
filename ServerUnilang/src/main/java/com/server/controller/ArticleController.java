package com.server.controller;

import com.server.database.entity.Articles;
import com.server.database.entity.Ratingarticles;
import com.server.model.ArticleModel;
import com.server.repository.ArticlesReposetory;
import com.server.repository.CategoryRepository;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ArticleController {
    
    private NumberFormat formatter = new DecimalFormat("#0.00");
    
    @Autowired
    private ArticlesReposetory articlesRep; 
    @Autowired 
    private CategoryRepository catRep;
    
    @RequestMapping(value = {"/articles"}, method = RequestMethod.GET)
    public String articles(Model model) {
        
        List <Articles> listArticle = articlesRep.findAll();
        List <ArticleModel> newListArticle = new ArrayList<ArticleModel>();
        
        for (Object o: listArticle) {
            Articles a = (Articles) o;
            ArticleModel am = new ArticleModel();
            am.setIdArticle(a.getIdArticles());
            am.setCategory(a.getCategory());
            am.setContent(a.getContent());
            am.setImageHref(a.getImageHref());
            am.setName(a.getName());
            
            double averageMark = 0;
            
            for (Object o1: a.getRatingarticlesList()) {
                Ratingarticles rating = (Ratingarticles) o1;
                averageMark += rating.getMark();
            }
            
            if (a.getRatingarticlesList().size() != 0 && averageMark != 0) {
                averageMark = Double.parseDouble(averageMark +"") / Double.parseDouble(a.getRatingarticlesList().size()+"");
                averageMark = Double.parseDouble(formatter.format(averageMark));
            }
            
            am.setAverageMark(averageMark);
            
            
            newListArticle.add(am);
        }
        
        
        model.addAttribute("articles", newListArticle);
        model.addAttribute("category", catRep.findAll());
        return "articles";
    }
    
    @RequestMapping(value = {"/article_one"}, method = RequestMethod.GET)
    public String articlesOne() {
        return "article_one";
    }
    
}
