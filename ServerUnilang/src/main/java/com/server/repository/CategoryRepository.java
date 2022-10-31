package com.server.repository;

import com.server.database.entity.Category;
import org.springframework.data.repository.CrudRepository;


public interface CategoryRepository extends CrudRepository<Category, Integer>{
    
}
