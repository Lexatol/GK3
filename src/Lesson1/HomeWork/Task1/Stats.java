package Lesson1.HomeWork.Task1;

import java.util.Arrays;

public class Stats<T> {
    private T[] args    ;

    public Stats(T... args) {
        this.args = args;
    }


    public void changeArgs(int elemX, int elemY) {
        T arg;
        arg = args[elemX];
        args[elemX] = args[elemY];
        args[elemY] = arg;
    }

    @Override
    public String toString() {
        return "Box{" +
                "arr=" + Arrays.toString(args) +
                '}';
    }
}
