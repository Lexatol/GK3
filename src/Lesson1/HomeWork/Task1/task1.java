package Lesson1.HomeWork.Task1;

public class task1 {
    public static void main(String[] args) {
        Stats<Integer> intStats = new Stats<>(1, 2, 3, 4, 5, 6);
        intStats.changeArgs(0, 1);
        System.out.println(intStats);

        Stats<String> stringStats = new Stats<>("str1","str2","str3","str4");
        stringStats.changeArgs(0, 1);
        System.out.println(stringStats);

        Stats<Float> floatStats = new Stats<>(10f,20f,30f,40f,50f,100f,200f,300f,500f);
        floatStats.changeArgs(0, 1);
        System.out.println(floatStats);

    }
}
