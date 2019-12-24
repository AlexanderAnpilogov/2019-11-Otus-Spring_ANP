package ru.otus.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.spring.app.TesterApp;
import ru.otus.spring.student.Stud;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TesterApp app = context.getBean(TesterApp.class);

        app.startApplication();

    }
}
