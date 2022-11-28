package ders47_mapsMethodları;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C04_Soru {
    public static void main(String[] args) {

        //verilen bir cümlede kullanılan karekterleri ve kaçar kere kullanıldığını yazdırın

        String str="Javayı balonu patlatmadan bitirelim";
        //J=1    a=7    v=1    y=1.....

        String[]strArr=str.split("");

        Map<String,Integer>kullanımMiktarlarıMap=new TreeMap<>();

        for (int i = 0; i <strArr.length ; i++) {

            //Ele aldıgım element mapde varsa kullanım miktarını 1 arttıralım
            kullanımMiktarlarıMap.computeIfPresent(strArr[i],(k,v)->v+1);

            //Ele aldıgım element mapde yoksa kullanım miktarı 1 olarak mape ekleyeceğim
            kullanımMiktarlarıMap.putIfAbsent(strArr[i],1);
        }
        System.out.println(kullanımMiktarlarıMap);


    }
}
