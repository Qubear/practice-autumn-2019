package lesson05.part04;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Нашествие исключений
 * Заполни список exceptions десятью(10) различными исключениями.
 * Первое исключение уже реализовано в методе initExceptions.
 * <p>
 * <p>
 * Требования:
 * 1. Список exceptions должен содержать 10 элементов.
 * 2. Все элементы списка exceptions должны быть исключениями(потомками класса Throwable).
 * 3. Все элементы списка exceptions должны быть уникальны.
 * 4. Метод initExceptions должен быть статическим.
 */

public class Task18 {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();
        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            float [] mas= new float[5];
            mas[5]=0;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try{
            String s="yg";
            Integer.parseInt(s);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try{
            File fil = new File("74238.txt");
        } catch (Exception e) {
            exceptions.add(e);
        }



    }
}
