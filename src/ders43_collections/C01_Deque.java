package ders43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {
    public static void main(String[] args) {

        Deque<String> dq1 = new LinkedList<>();

        dq1.add("K");
        dq1.add("B"); // hiçbirşey demezsek bir sonrakine ekler [K, B]
        dq1.addLast("F"); //Sona ekler [K, B, F]
        dq1.addFirst("A"); //Başa ekler [A, K, B, F]
        System.out.println(dq1.getFirst()); //Getirir ama silmez  A
        System.out.println(dq1.getLast()); //Getirir ama silmez   F
        System.out.println(dq1.remove()); //İlk indexi siler [K, B, F]
        System.out.println(dq1.poll()); //İlkini siler
        System.out.println(dq1.removeLast()); //sonuncuyu siler [B]
        System.out.println(dq1.remove()); //[]
        //System.out.println(dq1.remove()); //Boş oldugu için exeption fırlatır
        System.out.println(dq1.poll());//Boş olmasına rağmen exeption fırlatmaz eleman silemediği için null döndürür.

        dq1.add("K");
        dq1.add("B");
        dq1.push("F"); //En başa Element ekler sınırlandırılmış bir Deque varsa exeption verir
        System.out.println(dq1.pop());  //F ilk elementi siler ve bize döndürür
        System.out.println(dq1.element());//K En baştaki elementi getirir ama silmez boş ise exeption fırlatır
        System.out.println(dq1.peek()); //En baştaki elementi getirir. boş ise null döndürür
        System.out.println(dq1.offer("C")); //En sona element ekler. //Yerleştirebilirse true
        //yerleştiremezse false döndürür.


        System.out.println(dq1);
    }
}
