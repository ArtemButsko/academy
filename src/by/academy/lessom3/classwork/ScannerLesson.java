package by.academy.lessom3.classwork;

import java.util.Scanner;

public class ScannerLesson {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your gender: ");
        char gender = scanner.next().charAt(0);

        System.out.println("How old are you?: ");
        int age = scanner.nextInt();

        System.out.println("Enter your mobile number: ");
        long mNuber = scanner.nextLong();

        System.out.println("Name: " + name );
        System.out.println("Gender: " + gender);
        System.out.println("Age: "+ age);
        System.out.println("Mobile number: " + mNuber);

        scanner.close();


    }
}
