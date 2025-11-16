package com.example;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

// Тестируем класс Feline
public class FelineTest {
   private Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    // Проверяем, что семейство животного — "Кошачьи"
    @Test
    public void testGetReturnCat() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    // Проверяем, что eatMeat() возвращает ожидаемый список еды
    @Test
    public void testFelineMeat() throws Exception{
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List <String> actualFood = feline.eatMeat();
        assertEquals(expectedFood, actualFood);
    }

    // Проверяем, что getKittens() без аргументов возвращает 1
    @Test
    public void testGetKittenWithoutArgumentsShouldReturn1() {
        assertEquals(1, feline.getKittens());
    }

    // Проверяем, что getKittens(int count) возвращает переданное значение
    @Test
    public void testGetKittensWithParameterReturnPassedValueAsKittens() {
        assertEquals(8, feline.getKittens(8));
    }
}
