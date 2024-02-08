package com.aryan.question.impl;

import com.aryan.question.entities.Question;
import com.aryan.question.repositories.QuestionRepository;
import com.aryan.question.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;


    @Override
    public Question add(Question quiz) {
        return questionRepository.save(quiz);
    }

    @Override
    public List<Question> get() {
        return questionRepository.findAll();
    }

    @Override
    public Question get(Long id) {
        return questionRepository.findById(id).orElseThrow( () -> new RuntimeException("Quiz not found"));
    }

    @Override
    public List<Question> getQuestionsOfQuiz(Long quidId) {
        return questionRepository.findByQuizId(quidId);
    }
}