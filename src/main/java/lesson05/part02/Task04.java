package lesson05.part02;

/**
 * То ли птица, то ли лампа
 * Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей:
 * Кошка, Собака, Птица, Лампа.
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна выводить текст на экран.
 * 2. Класс Cat менять нельзя.
 * 3. Класс Dog менять нельзя.
 * 4. Класс Bird менять нельзя.
 * 5. Класс Lamp менять нельзя.
 * 6. Метод printObjectType() должен выводить на экран одну из надписей,
 * в зависимости от переданного объекта. Например "Лампа" для объектов типа Solution.Lamp.
 */

public class Task04 {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //Напишите тут ваше решение
        if(o.getClass()==Cat.class)
            System.out.print("Кошка ");
        if(o.getClass()==Dog.class)
            System.out.print("Собака ");
        if(o.getClass()==Bird.class)
            System.out.print("Птица ");
        if(o.getClass()==Lamp.class)
            System.out.print("Лампа ");
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
