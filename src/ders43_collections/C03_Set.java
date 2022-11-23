package ders43_collections;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_Set {

    public static void main(String[] args) {

        //verilen bir Arrayin tekrar edilen elementlerini silip
        //her elemtnetin sadece bir kere kullanıldıgı hale getirin.

        int [] arr = {6,4,3,3,2,3,3,4,4,5,5,66,7,7,8,8,8,23,2,2,2,31,11,1,1,3,3,3,};

        Set<Integer> geciciSet=new HashSet<>();

        for (Integer each:arr
             ) {
            geciciSet.add(each);
            
        }
        int [] arr2=new int[geciciSet.size()]; //elimizde yeni ve boş bir array var

        int index=0;
        for (Integer each:geciciSet
             ) {
            arr2[index]=each;
            index++;
            
        }
        //tekrarsız değerleri geçici arraye taşıdık şimdi kendi arrayimize atamamız lazım

        arr=arr2;

        System.out.println(Arrays.toString(arr));
    }
}
