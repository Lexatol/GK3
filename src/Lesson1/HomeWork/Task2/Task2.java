package Lesson1.HomeWork.Task2;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        StatsT2<Integer> intStats = new StatsT2<>(1, 2, 3, 4, 5, 6);
        ArrayList<Integer> arrayList = intStats.transformToArrays();
        System.out.println(arrayList);
    }
}
