package ru.netology.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class CashbackHackServiceTest {


    @Test
    public void remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;

        int actual = cashbackHackService.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);

    }

    @Test
    public void minValue() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);

    }

    @Test
    public void negativeMeaning() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = -1;

        int actual = cashbackHackService.remain(amount);
        int expected = 1001;
        assertEquals(expected, actual);

    }

    @Test
    public void equalValue() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);

    }
}
    
