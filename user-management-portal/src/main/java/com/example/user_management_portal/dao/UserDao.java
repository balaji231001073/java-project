package com.example.user_management_portal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user_management_portal.entity.User;

@Repository
public interface UserDao extends JpaRepository <User, Long> {

}
