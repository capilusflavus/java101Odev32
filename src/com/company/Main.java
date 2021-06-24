package com.company;

import java.util.Scanner;

public class Main {

    static boolean isPalidrom(int number) {
        int temp=number , reversNumber=0 ,lastNumber;
        while (temp!=0){
            lastNumber=temp%10;
            reversNumber=(reversNumber*10)+lastNumber;
            temp/=10;
        }
        if (reversNumber==number){
            System.out.println("Bu bir palidrom sayıdır : " + reversNumber + "=" + number);
        }
        else {
            System.out.println("Bu bir palidrom sayı değildir :  " + reversNumber + "=" + number);
        }

        return true;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi = scanner.nextInt();
        isPalidrom(sayi);
    }
}
