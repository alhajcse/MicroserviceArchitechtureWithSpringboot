package com.service.gateway.apigatewayservice.service;

import com.service.gateway.apigatewayservice.model.User;

public interface UserService {

    void savUser(User user);


    boolean existsByUserName(String userName);

    boolean existsByEmail(String email);




}
