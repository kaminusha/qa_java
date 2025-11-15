package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class LionParamMaleFemaleTest {
    private Feline feline;
    private final String gender;
    private final boolean hasMane;

    public LionParamMaleFemaleTest(String gender, boolean hasMane) {
        this.gender = gender;
        this.hasMane = hasMane;
    }

    @Before
    public void init () {
        feline = Mockito.mock(Feline.class);
    }

    @Parameterized.Parameters(name = "Sex {0}: {1}")
    public static Object[][] getSex() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void testLionHasMane() throws Exception {
    Lion lion = new Lion(gender, feline);
    boolean actualHasMane = lion.doesHaveMane();
    Assert.assertEquals(hasMane,actualHasMane);
    }
}