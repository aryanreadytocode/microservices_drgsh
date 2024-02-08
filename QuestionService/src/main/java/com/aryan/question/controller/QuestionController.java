package com.aryan.question.controller;

import com.aryan.question.entities.Question;
import com.aryan.question.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @PostMapping
    public Question create(@RequestBody Question question) {
        return questionService.add(question);
    }

    @GetMapping
    public List<Question> get() {
        return questionService.get();
    }

    @GetMapping("/{id}")
    public Question getOne(@PathVariable Long id) {
        return questionService.get(id);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionOfQuiz(@PathVariable Long quizId) {
        return questionService.getQuestionsOfQuiz(quizId);
    }

}
