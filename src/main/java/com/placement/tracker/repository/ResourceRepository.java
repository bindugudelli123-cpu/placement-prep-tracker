package com.placement.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.placement.tracker.entity.Resource;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {

}