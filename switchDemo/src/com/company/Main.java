package com.company;

public class Main {

    public static void main(String[] args) {
        //if bloklarına göre daha az kullanılır.
        //dallandırma yapılır.
        //öğrencinim sınavında kaldı geçti örneği

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok güzel : Geçtiniz ");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz ");
                break;
            case 'D':
                System.out.println("Fena değil : Geçtiniz ");
                break;
            case 'F':
                System.out.println("Malesef : Kaldınız");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz!");
        }
    }
}
