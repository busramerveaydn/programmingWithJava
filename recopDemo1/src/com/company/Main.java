package com.company;

public class Main {
    //En büyük sayı hangisi?
    public static void main(String[] args) {
        int number = 20;
        int number1 = 25;
        int number2 = 2;

        int thebiggest = number;

        //Benim yazdığım
        /*if(number>number1 && number>number2){
            System.out.println("En büyük sayı: " + number);
        }else if(number1>number && number1>number2){
            System.out.println("En büyük sayı: " + number1);
        }else{
            System.out.println("En büyük sayı: " + number2);
        }*/

        //Hocanın yazdığı
        if(thebiggest<number1){
            thebiggest = number1;
        }
        if (thebiggest<number2){
            thebiggest = number2;
        }

        System.out.println("En Büyük : "+thebiggest);
    }
}
