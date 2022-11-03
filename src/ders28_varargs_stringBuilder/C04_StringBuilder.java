package ders28_varargs_stringBuilder;

public class C04_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder(7);

        //Bu kod yazıldığında java 7 karekter alabilecek bir
        //StringBuilder oluşturur.

        System.out.println(sb.capacity()); //7
        System.out.println(sb.length()); //0 hiçbir değer atanmadıgı için 0

        sb.append("Java");

        System.out.println(sb);
        System.out.println(sb.capacity());// 7
        System.out.println(sb.length());//4

        sb.append(" güzeldir.");
        System.out.println(sb); // Java güzeldir.
        System.out.println(sb.capacity()); //16
        System.out.println(sb.length()); //14

        sb.append(" ona ne şüphe");
        System.out.println(sb); //Java güzeldir. ona ne şüphe
        System.out.println(sb.capacity()); //34 (16*2+2 şeklinde kapasiteyi arttırır)
        System.out.println(sb.length()); //27

        //kapasite ve length'i eşitlemek isterseniz trimToSize() methodu kullanılır.

        sb.trimToSize();

        System.out.println(sb); //Java güzeldir. ona ne şüphe
        System.out.println(sb.capacity()); //27
        System.out.println(sb.length()); //27

    }
}
