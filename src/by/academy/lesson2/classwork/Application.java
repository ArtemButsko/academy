package by.academy.lesson2.classwork;

public class Application {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Vasya");
        cat2.sleep();
        cat2.eat();

        //int age = Cat.grow();
        int age2 = Cat.grow() + Cat.grow();

        System.out.println(age2);

    }


}