package ders41_iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {

    public static void main(String[] args) {

        //Java collections içerisindeki bazı classlar index desteklemez
        //Bu durumda index kullanmadan collection içerisindeki tüm elementlere ulasabilmek
        //ve onları update edebilmek için farklı ihtiyaclarımız olur

        //List<> index yapısını yapısını desteklediği için böyle bir ihtiyac duymaz
        //ancak bugünlük index kullanmadan List elementlerine ulaşmaya
        // ve onları update etmeye calışalım.

        List<Integer> sayılar=new ArrayList<>();
        sayılar.add(10);
        sayılar.add(20);
        sayılar.add(30);
        sayılar.add(40);

        //index kullanmadan elementlerin hepsini yazdırın 

        for (Integer each:sayılar
             ) {
            System.out.print(each+" ");
        }
        System.out.println("");
        //index kullanmadan listin elementlerini 1 er arttırın
        //index kullanmadan 25 den büyük sayıları listten silin

        for (Integer each:sayılar
             ) {
            System.out.print(each+1+" ");
        }
        System.out.println("");
        System.out.println(sayılar);//[10, 20, 30, 40]

        for (Integer each: sayılar
             ) {
            each+=1;
            System.out.print(each+" ");//11 21 31 41

        }
        System.out.println("");
        System.out.println(sayılar);//[10, 20, 30, 40]

        //index kullanmadan listin elemanlarını kalıcı olarak değiştirmek mümkün olmadı java bunun
        // için iterator interface'yi oluşturmuştur.
    }
}
