package ru.otus.spring;

import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import ru.otus.spring.app.TesterApp;
import ru.otus.spring.student.Stud;


import java.io.*;

@ComponentScan
//@PropertySource("src/main/properties/info.property")

public class Main {
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConf(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        TesterApp app = context.getBean(TesterApp.class);
        app.startApplication();


    }
}
