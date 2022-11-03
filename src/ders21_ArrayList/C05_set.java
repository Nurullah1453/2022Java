package ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_set {

    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};
        //list.set (index, yeniDeğer) verilen listedeki eski değeri silip bize döndürür
        //ve o indexteki değeri verdiğimiz değer ile değiştirir.


        List<Integer> sayilar= new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {

            sayilar.add(arr[i]);
        }

        // set update için kullanılır var olan elementi değiştirir

        sayilar.set(0,8);  //0. indexteki elemanı 8 yapar eski değer gider
        sayilar.set(1,9);  //1. indexi 9 yapar eski değer silinir
        System.out.println(sayilar);




    }
}
