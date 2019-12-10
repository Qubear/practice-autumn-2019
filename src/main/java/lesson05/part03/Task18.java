package lesson05.part03;

import java.io.*;

/**
 * Чтение файла
 * 1. Считать с консоли имя файла.
 * 2. Вывести в консоль(на экран) содержимое файла.
 * 3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна считывать c консоли имя файла.
 * 2. Программа должна выводить на экран содержимое файла.
 * 3. Поток чтения из файла (FileInputStream) должен быть закрыт.
 * 4. BufferedReader также должен быть закрыт.
 */

public class Task18 {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String c = reader.readLine();
        //C:\Git3\l5p3t18.txt
        FileInputStream file = new FileInputStream(c);
        int i;
        while ((i=file.read())!= -1){
            System.out.print((char)i);
        }
        file.close();
    }
}