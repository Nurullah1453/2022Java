package ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_TopluElemanEkleme {

    public static void main(String[] args) {

        List<String> harfler=new ArrayList<>();

        //tüm sesli harfleri listeye ekleyin
        //eklenecek tüm elementleri bir array olarak yazıp sonra for loop ile
        //Liste ekleyebiliriz


        String [] arr={"a","e","i","o","u"};

        for (int i = 0; i <arr.length ; i++) {

            harfler.add(arr[i]);

        }
        System.out.println(harfler);

        System.out.println(harfler.size()); //List in elaman sayısını ögrenmek için harfler.size methodu kullanılır

        //list.isEmpty() methodu boş mu dolu mu olduunu kontrol eder

        //list.contains(arananObje) bir elementin listede olup olmadıını kontrol eder


    }
}
