package by.academy.lesson2.classwork;

public class Application {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Vasya");
        cat2.eat();
        cat2.sleep();
        cat2.walk();

        cat2.setInitials("m");


        cat1.grow();
        cat1.grow();
        System.out.println(cat1.grow());
        System.out.println(cat2.getInitials());



    }


}