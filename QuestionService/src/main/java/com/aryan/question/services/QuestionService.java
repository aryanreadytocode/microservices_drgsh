package com.aryan.question.services;

import com.aryan.question.entities.Question;

import java.util.List;

public interface QuestionService {

    Question add(Question Question);

    List<Question> get();

    Question get(Long id);

    List<Question> getQuestionsOfQuiz(Long quidId);

}
