package com.placement.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.placement.tracker.entity.Resource;
import com.placement.tracker.repository.ResourceRepository;

@RestController
@RequestMapping("/api/resources")
public class ResourceController {

    @Autowired
    private ResourceRepository resourceRepository;

    // Create Resource
    @PostMapping
    public Resource createResource(
            @RequestBody Resource resource) {
        return resourceRepository.save(resource);
    }

    // Get All Resources
    @GetMapping
    public List<Resource> getAllResources() {
        return resourceRepository.findAll();
    }
}
