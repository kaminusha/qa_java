package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FelineTest {
    Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void testGetReturnCat() {
        String actualFelineName = feline.getFamily();
        String expectedFelineName = "Кошачьи";
        Assert.assertEquals(expectedFelineName, actualFelineName);
    }

    @Test
    public void testFelineMeat() throws Exception{
        Animal animal = new Animal();
        List <String> actualFelineEatMeat = animal.getFood("Хищник");
        List <String> expectedFelineEatMeat = feline.eatMeat();
        Assert.assertEquals(expectedFelineEatMeat, actualFelineEatMeat);
    }

    @Test
    public void testGetKittenWithoutArgumentsShouldReturn1() {
        int actualWithoutArguments = feline.getKittens();
        int expectedWithoutArguments = 1;
        Assert.assertEquals(expectedWithoutArguments, actualWithoutArguments);
    }

    @Test
    public void testGetKittensWithParameterReturnPassedValueAsKittens() {
        int actualWithParameterReturn = feline.getKittens(8);
        int expectedWithParameterReturn = 8;
        Assert.assertEquals(expectedWithParameterReturn, actualWithParameterReturn);
    }
}
