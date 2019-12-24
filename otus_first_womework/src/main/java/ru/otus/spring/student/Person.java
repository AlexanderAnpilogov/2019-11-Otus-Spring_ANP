package ru.otus.spring.student;

public interface Person {
    String name = null;
    String surname = null;

    void setNama(String nama);

    void setSurNama(String surNama);

    String getNama();

    String getSurnama();
}
