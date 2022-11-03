package ders26_persByvalue_immurtableClasses;

import java.util.Arrays;

public class C05_PassByValueArray2 {

    public static void main(String[] args) {

        //Bir method oluşturun
        //Sayılar arrayinin uzunlugundan 2 fazla olan ve
        //elementlerin tamamı 5 olan yeni bir array oluşturup
        //değer olarak sayılar arrayine atayın ve sayılar arrayini yazdırın.


        int [] sayılar = {3,4,5,6};

        arrayeYeniDeğerAta(sayılar);

        System.out.println("Main Methodda Sayılar: "+ Arrays.toString(sayılar));

    }

    public static void arrayeYeniDeğerAta (int [] sayılar){

        int [] yeniArray= new int[sayılar.length+2];

        for (int i = 0; i <yeniArray.length ; i++) {

            yeniArray[i]=5;

        }

        sayılar=yeniArray;

        System.out.println("Methodda sayıların son hali: "+ Arrays.toString(sayılar));

    }
}
