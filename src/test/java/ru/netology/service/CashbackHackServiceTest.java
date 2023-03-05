package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
        void remain() {
            CashbackHackService cashbackHackService = new CashbackHackService();
            int amount = 999;

            int actual = cashbackHackService.remain(amount);
            int expected = 1;
            assertEquals(actual, expected);

        }

        @Test
        void minValue() {
            CashbackHackService cashbackHackService = new CashbackHackService();
            int amount = 0;

            int actual = cashbackHackService.remain(amount);
            int expected = 1000;
            assertEquals(actual, expected);

        }
        @Test
        void negativeMeaning() {
            CashbackHackService cashbackHackService = new CashbackHackService();
            int amount = -1;

            int actual = cashbackHackService.remain(amount);
            int expected = 1001;
            assertEquals(actual, expected);

        }
        @Test
        void equalValue() {
            CashbackHackService cashbackHackService = new CashbackHackService();
            int amount = 1000;

            int actual = cashbackHackService.remain(amount);
            int expected = 0;
            assertEquals(actual, expected);

        }
    }

