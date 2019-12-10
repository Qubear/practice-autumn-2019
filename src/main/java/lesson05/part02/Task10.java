package lesson05.part02;

/**
 * Три метода и максимум
 * Написать public static методы: int max(int, int), long max(long, long), double max(double, double).
 * Каждый метод должен возвращать максимальное из двух переданных в него чисел.
 * <p>
 * <p>
 * Требования:
 * 1. Программа не должна выводить текст на экран.
 * 2. Класс Solution должен содержать четыре метода.
 * 3. Класс Solution должен содержать статический метод int max(int, int).
 * 4. Метод int max(int, int) должен возвращать максимальное из двух чисел типа int.
 * 5. Класс Solution должен содержать статический метод long max(long, long).
 * 6. Метод long max(long, long) должен возвращать максимальное из двух чисел типа long.
 * 7. Класс Solution должен содержать статический метод double max(double, double).
 * 8. Метод double max(double, double) должен возвращать максимальное из двух чисел типа double.
 */

public class Task10 {
    public static void main(String[] args) {
        System.out.print(max(4.,-1.));

    }
    public static int max(int a1,int a2){
        if(a1>a2)
            return a1;
        return a2;
    }
    public static long max(long a1,long a2){
        if(a1>a2)
            return a1;
        return a2;
    }
    public static double max(double a1,double a2){
        if(a1>a2)
            return a1;
        return a2;
    }

    //Напишите тут ваши методы
}
