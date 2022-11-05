package ders30_encapsulation;

public class EChild extends DParent{

    //Java'daki inheritance'nin insanlardan en büyük farkı şu:
    //İnsanlarda parent child edinebilir. Ama child parent'ını seçemez
    //Javada ise tam tersidir. Yani siz bir class oluşturdugunuzda daha önce oluşturulmus
    //classlardan tüm özelliklerini inherit etmek (miras almak) istediğiniz class'ı
    //parent EDİNİRSİNİZ. Yani child parent'ini seçer.

    //Bir class başka bir class'ı inherit etmek istediğinde extends keyword ile bunu
    //deklare eder.

    public static void main(String[] args) {

        EChild child1= new EChild();

        child1.yas=30;
        child1.isim="Mahmut";
        child1.isEnought=false;

    }



}
