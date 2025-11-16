package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

//Тестируем класс Cat
@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private Cat cat;

    @Mock
    private Feline feline;

    @Before
    public void init() {
        cat = new Cat(feline);
    }

    // Проверяем, что кот издает звук "Мяу"
    @Test
    public void testGetReturnCatSound() {
        assertEquals("Мяу", cat.getSound());
    }

    // Проверяем, что при вызове getFood происходит делегирование методу eatMeat объекта Feline
    @Test
    public void  testGetFoodEatMeatOnFeline() throws Exception {
        cat.getFood(); // вызываем метод
        verify(feline).eatMeat(); // проверяем, что eatMeat был вызван
    }

    // Проверяем, что getFood возвращает список еды- полученный от eatMeat
    @Test
    public void testGetFoodReturnFromEatMeat() throws Exception{
        List <String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(expectedFood); // настраиваем метод

        List<String> actualFood = cat.getFood(); // вызываем метод

        assertEquals(expectedFood, actualFood); // проверяем результат

    }
}
