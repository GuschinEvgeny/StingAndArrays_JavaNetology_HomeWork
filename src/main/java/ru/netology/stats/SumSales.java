package ru.netology.stats;

public class SumSales {
    public long sum(long[] salesStat) {
        int countArr = salesStat.length; // count quantity of month
        long summ = 0;
        for (int i = 0; i < countArr; i++) {
            summ = summ + salesStat[i];
        }
        return summ;
    }

    public double averageSumm(long[] salesStat) {
        int countArr = salesStat.length; // count quantity of month
        long sum = 0;
        for (int i = 0; i < countArr; i++) {
            sum = sum + salesStat[i];
        }
        double aveSum = sum / countArr;
        return aveSum;
    }

    public int maxMonthNumber(int[] salesStat) {
        int countArr = salesStat.length; // count quantity of month
        int maxMonth = 0;
        for (int i = 0; i < countArr; i++) {
            if (salesStat[i] >= salesStat[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minMonthNumber(int[] salesStat) {
        int countArr = salesStat.length; // count quantity of month
        int minMonth = 0;
        for (int i = 0; i < countArr; i++) {
            if (salesStat[i] <= salesStat[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int lowerAverageSales(long[] salesStat) {
        int aveSum = (int) averageSumm(salesStat);
        int countArr = salesStat.length; // count quantity of month
        int lowMonth = 0;
        for (int i = 0; i < countArr; i++) {
            if (salesStat[i] < aveSum) {
                lowMonth = lowMonth + 1;
            }
        }
        return lowMonth;
    }

    public int overAverageSales(long[] salesStat) {
        int aveSum = (int) averageSumm(salesStat);
        int countArr = salesStat.length; // count quantity of month
        int upMonth = 0;
        for (int i = 0; i < countArr; i++) {
            if (salesStat[i] > aveSum) {
                upMonth = upMonth + 1;
            }
        }
        return upMonth;
    }
}