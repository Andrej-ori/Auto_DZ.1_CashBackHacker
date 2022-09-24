package ru.netology.service;

 // import org.junit.Test;

 // import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    // тесты на JUnit4
    @org.junit.Test
    // меньше нуля на 1
    public void lessThanZeroBy1() {
        org.junit.Assert.assertThrows(RuntimeException.class, () ->{
            service.remain(-1);
        });
    }

    @org.junit.Test
    // равен нулю
    public void equalsZero() {
        org.junit.Assert.assertEquals(1000, service.remain(0));
    }

    @org.junit.Test
    // больше нуля на 1
    public void greaterThanZeroBy1() {
        org.junit.Assert.assertEquals(999, service.remain(1));
    }

    @org.junit.Test
    // меньше лимита
    public void lessThanTheLimit() {
        org.junit.Assert.assertEquals(700, service.remain(300));
    }

    @org.junit.Test
    // меньше лимита на 1
    public void lessThanTheLimitBy1() {
        org.junit.Assert.assertEquals(1, service.remain(999));
    }

    @org.junit.Test
    // равно лимиту
    public void equalToTheLimit() {
        org.junit.Assert.assertEquals(0, service.remain(1000));
    }

    @org.junit.Test
    // больше лимита на 1
    public void moreThanTheLimitBy1() {
        org.junit.Assert.assertEquals(999, service.remain(1001));
    }

    @org.junit.Test
    // больше лимита
    public void overLimit() {
        org.junit.Assert.assertEquals(600, service.remain(1400));
    }

    @org.junit.Test
    // кратно лимиту
    public void multipleOfTheLimit() {
        org.junit.Assert.assertEquals(0, service.remain(3000));
    }

    // тесты на JUnit5

     @org.junit.jupiter.api.Test
     // меньше нуля на 1
     public void lessThanZeroBy1Jupiter() {
         org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () ->{
             service.remain(-1);
         });
     }

     @org.junit.jupiter.api.Test
     // равен нулю
     public void equalsZeroJupiter() {
         org.junit.jupiter.api.Assertions.assertEquals(1000, service.remain(0));
     }

     @org.junit.jupiter.api.Test
     // больше нуля на 1
     public void greaterThanZeroBy1Jupiter() {
         org.junit.jupiter.api.Assertions.assertEquals(999, service.remain(1));
     }

     @org.junit.jupiter.api.Test
     // меньше лимита
     public void lessThanTheLimitJupiter() {
         org.junit.jupiter.api.Assertions.assertEquals(700, service.remain(300));
     }

     @org.junit.jupiter.api.Test
     // меньше лимита на 1
     public void lessThanTheLimitBy1Jupiter() {
         org.junit.jupiter.api.Assertions.assertEquals(1, service.remain(999));
     }

     @org.junit.jupiter.api.Test
     // равно лимиту
     public void equalToTheLimitJupiter() {
         org.junit.jupiter.api.Assertions.assertEquals(0, service.remain(1000));
     }

     @org.junit.jupiter.api.Test
     // больше лимита на 1
     public void moreThanTheLimitBy1Jupiter() {
         org.junit.jupiter.api.Assertions.assertEquals(999, service.remain(1001));
     }

     @org.junit.jupiter.api.Test
     // больше лимита
     public void overLimitJupiter() {
         org.junit.jupiter.api.Assertions.assertEquals(600, service.remain(1400));
     }

     @org.junit.jupiter.api.Test
     // кратно лимиту
     public void multipleOfTheLimitJupiter() {
         org.junit.jupiter.api.Assertions.assertEquals(0, service.remain(3000));
     }
}