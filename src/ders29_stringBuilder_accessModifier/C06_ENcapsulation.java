package ders29_stringBuilder_accessModifier;

import java.util.ArrayList;
import java.util.List;

public class C06_ENcapsulation {

    /*
    Büyük projelerde datayı görme (read) veya datayı değiştirme (write)
    yetkilerini birbirinden bagımsız olarak düzenlenmek istenebilir

    Ancak AccessModier ile class üylerine başka classlardan erişim sınırlandırılabilir
    ANCAk
    Ulasılabilen dataya hem okunabilir hemde yazma yapılabilir
    Ulasılamayan dataya ise ne okunabilir nede yazılabilir.

    Gerçek hayattaki ihtiyaçlar düşünüldüğünde
    Java'ya yetki sınırlamayı uyarlamak istersek

    -Eğer okuma ve yazma yetkisini birlikte vermek veya vermemek söz konusuysa AccesModifier kullanılır

    -Eğer okuma ve yazma yetkileri birbirinden ayrılacaksa o zaman accessmodifer yeterli olmaz
    Encapsulation (getter ve setter) methodları kullanılmalıdır.
    */

    //get ve set daha önceki java objelerinde karşımıza cıkmıstı

    public static void main(String[] args) {
        List<Integer>sayılar=new ArrayList<>();
        sayılar.add(2);
        sayılar.add(3);
        sayılar.add(5);

       // sayılar.get(1)=10 okumaya izin var ama değer atamaya yani yazmaya izin yok

       // System.out.println(sayılar.set(1)); set varsa mutlaka değer atamalısın.

    }




}
