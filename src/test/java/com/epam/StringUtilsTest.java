package com.epam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {
    StringUtils utils = new StringUtils();

    @Test
    void isPositiveNumber() {
        String str = "9";
        assertTrue(utils.isPositiveNumber(str));
    }

    @Test
    void isNotPositiveNumber() {
        String str = "-9";
        assertFalse(utils.isPositiveNumber(str));
    }
}