package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;

        int actual = cashbackHackService.remain(amount);
        int expected = 1;
        assertEquals(expected,actual);

    }
    @Test
    void minValue() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(expected,actual);

    }
    @Test
    void negativeMeaning() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = -1;

        int actual = cashbackHackService.remain(amount);
        int expected = 1001;
        assertEquals(expected,actual);

    }
    @Test
    void equalValue() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(expected,actual);

    }
}