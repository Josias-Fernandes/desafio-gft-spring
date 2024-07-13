package dev.fernands.desafio_gft_spring.service;

import dev.fernands.desafio_gft_spring.domain.model.User;

public interface UserService {


    User findById(Long id);

    User create(User userToCreate);
}
