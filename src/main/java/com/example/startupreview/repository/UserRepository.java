package com.example.startupreview.repository;

import com.example.startupreview.beans.User;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

     @Query(value = "select * from user u where u.email= ?1 and u.password= ?2 ", nativeQuery = true)
     List<User> verifySignin(String email, String password);
}
