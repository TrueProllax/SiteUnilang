
package com.server.repository;

import com.server.database.entity.Articles;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface ArticlesReposetory extends CrudRepository<Articles, Integer>{

    @Override
    public List<Articles> findAll();
    
    
}
