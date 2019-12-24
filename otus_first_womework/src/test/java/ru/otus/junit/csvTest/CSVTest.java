package ru.otus.junit.csvTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CSVTest {
    int studentMark = 0;

    @DisplayName("Правильно возвращает оценку студента")
    @Test
    void getUserMark() {
        //...
    }

    @DisplayName("Возвращает верное колиество правильных ответов ")
    @Test
    void shouldGetWrightAnswersNumber() {
        //пока сложновато, надо идти дальше
    }

    @DisplayName("Правильно ситывает вопросы из questions.csv и выводит их в консоль")
    @Test
    void shouldPrintQuestions() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("E:\\OTUS2019\\src\\main\\resources\\questions.csv"));

        List<String> list = new ArrayList<String>();

        int i = 0;
        String a;
        while (!(a = reader.readLine()).isEmpty()) {
            list.add(a);
            i++;
        }
        assertEquals(15, i);
        assertEquals("варианты: 1)----; 2)=====; 3)dadad; 4)daad", list.get(14));
    }

}