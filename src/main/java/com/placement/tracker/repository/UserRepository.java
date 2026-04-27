package com.placement.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.placement.tracker.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
