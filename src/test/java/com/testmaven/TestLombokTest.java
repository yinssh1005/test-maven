package com.testmaven;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class TestLombokTest {

    @org.junit.jupiter.api.Test
    void returnAStr() {
        Assertions.assertFalse(true);
    }

    @org.junit.jupiter.api.Test
    void getStr1() {
        Assertions.assertFalse("1".equals("2"));
    }

    @org.junit.jupiter.api.Test
    void setStr1() {
    }
}