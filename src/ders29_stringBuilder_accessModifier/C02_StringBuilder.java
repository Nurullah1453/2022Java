package ders29_stringBuilder_accessModifier;

public class C02_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java Candır");

        System.out.println(sb1.reverse()); // rıdnaC avaJ

        System.out.println("Tersini Yazdırdıktan sonra Sb1: "+sb1); //Tersini Yazdırdıktan sonra Sb1: rıdnaC avaJ

        System.out.println(sb1.insert(0,".")); //.rıdnaC avaJ

        System.out.println(sb1.reverse()); //Java Candır.

        StringBuilder sb2= new StringBuilder("Java Candır.");
        String str = "Java Candır.";

        System.out.println(sb1==sb2); //false içerik aynı olsa bile false verir
        System.out.println(sb1==sb1); //true sadece bir sb kendisi ile karşılaşıtrırsa eşit olur
        // System.out.println(sb1==str); farklı 2 data türü karşılaştırılamaz

        System.out.println(sb1.equals(sb2)); //false içerik aynı olsa bile false verir
        System.out.println(sb1.equals(sb1)); //true sadece bir sb kendisi ile karşılaşıtrırsa eşit olur
        System.out.println(sb1.equals(str)); //false cte vermez fakat her zaman false'dir

        System.out.println(sb1.compareTo(sb2)); //0

        StringBuilder sb3= new StringBuilder("Java Kandır");

        System.out.println(sb1.compareTo(sb3)); //-8

        /*
        compareTo sadece tamamen aynı mı yoksa farklı mı sorusunun cevabını verir.
        Tamamen aynı ise 0 döner.
        Farklılık varsa o zaman ilk farklı harfi bulduğunda farklı harflerin arasında
        kaç harf oldugunu verir.
         */





    }
}
