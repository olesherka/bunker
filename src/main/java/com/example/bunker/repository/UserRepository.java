package com.example.bunker.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bunker.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT u FROM User u WHERE LOWER(u.username) = LOWER(:username)")
    User findByUsername(@Param("username") String username);

    @Transactional
    void deleteById(Integer id);

    @Query(value = "SELECT * FROM User u", nativeQuery = true)
    List<User> getAllUsers();

    Optional<User> findById(Integer id);

}

