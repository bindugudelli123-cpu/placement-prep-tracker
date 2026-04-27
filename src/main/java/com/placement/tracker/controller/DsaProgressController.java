package com.placement.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.placement.tracker.entity.DsaProgress;
import com.placement.tracker.repository.DsaProgressRepository;

@RestController
@RequestMapping("/api/dsa-progress")
public class DsaProgressController {

    @Autowired
    private DsaProgressRepository dsaProgressRepository;

    // Create DSA Progress
    @PostMapping
    public DsaProgress createDsaProgress(
            @RequestBody DsaProgress dsaProgress) {
        return dsaProgressRepository.save(dsaProgress);
    }

    // Get All DSA Progress
    @GetMapping
    public List<DsaProgress> getAllDsaProgress() {
        return dsaProgressRepository.findAll();
    }
}
