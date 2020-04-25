package Lesson1.HomeWork.Task3;

public class Apple extends Fruit {


    public Apple(double weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Apple (вес:"+getWeightFruit()+")";
    }
}
