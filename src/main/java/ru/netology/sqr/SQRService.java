package ru.netology.sqr;

public class SQRService {
    public int calculate(int low, int high) { // верхняя и нижняя границы диапозона
        int counter = 0; // счетчик
        for (int i = 10; i < 100; i++) {
            if ( i*i>=low && i*i<=high ) {
                counter += 1;
            }
        }
        return counter;
    }

}
