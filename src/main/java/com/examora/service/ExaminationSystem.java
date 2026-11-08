package com.examora.service;

import com.examora.model.*;

import java.util.ArrayList;
import java.util.List;

public class ExaminationSystem {

    private List<Student> students;
    private List<Doctor> doctors;
    private List<Course> courses;
    private List<QuestionBank> questionBanks;
    private List<Exam> exams;
    private List<ExamAttempt> examAttempts;

    public ExaminationSystem() {
        students = new ArrayList<>();
        doctors = new ArrayList<>();
        courses = new ArrayList<>();
        questionBanks = new ArrayList<>();
        exams = new ArrayList<>();
        examAttempts = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<QuestionBank> getQuestionBanks() {
        return questionBanks;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public List<ExamAttempt> getExamAttempts() {
        return examAttempts;
    }
}