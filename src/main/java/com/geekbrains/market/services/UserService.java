package com.geekbrains.market.services;

import com.geekbrains.market.entities.SystemUser;
import com.geekbrains.market.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByUserName(String userName);
    void save(SystemUser systemUser);
}
