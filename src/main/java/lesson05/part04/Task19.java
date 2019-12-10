package lesson05.part04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * НОД
 * Наибольший общий делитель (НОД).
 * Ввести с клавиатуры 2 целых положительных числа.
 * Вывести в консоль наибольший общий делитель.
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна считывать с клавиатуры 2 строки.
 * 2. В случае если введенные строки невозможно преобразовать в положительные целые числа, должно возникать исключение.
 * 3. Программа должна выводить данные на экран.
 * 4. Программа должна выводить на экран наибольший общий делитель(НОД) чисел считанных с клавиатуры и успешно завершаться.
 */

public class Task19 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String c = bufferedReader.readLine();
        double a1 = Double.parseDouble(c);
        c = bufferedReader.readLine();
        double a2 = Double.parseDouble(c);
        int i=0,rez=0;
        double m1=0,m2=0;
        while(i!=a1 && i!=a2)
        {
            m1=a1%i;
            m2=a2%i;
            if(m1==0 && m2==0)
                rez=i;
            i++;
        }
        System.out.println(rez);
    }
}
