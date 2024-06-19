package com.example.bunker.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bunker.models.User;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(@Param("username") String username);
}

