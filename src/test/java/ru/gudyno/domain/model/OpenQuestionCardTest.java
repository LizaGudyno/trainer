package ru.gudyno.domain.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;


class OpenQuestionCardTest {

    private OpenQuestionCard card;

    @BeforeEach
    @DisplayName("Подготовка тестового объекта")
    void setUp() {
        card = new OpenQuestionCard("цвет?", "синий");
    }

    @Test
    @DisplayName("Успешное создание карточки с вопросом и ожидаемым ответом")
    void given_validQuestionAndAnswer_when_newOpenQuestionCard_then_success() {
        assertNotNull(card);
        assertEquals("цвет?", card.getQuestion());
    }

    @Test
    @DisplayName("Создание карточки с пустым вопросом — должно выбрасываться исключение")
    void given_emptyQuestion_when_newOpenQuestionCard_then_exceptionThrown() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new OpenQuestionCard("", "синий")
        );
        assertEquals("question не может быть пустым", exception.getMessage());
    }

    @Test
    @DisplayName("Создание карточки с пустым ожидаемым ответом — должно выбрасываться исключение")
    void given_emptyExpectedAnswer_when_newOpenQuestionCard_then_exceptionThrown() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new OpenQuestionCard("цвет?", "")
        );
        assertEquals("expectedAnswer не может быть пустым", exception.getMessage());
    }



    @Test
    @DisplayName("Неправильный ответ должен быть отклонен")
    void given_incorrectAnswer_when_checkAnswer_then_false() {
        assertFalse(card.checkAnswer("пони"));
    }
}