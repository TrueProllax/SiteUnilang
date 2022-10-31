package com.server.repository;

import com.server.database.entity.Users;
import org.springframework.data.repository.CrudRepository;


public interface UsersRepository extends CrudRepository<Users, Integer>{
    
}
