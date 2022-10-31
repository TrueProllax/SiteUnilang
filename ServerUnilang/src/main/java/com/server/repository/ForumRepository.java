package com.server.repository;

import com.server.database.entity.Forum;
import org.springframework.data.repository.CrudRepository;

public interface ForumRepository extends CrudRepository<Forum, Integer> {
    
}
