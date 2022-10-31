package io.javabrains.springsecurityjwt.repo;

import io.javabrains.springsecurityjwt.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUserName(String userName);
}
