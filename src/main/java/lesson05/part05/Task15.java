package lesson05.part05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Статики-2
 * 1. В статическом блоке считайте две переменные с консоли А и В с типом int.
 * 2. Не забыть про IOException, который надо обработать в блоке catch.
 * 3. Закрыть поток ввода методом close().
 * <p>
 * <p>
 * Требования:
 * 1. Поле A должно быть публичным и статическим.
 * 2. Поле B должно быть публичным и статическим.
 * 3. Программа должна считывать данные с клавиатуры в статическом блоке.
 * 4. Программа должна инициализировать поля A и B в статическом блоке согласно введенным с клавиатуры значениям.
 * 5. Программа должна выводить в консоль минимальное из введенных с клавиатуры значений.
 */

public class Task15 {
    public static int A;
    public static int B;

    public static final int MIN = min(A, B);

    public static void main(String[] args) throws IOException {
        try{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String c = reader.readLine();
        A=Integer.parseInt(c);
        c = reader.readLine();
        B=Integer.parseInt(c);
        reader.close();
        }catch (IOException er)
        { }
        System.out.println(min(A, B));
    }

    public static int min(int a, int b) {
        if(a<b)
            return a;
        return b;
    }
}
