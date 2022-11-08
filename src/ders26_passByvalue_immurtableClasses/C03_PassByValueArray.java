package ders26_passByvalue_immurtableClasses;

import java.util.Arrays;

public class C03_PassByValueArray {

    public static void main(String[] args) {

        int [] arr={3,4,5};

        elementleri5Arttır(arr);
        elementleri5Arttır(arr);
        elementleri5Arttır(arr);

        System.out.println("Method Call'dan Sonra Main Method İçinde arr: "+ Arrays.toString(arr));
        //arrayde de kalıcı oldu



    } public static void elementleri5Arttır (int [] arr) {

        for (int i = 0; i <arr.length ; i++) {

            arr [i]= arr[i]+5;

        }

        System.out.println(Arrays.toString(arr));

    }
}
