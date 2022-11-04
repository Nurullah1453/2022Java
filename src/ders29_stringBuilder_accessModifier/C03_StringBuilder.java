package ders29_stringBuilder_accessModifier;

public class C03_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Java ne kadar güzel");

        System.out.println(sb.substring(4)); //ne kadar güzel

        System.out.println(sb); //Java ne kadar güzel sb degişmedi çünkü substring string
        //string döndürdüğü için kalıcı olması için atama yapılması gerekir. Fakat atama yapmaya
        //izin vermez. Eşitliğin solu builder sağı ise string oldugu için

        //sb=sb.substring(4); İZİN VERMEZ

        //sb güzel kelimesi içeriyor mu ?
        /*
        StringBuilder'de olmayan, String class'ında bulunan methodları kullanmak isterseniz
        önce toString methodu ile String'e çevirip sonra String manipulation yapılabilir.
         */

        System.out.println(sb.toString().contains("güzel"));

        sb.setCharAt(5,'N');
        System.out.println(sb);

    }
}
