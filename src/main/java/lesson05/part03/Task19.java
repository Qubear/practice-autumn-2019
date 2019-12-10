package lesson05.part03;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Писатель в файл с консоли
 * 1. Прочесть с консоли имя файла.
 * 2. Считывать строки с консоли, пока пользователь не введет строку "exit".
 * 3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна считывать c консоли имя файла.
 * 2. Создай и используй объект типа BufferedWriter.
 * 3. Программа не должна ничего читать из файловой системы.
 * 4. Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
 * 5. Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
 * 6. Метод main должен закрывать объект типа BufferedWriter после использования.
 * 7. Метод main не должен выводить данные на экран.
 */

public class Task19 {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String c = reader.readLine();
        //C:\Git3\l5p3t18.txt
        FileOutputStream file = new FileOutputStream(c,true);
        c = reader.readLine();
        while (!c.equals("exit")){
            file.write("\n".getBytes());
            file.write(c.getBytes());
            c = reader.readLine();
        }
        file.close();
    }
}
