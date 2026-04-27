package com.placement.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.placement.tracker.entity.DsaProgress;

@Repository
public interface DsaProgressRepository extends JpaRepository<DsaProgress, Long> {

}