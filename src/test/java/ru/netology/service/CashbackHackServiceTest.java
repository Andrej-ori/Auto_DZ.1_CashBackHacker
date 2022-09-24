package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    // меньше нуля на 1
    public void lessThanZeroBy1() {
        assertThrows(RuntimeException.class, () ->{
            service.remain(-1);
        });
    }

    @Test
    // равен нулю
    public void equalsZero() {
        assertEquals(1000, service.remain(0));
    }

    @Test
    // больше нуля на 1
    public void greaterThanZeroBy1() {
        assertEquals(999, service.remain(1));
    }

    @Test
    // меньше лимита
    public void lessThanTheLimit() {
        assertEquals(700, service.remain(300));
    }

    @Test
    // меньше лимита на 1
    public void lessThanTheLimitBy1() {
        assertEquals(1, service.remain(999));
    }

    @Test
    // равно лимиту
    public void equalToTheLimit() {
        assertEquals(0, service.remain(1000));
    }

    @Test
    // больше лимита на 1
    public void moreThanTheLimitBy1() {
        assertEquals(999, service.remain(1001));
    }

    @Test
    // больше лимита
    public void overLimit() {
        assertEquals(600, service.remain(1400));
    }

    @Test
    // кратно лимиту
    public void multipleOfTheLimit() {
        assertEquals(0, service.remain(3000));
    }
}