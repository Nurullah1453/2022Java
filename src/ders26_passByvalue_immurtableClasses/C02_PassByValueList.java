package ders26_passByvalue_immurtableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {

    public static void main(String[] args) {

        //Bir method oluşturalım ve methodda List'deki sayıları 5 arttıralım
        //Ve methodda listenin son halini yazdıralım

        List<Integer> sayılar=new ArrayList<>();

        sayılar.add(10);
        sayılar.add(20);
        sayılar.add(30);
        elementleri5Arttır(sayılar);
        elementleri5Arttır(sayılar);
        elementleri5Arttır(sayılar);
        System.out.println("Method Call Sonrası Sayılar : "+ sayılar);

        //Listte Kalıcı Oldu



    } public static void elementleri5Arttır (List<Integer>sayılar){

        for (int i = 0; i <sayılar.size() ; i++) {

            sayılar.set(i,sayılar.get(i)+5);

        }
        System.out.println(sayılar);

    }
}
