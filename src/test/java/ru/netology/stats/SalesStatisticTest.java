package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesStatisticTest {

    @Test
    public void sumSalesTest() {
        long[] salesStat = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        SumSales service = new SumSales();
        long actual = (long)service.sum(salesStat);
        long expected = 180;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void averageSumTest() {
        long[] salesStat = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        SumSales service = new SumSales();
        double actual = (double) service.averageSumm(salesStat);
        double expected = 15;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void maxMonthNumberTest() {
        int[] salesStat = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        SumSales service = new SumSales();
        int actual = service.maxMonthNumber(salesStat);
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void minMonthNumberTest() {
        int[] salesStat = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        SumSales service = new SumSales();
        int actual = service.minMonthNumber(salesStat);
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void lowerAverageSalesTest() {
        long[] salesStat = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        SumSales service = new SumSales();
        long actual = service.lowerAverageSales(salesStat);
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void overAverageSalesTest(){
        long[] salesStat = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        SumSales service = new SumSales();
        long actual = service.overAverageSales(salesStat);
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }
}

