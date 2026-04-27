package com.placement.tracker.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "dsa_progress")
public class DsaProgress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "topic_name", nullable = false)
    private String topicName;

    @Column(name = "problem_name", nullable = false)
    private String problemName;

    @Column(name = "difficulty")
    private String difficulty;

    @Column(name = "solved_status")
    private Boolean solvedStatus;

    @Column(name = "solved_date")
    private LocalDate solvedDate;

    @Column(columnDefinition = "TEXT")
    private String notes;

    public DsaProgress() {
    }

    public DsaProgress(String topicName, String problemName,
                       String difficulty, Boolean solvedStatus,
                       LocalDate solvedDate, String notes) {
        this.topicName = topicName;
        this.problemName = problemName;
        this.difficulty = difficulty;
        this.solvedStatus = solvedStatus;
        this.solvedDate = solvedDate;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public Boolean getSolvedStatus() {
        return solvedStatus;
    }

    public void setSolvedStatus(Boolean solvedStatus) {
        this.solvedStatus = solvedStatus;
    }

    public LocalDate getSolvedDate() {
        return solvedDate;
    }

    public void setSolvedDate(LocalDate solvedDate) {
        this.solvedDate = solvedDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
