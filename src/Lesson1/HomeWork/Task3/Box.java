package Lesson1.HomeWork.Task3;

import java.util.*;

public class Box<T extends Fruit> implements Comparable<Box> {
    private T[] fruit;
    private ArrayList<T> box = new ArrayList<>();

    public void copyBox(Box<T> box2) {
        ArrayList<T> arrayList = new ArrayList<>(this.getBox());
            for (T num : arrayList) {
                box2.getBox().add(num);
                box.remove(num);
            }
    }

    public void addBoxFruit(T fruit) {
        box.add(fruit);
    }


    public double getWeight() {
        double weight = 0;
        for (T num : box) {
            weight += num.getWeightFruit();
        }
        return weight;
    }

    public ArrayList<T> getBox() {
        return box;
    }

    @Override
    public int compareTo(Box another) {
        return (int) (this.getWeight() - another.getWeight());
    }

    @Override
    public String toString() {
        return "Box{" +
                "box=" + box +
                '}';
    }
}


