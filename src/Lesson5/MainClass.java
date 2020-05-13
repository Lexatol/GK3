package Lesson5;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicBoolean;

public class MainClass {
    public static final int CARS_COUNT = 4;

    public static AtomicBoolean win = new AtomicBoolean(false);


    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {

        
        CyclicBarrier start_barrier = new CyclicBarrier(CARS_COUNT+1);
        CountDownLatch finish_cdl = new CountDownLatch(CARS_COUNT);

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");

        Race race = new Race(new Road(60), new Tunnel(CARS_COUNT), new Road(40));

        Car[] cars = new Car[CARS_COUNT];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10), start_barrier, finish_cdl);
        }

        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }
        start_barrier.await();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");

        finish_cdl.await();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");

    }

    public static AtomicBoolean getWin() {
        return win;
    }
}





