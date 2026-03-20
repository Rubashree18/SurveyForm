package com.project.SurveyForm.controller;


import com.project.SurveyForm.entity.Survey;
import com.project.SurveyForm.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/survey")
public class SurveyController {

    @Autowired
    private SurveyRepository repo;

    @PostMapping
    public Survey saveSurvey(@RequestBody Survey survey) {
        return repo.save(survey);
    }

    @GetMapping
    public List<Survey> getAll() {
        return repo.findAll();
    }
}
