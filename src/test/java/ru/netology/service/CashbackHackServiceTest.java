package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

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
        assertEquals(service.remain(0), 1000);
    }

    @Test
        // больше нуля на 1
    public void greaterThanZeroBy1() {
        assertEquals(service.remain(1), 999);
    }

    @Test
        // меньше лимита
    public void lessThanTheLimit() {
        assertEquals(service.remain(300), 700);
    }

    @Test
        // меньше лимита на 1
    public void lessThanTheLimitBy1() {
        assertEquals(service.remain(999), 1);
    }

    @Test
        // равно лимиту
    public void equalToTheLimit() {
        assertEquals(service.remain(1000), 0);
    }

    @Test
        // больше лимита на 1
    public void moreThanTheLimitBy1() {
        assertEquals(service.remain(1001), 999);
    }

    @Test
        // больше лимита
    public void overLimit() {
        assertEquals(service.remain(1400), 600);
    }

    @Test
        // кратно лимиту
    public void multipleOfTheLimit() {
        assertEquals(service.remain(3000), 0);
    }
}