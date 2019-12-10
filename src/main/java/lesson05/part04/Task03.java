package lesson05.part04;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Коты
 * 1. Считывать строки(параметры) с консоли, пока пользователь не введет пустую строку(Enter).
 * 2. Каждый параметр соответствует имени кота.
 * <p>
 * Для каждого параметра:
 * 3. Создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
 * 4. Вывести на экран cat.toString().
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна считывать данные с клавиатуры.
 * 2. Программа должна прекращать считывать данные после ввода пустой строки.
 * 3. Программа должна выводить на экран описание каждого кота (cat.toString).
 * 4. Программа должна создавать объект класса Cat для каждого введенного имени кота
 * (строки считанной с клавиатуры) c помощью метода getCatByKey.
 */

public class Task03 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        CatFactory inCat = new CatFactory();
        String c = bufRead.readLine();
        Cat[] catMas= new Cat[100];
        int i=0;
        while(!c.equals("")) {
            catMas[i]=inCat.getCatByKey(c);
            i++;
            c = bufRead.readLine();
        }
        for(int j=0;j<i;j++){
            System.out.println(catMas[j].toString());
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("vaska".equals(key)) {
                cat = new MaleCat("Василий");
            } else if ("murka".equals(key)) {
                cat = new FemaleCat("Мурочка");
            } else if ("kiska".equals(key)) {
                cat = new FemaleCat("Кисюлька");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;
        protected Cat(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }
        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }
        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
