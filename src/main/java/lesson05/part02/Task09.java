package lesson05.part02;

/**
 * Три метода и минимум
 * Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
 * Каждый метод должен возвращать минимальное из двух переданных в него чисел.
 * <p>
 * <p>
 * Требования:
 * 1. Программа не должна выводить текст на экран.
 * 2. Класс Solution должен содержать четыре метода.
 * 3. Класс Solution должен содержать статический метод int min(int, int).
 * 4. Метод int min(int, int) должен возвращать минимальное из двух чисел типа int.
 * 5. Класс Solution должен содержать статический метод long min(long, long).
 * 6. Метод long min(long, long) должен возвращать минимальное из двух чисел типа long.
 * 7. Класс Solution должен содержать статический метод double min(double, double).
 * 8. Метод double min(double, double) должен возвращать минимальное из двух чисел типа double.
 */

public class Task09 {
    public static void main(String[] args) {
        System.out.print(min(2.,3.));

    }
    public static int min(int a1,int a2){
        if(a1<a2)
            return a1;
        return a2;
    }
    public static long min(long a1,long a2){
        if(a1<a2)
            return a1;
        return a2;
    }
    public static double min(double a1,double a2){
        if(a1<a2)
            return a1;
        return a2;
    }

    //Напишите тут ваши методы
}
