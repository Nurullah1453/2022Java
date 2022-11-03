package ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ElementEkleme {

    public static void main(String[] args) {

        List<Integer> sayılar=new ArrayList<>();
        System.out.println(sayılar); // []

        System.out.println(sayılar.add(10)); // hem listeye ekler hem yazdırır . add

        System.out.println(sayılar); // [10]

        sayılar.add(20);

        System.out.println(sayılar); // [10,20] tersi söylenmedikçe elementi sona ekler

        sayılar.add(1,15); //1. indexe 15 ekler

        System.out.println(sayılar);  //[10,15,20]

        //Listenin başına 44 ekleyelim

        sayılar.add(0,44);

        System.out.println(sayılar);   // [44, 10, 15, 20]


        List<Integer> eklenecekListe=new ArrayList<>();
        eklenecekListe.add(3);
        eklenecekListe.add(5);

        //sayılar listesinin sonuna eklenecekListeyi ekleyin

        sayılar.addAll(eklenecekListe);  //.addAll methodu kullanılır
        System.out.println(sayılar);     //[44, 10, 15, 20, 3, 5]

        //sayılar listesinin başındaki 44 den sonraya eklenecek listeyi birkez daha ekleyin

        sayılar.addAll(1,eklenecekListe);

        System.out.println(sayılar);  //[44, 3, 5, 10, 15, 20, 3, 5]






    }
}
