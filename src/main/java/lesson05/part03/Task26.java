package lesson05.part03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Сортировка четных чисел из файла
 * 1. Ввести имя файла с консоли.
 * 2. Прочитать из него набор чисел.
 * 3. Вывести на консоль только четные, отсортированные по возрастанию.
 * <p>
 * Пример ввода:
 * 5
 * 8
 * -2
 * 11
 * 3
 * -5
 * 2
 * 10
 * <p>
 * Пример вывода:
 * -2
 * 2
 * 8
 * 10
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна считывать данные с консоли.
 * 2. Программа должна создавать FileInputStream для введенной с консоли строки.
 * 3. Программа должна выводить данные на экран.
 * 4. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
 * 5. Программа должна закрывать поток чтения из файла(FileInputStream).
 */

public class Task26 {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String c = reader.readLine();
        //C:\Git3\l5p3t26.txt
        FileInputStream file = new FileInputStream(c);
        int i;
        while ((i=file.read())!= -1){
            c=""+(char)i;
            int a = Integer.parseInt(c);
            if((a%2)==0)
            System.out.print(a);
        }
        file.close();
    }
}
