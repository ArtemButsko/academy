package by.academy.lesson2.classwork;

public class Cat {
    int age;
    String nickname;
    int money;
    String initials;

    public int grow() {
        age++;
        return age;
    }
    public void sleep() {
        System.out.println("Кот спит");
    }
    public void eat() {
        System.out.println("Кот ест");
    }
    public void walk() {
        System.out.println("Кот гуляет");
    }
    public Cat() {

    }
    public Cat(String nickname) {
        this.nickname = "nickname";
        this.age = age;
        this.initials = "";
    }
    public int getMoney(){return money;}
    public void setMoney(int money){
        this.money = money;

    }
    public String getInitials(){return initials;}
    public void  setInitials (String initials){
        this.initials = initials;    }

}
