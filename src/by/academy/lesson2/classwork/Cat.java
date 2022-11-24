package by.academy.lesson2.classwork;

public class Cat {
    static int age;
    String nickname;

    public static int grow() {
        age = age + 1;
        return age;
    }

    public void sleep() {
        System.out.println("Кот спит");
    }

    public  void eat() {
        System.out.println("Кот ест");
    }

    public void walk() {
        System.out.println("Кот гуляет");
    }

    public Cat() {

    }

    public Cat(String nickname) {
        this.nickname = "nickname";
    }

}
