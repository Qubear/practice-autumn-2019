package lesson02.part02;

/**
 * Ввести с клавиатуры имя и используя цикл for 10 раз вывести: <имя> любит меня.
 * <p>
 * Пример вывода на экран для имени Света:
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать имя c клавиатуры.
 * 2.	Программа должна выводить текст на экран.
 * 3.	Программа должна выводить 10 раз текст указанный в задании.
 * 4.	В программе должен использоваться цикл for.
 */

import java.io.*;
import java.util.*;

public class Task39 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Введите данные \n");
        String cS = bufferedReader.readLine();
        for(int i=0;i<10;i++)
        System.out.print(cS+" любит меня\n");

    }
}
