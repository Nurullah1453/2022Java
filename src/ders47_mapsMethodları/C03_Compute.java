package ders47_mapsMethodları;

import java.util.HashMap;
import java.util.Map;

public class C03_Compute {

    public static void main(String[] args) {

        Map<String,Integer> mp1=new HashMap<>();

        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);

        //C key olarak varsa değerini 3 artıralım.

        if (mp1.containsKey("C")){
            mp1.put("C",mp1.get("C"+3));
        }

        System.out.println(mp1);

        //B key olarak varsa değerini 2 ile çarp

        mp1.computeIfPresent("B",(k,v)-> 2*v);
        System.out.println(mp1);

        //A Key olarak varsa değerini 5 azaltın
        mp1.computeIfPresent("A",(k,v)->v-5);
        System.out.println(mp1);

        //mapde D yoksa değer olarak 11

        if (!mp1.containsKey("D")){
            mp1.put("D",11);
        }

        System.out.println(mp1);

        //E yoksa değeri 8 olarak ekleyelim

        mp1.computeIfAbsent("E",v->8);

        System.out.println(mp1);

        //E ni ndeğerini 4 arttıralım

        mp1.compute("E",(k,v)-> v+4);
        System.out.println(mp1);

        //mp1.compute("F",(k,v)-> v*3); //NullPointerException Değer yok
        //System.out.println(mp1);

        mp1.compute("R",(k,v)-> v=3); //değer yoksa yeni değer verir
        System.out.println(mp1);



    }
}
