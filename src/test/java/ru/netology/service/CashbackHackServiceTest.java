package ru.netology.service;

 // import org.testng.annotations.Test;

 // import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
        // меньше нуля на 1
    public void lessThanZeroBy1() {
        org.testng.Assert.assertThrows(RuntimeException.class, () ->{
            service.remain(-1);
        });
    }

    @org.testng.annotations.Test
        // равен нулю
    public void equalsZero() {
        org.testng.Assert.assertEquals(service.remain(0), 1000);
    }

    @org.testng.annotations.Test
        // больше нуля на 1
    public void greaterThanZeroBy1() {
        org.testng.Assert.assertEquals(service.remain(1), 999);
    }

    @org.testng.annotations.Test
        // меньше лимита
    public void lessThanTheLimit() {
        org.testng.Assert.assertEquals(service.remain(300), 700);
    }

    @org.testng.annotations.Test
        // меньше лимита на 1
    public void lessThanTheLimitBy1() {
        org.testng.Assert.assertEquals(service.remain(999), 1);
    }

    @org.testng.annotations.Test
        // равно лимиту
    public void equalToTheLimit() {
        org.testng.Assert.assertEquals(service.remain(1000), 0);
    }

    @org.testng.annotations.Test
        // больше лимита на 1
    public void moreThanTheLimitBy1() {
        org.testng.Assert.assertEquals(service.remain(1001), 999);
    }

    @org.testng.annotations.Test
        // больше лимита
    public void overLimit() {
        org.testng.Assert.assertEquals(service.remain(1400), 600);
    }

    @org.testng.annotations.Test
        // кратно лимиту
    public void multipleOfTheLimit() {
        org.testng.Assert.assertEquals(service.remain(3000), 0);
    }
}