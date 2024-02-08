package com.aryan.question.repositories;

import com.aryan.question.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    public List<Question> findByQuizId(Long quizId);

}
