package com.server.model;

import com.server.database.entity.Category;
import com.server.database.entity.Users;
import lombok.Data;

@Data
public class ArticleModel {
    
    int idArticle;
    String name;
    String describe;
    String imageHref;
    Category category;
    Users userCreator;
    String content;
    double averageMark;
    
}
