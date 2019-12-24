package ru.otus.junit.studTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudTest {

    Studo stud = new Studo();

    @DisplayName("конструктор работает")
    @Test
    void constructorWorkjingWright(){
        Studo studo = new Studo("Name", "Surname");
        assertEquals("Name", studo.getNama());
        assertEquals("Surname", studo.getSurnama());
    }

    @DisplayName("методы интерфейса правильно переопределены и работают")
    @Test
    void WrightWorkingOfGetterAndSetter() {
        Studo student = new Studo();
        student.setNama("f");
        student.setSurNama("g");

        assertEquals("f", student.getNama());
        assertEquals("g", student.getSurnama());
    }
}
