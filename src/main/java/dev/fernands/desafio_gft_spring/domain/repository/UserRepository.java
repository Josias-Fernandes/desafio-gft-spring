package dev.fernands.desafio_gft_spring.domain.repository;

import dev.fernands.desafio_gft_spring.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    boolean existsByAccountNumber(String accountNumber);
}
