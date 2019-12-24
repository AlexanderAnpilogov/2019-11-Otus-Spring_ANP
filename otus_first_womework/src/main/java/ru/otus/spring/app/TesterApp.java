package ru.otus.spring.app;

import ru.otus.spring.csv.Commands;
import ru.otus.spring.student.Person;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesterApp {
    private final Commands csv;
    private Person student;

    public TesterApp(Commands csv, Person student) {
        this.csv = csv;
        this.student = student;
    }

    public void startApplication() throws IOException {
        identifyStudent();
        showQuestions();
        testEnding();
    }

    public void showQuestions() throws IOException {
        csv.printQuestions();
    }

    protected void askAnswers() throws IOException {
        csv.askAnswers();
    }

    public void identifyStudent() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("введите имя и фамилию...");
        String nama = reader.readLine();
        String surNama = reader.readLine();
        student.setNama(nama);
        student.setSurNama(surNama);
    }

    public void testEnding() {
        System.out.println("                                " + student.getNama() + " " + student.getSurnama());
       // csv.getUserMark();
    }
}
