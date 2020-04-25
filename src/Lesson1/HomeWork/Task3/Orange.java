package Lesson1.HomeWork.Task3;

public class Orange extends Fruit {


    public Orange(double weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Orange(вес:"+getWeightFruit()+")";
    }
}
