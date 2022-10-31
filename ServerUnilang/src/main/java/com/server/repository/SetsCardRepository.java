package com.server.repository;

import com.server.database.entity.Setcards;
import org.springframework.data.repository.CrudRepository;


public interface SetsCardRepository extends CrudRepository<Setcards, Integer>{
    
}
