package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {
            "'For 200 and 300 common', 200, 300, 3", // несколько чисел попали в диапозон
            "'For 100 and 101 border', 100, 101, 1", // 1 число на границе
            "'For 99 and 100 border', 99, 100, 1", // 1 число на границе
            "'For 100 and 100 border', 100, 100, 1", // 1 число на границе
            "'For 100 and 9801 maximum border', 100, 9801, 90", // максимальное кол-во чисел на границе попали в диапозон
            "'For 0 and 99 low border', 0, 99, 0", // ни одно число не попало снизу
            "'For 9802 and 1000000000 high border', 9802, 1000000000, 0", // ни одно число не попало сверху
            "'For 0 and 1000000000 large range', 0, 1000000000, 90"})
// большой диапозон, все числа попали


    void shouldCounter(String test, int low, int high, int expected) {
        SQRService service = new SQRService();
        // вызываем целевой метод:
        int actual = service.calculate(low, high);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
