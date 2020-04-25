package Lesson1.HomeWork.Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class StatsT2<T> {
    private T[] args;



    public StatsT2(T... args) {
        this.args = args;
    }

    public ArrayList<T> transformToArrays() {
        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(args));
        return arrayList;
    }


}
