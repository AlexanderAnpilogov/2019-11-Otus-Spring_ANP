package ru.otus.junit.studTest;


import ru.otus.spring.student.Person;

public class Studo implements Person {
    private String name;
    private String surname;


    //не вьехал как инициализировать поля через mock-object, импровизировал, хотя весь этот класс можно сделать и внутренним...

    public Studo() {
    }


    Studo(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getSurname() {
        return surname;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void setNama(String nama) {
        this.setName(nama);

    }

    @Override
    public void setSurNama(String surNama) {
        this.setSurname(surNama);
    }

    @Override
    public String getNama() {
        return this.getName();
    }

    @Override
    public String getSurnama() {
        return this.getSurname();
    }
}
