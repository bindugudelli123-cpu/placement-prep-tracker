package com.placement.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.placement.tracker.entity.InterviewSchedule;
import com.placement.tracker.repository.InterviewScheduleRepository;

@RestController
@RequestMapping("/api/interviews")
public class InterviewScheduleController {

    @Autowired
    private InterviewScheduleRepository interviewScheduleRepository;

    // Create Interview Schedule
    @PostMapping
    public InterviewSchedule createInterviewSchedule(
            @RequestBody InterviewSchedule interviewSchedule) {
        return interviewScheduleRepository.save(interviewSchedule);
    }

    // Get All Interview Schedules
    @GetMapping
    public List<InterviewSchedule> getAllInterviewSchedules() {
        return interviewScheduleRepository.findAll();
    }
}