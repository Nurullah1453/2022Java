package ders41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {

    public static void main(String[] args) {

        List<Integer> sayılar=new ArrayList<>();
        sayılar.add(10);
        sayılar.add(20);
        sayılar.add(30);
        sayılar.add(40);

        Iterator it1= sayılar.iterator();

        //tüm elementleri iterator kullanarak yazdıralım.

        System.out.println(it1.hasNext()); //yanında element var mı? true
        System.out.println(it1.next());//10 aldıgı sayıyı getirir. (üzerinden atladıgı sayıyı)
        System.out.println(it1.hasNext());//true yanında element var mı ?
        System.out.println(it1.next());//20 üzerinden atladıgı sayıyı yazdırır

        System.out.println("========");

        while (it1.hasNext()){
            System.out.println(it1.next());//30  40
        }

        //iterator nereye kadar iterate ettiysek orada kalır. Baştan itibaren yazdırmak istersek
        //yeni bir iterator oluşturmamız gerekir.

        System.out.println("========");

        Iterator it2= sayılar.iterator();

        while (it2.hasNext()){
            System.out.print(it2.next()+" "); //10 20 30 40
        }

    }
}
