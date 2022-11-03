package ders21_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydenTekrarlarıSilme {

    public static void main(String[] args) {
        //Verilen bir arraydeki tekrar eden sayıları bir kere olacak şekilde düzenleyin

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        List<Integer> tekrarsızListe = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if (!tekrarsızListe.contains(arr[i])){
                tekrarsızListe.add(arr[i]);
            }

        }
        System.out.println(tekrarsızListe); //[1, 2, 4, 3, 5]

        arr=new int[tekrarsızListe.size()]; // [0,0,0,0,0]

        for (int i = 0; i < arr.length ; i++) {

            arr[i]=tekrarsızListe.get(i);

        }
        System.out.println(Arrays.toString(arr)); //[1, 2, 4, 3, 5]




    }
}
