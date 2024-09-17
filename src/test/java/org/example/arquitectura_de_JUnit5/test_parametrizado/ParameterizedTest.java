package org.example.arquitectura_de_JUnit5.test_parametrizado;

import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedTest {

    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource(ints = {1,2,3,4})

    public void checkValue(int number) {
        assertTrue(number > 0  && number < 5);
    }


    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource(strings = {"java exercise", "JUnit test", "Digital House"})

    public void checkContainsWhiteSpace (String argument) {
        assertTrue(StringUtils.containsWhitespace(argument));
    }

}