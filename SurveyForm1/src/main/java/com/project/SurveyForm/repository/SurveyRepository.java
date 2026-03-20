package com.project.SurveyForm.repository;

import com.project.SurveyForm.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey, Long> {
}
