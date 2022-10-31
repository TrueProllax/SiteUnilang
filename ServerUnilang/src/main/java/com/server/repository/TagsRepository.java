package com.server.repository;

import com.server.database.entity.Tags;
import org.springframework.data.repository.CrudRepository;


public interface TagsRepository extends CrudRepository<Tags, Integer>{
    
}
