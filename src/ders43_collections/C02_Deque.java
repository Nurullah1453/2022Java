package ders43_collections;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class C02_Deque {

    public static void main(String[] args) {

        Deque<String>urunler=new LinkedList<>();
        urunler.add("Nutella");
        urunler.add("Çikolatalı Gofret");
        urunler.add("Cokoprens");

        //Tüm ürünlerin başına "Y"  ekleyelim

        String eleman="";
        Deque geciciDq=new LinkedList();

        while (eleman!=null){

            eleman=urunler.poll();
            if (eleman!=null){
                eleman="Y " + eleman;
                geciciDq.add(eleman);

            }
        }
        urunler=geciciDq;
        System.out.println(urunler);

    }
}
