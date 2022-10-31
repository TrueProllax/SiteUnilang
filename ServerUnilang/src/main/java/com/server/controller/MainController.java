package com.server.controller;

import com.server.repository.ArticlesReposetory;
import com.server.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    
    
    @Autowired
    private ArticlesReposetory articlesRep; 
    @Autowired 
    private CategoryRepository catRep;
    
    
    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    
    @RequestMapping(value = {"/youglish"}, method = RequestMethod.GET)
    public String youglish() {
        return "youglish";
    }
    
    // sets

    @RequestMapping(value = {"/sets"}, method = RequestMethod.GET)
    public String sets() {
        return "sets";
    }
    
    @RequestMapping(value = {"/set_one"}, method = RequestMethod.GET)
    public String setsOne() {
        return "set_one";
    }
    
    // favorite
    
    @RequestMapping(value = {"/favorite_articles"}, method = RequestMethod.GET)
    public String favoriteArticles() {
        return "favorite_articles";
    }
    
    @RequestMapping(value = {"/favorite_sets"}, method = RequestMethod.GET)
    public String favoriteSets() {
        return "favorite_sets";
    }
    
    // forum
    
    @RequestMapping(value = {"/forum"}, method = RequestMethod.GET)
    public String forum() {
        return "forum";
    }
    
    
    
    // profile
    
    @RequestMapping(value = {"/profile"}, method = RequestMethod.GET)
    public String profile() {
        return "profile";
    }
    
    // auth
    
    @RequestMapping(value = {"/auth"}, method = RequestMethod.GET)
    public String auth() {
        return "auth";
    }
    
}
