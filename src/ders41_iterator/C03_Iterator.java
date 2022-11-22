package ders41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {

    public static void main(String[] args) {

        List<Integer> sayılar=new ArrayList<>();
        sayılar.add(10);
        sayılar.add(20);
        sayılar.add(30);
        sayılar.add(40);

        //iterator kullanarak bu listeden 15 ile 35 arasındaki sayıları silin

        Iterator it1= sayılar.iterator();


        while (it1.hasNext()){
            Integer element=(Integer) it1.next();

            if (element>15 && element <35){
                it1.remove();
            }
        }
        System.out.println(sayılar);

        sayılar.add(20);
        sayılar.add(30);

        System.out.println(sayılar);

        //tüm elementleri iterator yardımı ile silelim

        Iterator it2= sayılar.iterator();
        it2.next();
        it2.remove(); //10 silinir

        System.out.println(sayılar);

        it2.next();
        it2.remove(); //40 silinir

        while (it2.hasNext()){
            it2.next();
            it2.remove(); // []
        }

        System.out.println(sayılar);

    }
}
