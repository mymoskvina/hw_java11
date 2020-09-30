package ru.netology.stats;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @Test
    void calculateSum() {
        StatsService service = new StatsService();

        // Доходы по месяцам
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.calculateSum(purchases);

        //Проверка, сравнение результата
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverage() {
        StatsService service = new StatsService();

        // Доходы по месяцам
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAverage(purchases);

        //Проверка, сравнение результата
        assertEquals(expected, actual);
    }

    @Test
    void calculateMonthMax() {
        StatsService service = new StatsService();

        // Доходы по месяцам
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = (int) service.calculateMonthMax(purchases)+1;

        //Проверка, сравнение результата
        assertEquals(expected, actual);
    }
    @Test
    void calculateMonthMin() {
        StatsService service = new StatsService();

        // Доходы по месяцам
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 1;
        int actual = (int) service.calculateMonthMin(purchases)+1;

        //Проверка, сравнение результата
        assertEquals(expected, actual);
    }
    @Test
    void calculateMonthBelowAverage() {
        StatsService service = new StatsService();

        // Доходы по месяцам
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = (int) service.calculateMonthsBelowAverage(purchases);

        //Проверка, сравнение результата
        assertEquals(expected, actual);
    }
}