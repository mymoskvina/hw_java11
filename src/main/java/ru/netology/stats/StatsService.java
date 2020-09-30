package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        // начинаем с нуля
        for (long purchase : purchases) {
            // каждый раз прибавляем к текущей сумме новый элемент
            sum = sum + purchase;
        }
        return sum;
    }
    public long calculateAverage(long[] purchases) {
        long sum = 0;
        // начинаем с нуля
        for (long purchase : purchases) {
            // каждый раз прибавляем к текущей сумме новый элемент
            sum = sum + purchase;
        }
        return sum / purchases.length;
    }
    //Вычислить номер месяца с максимальной выручкой
    public long calculateMonthMax(long[] purchases) {
        int monthIdx = 0;
        long max = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] >= max) {
                monthIdx = i;
                max = purchases[i];
            }
        }
        return monthIdx;
    }
    //Вычислить номер месяца с минимальной выручкой
    public long calculateMonthMin(long[] purchases) {
        int monthIdx = 0;
        long min = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] < min) {
                monthIdx = i;
                min = purchases[i];
            }
        }
        return monthIdx;
    }
    //Вычислить номер месяца с выручкой ниже среднего значения по месяцам
    public long calculateMonthsBelowAverage(long[] purchases) {
        int monthCount = 0;
        long average = calculateAverage(purchases);
        for (long purchase : purchases) {
            if (purchase < average) {
                monthCount++;
            }
        }
        return monthCount;
    }
    //Вычислить номер месяца с выручкой dsit среднего значения по месяцам
    public long calculateMonthsAboveAverage(long[] purchases) {
        int monthCount = 0;
        long average = calculateAverage(purchases);
        for (long purchase : purchases) {
            if (purchase > average) {
                monthCount++;
            }
        }
        return monthCount;
    }
}