package com.company;

public class Main {

    public static void main(String[] args) {
        // Java küçük büyük harf duyarlı bir dildir. (case sensitive)
        // java camel case ile çalışır yani ilk harf küçük ikinci kelimenin ilk harfi büyük

        System.out.println("Öğrenci sayısı: 9" );

        int studentNumber = 9;
        System.out.println("Öğrenci sayısı: " + studentNumber);

        String message = "Öğrenci Sayısı: ";
        System.out.println(message + studentNumber);
    }
}
