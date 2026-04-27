package com.placement.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.placement.tracker.entity.JobApplication;
import com.placement.tracker.repository.JobApplicationRepository;

@RestController
@RequestMapping("/api/job-applications")
public class JobApplicationController {

    @Autowired
    private JobApplicationRepository jobApplicationRepository;

    // Create Job Application
    @PostMapping
    public JobApplication createJobApplication(@RequestBody JobApplication jobApplication) {
        return jobApplicationRepository.save(jobApplication);
    }

    // Get All Job Applications
    @GetMapping
    public List<JobApplication> getAllJobApplications() {
        return jobApplicationRepository.findAll();
    }
    
    @GetMapping("/company/{companyName}")
    public List<JobApplication> getJobApplicationsByCompanyName(
            @PathVariable String companyName) {
        return jobApplicationRepository.findByCompanyName(companyName);
    }
}
