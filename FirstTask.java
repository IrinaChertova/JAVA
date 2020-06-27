package ru.geekbrains.lesson1;

import javax.swing.*;
import java.util.Arrays;

public class FirstTask {
    public static void main (String [] args) {

        byte a1=12;
        short a2=2345;
        int a3=45000;
        long a4=234567881L;
        float a5=1.18f;
        double a6=1.1818181;
        char a7='A';
        boolean isOk=false;

        System.out.println(multiply(2,3,10,5)); // задание 3
        System.out.println(summ10and20(5,10)); //задание 4
        isPositiveOrNot (-12); //задание 5
        System.out.println(isNegative(10)); //задание 6
        helloName ("Ирина"); //задание 7
        leapYearOrNot(1900); //задание 8
    }

    public static int multiply (int a, int b, int c, int d){
        int summ = a * (b + (c / d));
        return summ;
    }

    public static boolean summ10and20 (int a, int b) {
        int c = a + b;
        if (c > 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNot(int a) {
        if (a<0){
                System.out.println("вы ввели отрицательное число");
            } else {
                System.out.println("вы ввели положительное число");
            }
        }

    public static boolean isNegative (int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void helloName(String name) {
        System.out.println("Привет, "+name+"!");
    }

    public static void leapYearOrNot(int x){
        if ((x%4!=0) || ((x%4==0) && (x%100==0) && (x%400!=0))) {
            System.out.println(x + " год - не високосный");
        }
        else{
            System.out.println((x + " год - високосный"));
        }
    }

}



