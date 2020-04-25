package Lesson1.HomeWork.Task3;

public class Task3 {
    public static void main(String[] args) {
        double weightApple = 1.0;
        double weightOrange = 1.5;
        boolean comparion;
        int boxSizeApple = 10;
        int boxSizeOrange = 15;

        Box<Apple> appleBox = new Box<> ();
        Box<Apple> appleBox1 = new Box<> ();
        Box<Orange> orangeBox = new Box<>();

        for (int i = 0; i < boxSizeApple; i++) {
            appleBox.addBoxFruit(new Apple(weightApple));
        }

        for (int i = 0; i < boxSizeOrange; i++) {
            orangeBox.addBoxFruit(new Orange(weightOrange));
        }


        System.out.println("Корзинка с яблоками: "+appleBox);
        System.out.println("Вес корзины с яблоками: " + appleBox.getWeight());
        System.out.println("Корзинка с апельсинами: "+orangeBox);
        System.out.println("Вес корзины с апельсинами: " + orangeBox.getWeight());
        System.out.println("");

        if ((appleBox.compareTo(orangeBox)) == 0) {
            comparion = true;
        } else {
            comparion = false;
        }

        System.out.println("Коробка первоначальная: "+appleBox);
        appleBox.copyBox(appleBox1);
        System.out.println("Коробка после того, как пересыпали: "+appleBox);
        System.out.println("Новая коробка, куда пересыпали: "+appleBox1);

    }
}
