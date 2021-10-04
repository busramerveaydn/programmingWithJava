package com.company;

public class Main {

    public static void main(String[] args) {
        String student1 = "Merve";
        String student2 = "Büşra";
        String student3 = "Aydın";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println();

        //DİZİLER İLE
        String[] students = new String[4]; //dizi tanımladık.
        students[0] = "Merve";
        students[1] = "Büşra";
        students[2] = "Aydın";
        students[3] = "Sümeyra";

        for (int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
        System.out.println();

        //öğrenciler dizisindeki her bir elemanı gez
        for (String student:students){
           System.out.println(student);
        }
    }
}
