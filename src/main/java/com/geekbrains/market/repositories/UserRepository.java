package com.geekbrains.market.repositories;

import com.geekbrains.market.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findOneByUserName(String userName);
}
