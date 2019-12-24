package ru.otus.spring.csv;

import java.io.IOException;

public interface Commands {

    void printQuestions() throws IOException;

    void askAnswers() throws IOException;

    int getWrightAnswersNumber();

    int getUserMark();
}
