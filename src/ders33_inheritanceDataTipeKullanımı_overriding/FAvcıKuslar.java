package ders33_inheritanceDataTipeKullanımı_overriding;

public class FAvcıKuslar extends EKuslar{

    public void hareket (){
        System.out.println("Avcı kuşlar ucarlar");
    }
    public void beslenme(){
        System.out.println("Avcı kuşlar et yerler");
    }
    public void pence(){
        System.out.println("Avcı kuşlar pencelidir");
    }
    public void gaga(){
        System.out.println("Avcı kuşlar sivri gagalıdır.");
    }

    public static void main(String[] args) {

        FAvcıKuslar avcı1= new FAvcıKuslar();
        /*
        Bir obje oluştulurken constructor ve data türü aynı ise hangi methodun
        geçerli oldugunu bulmak için o classa gider varsa kullanırız.
        yoksa parentlara gider ilk buldugumuzu kullanırız.
         */

        avcı1.beslenme();//FavcıKuslar classından kullanır
        avcı1.gaga(); //FavcıKuslar classından kullanır
        avcı1.pence(); //FavcıKuslar classından kullanır
        avcı1.hareket(); //FavcıKuslar classından kullanır
        avcı1.omur(); //Hayvanlar classından kullanır
        avcı1.solunum(); //Kuslar classından kullanır
        avcı1.cogalma(); //Kuslar classından kullanır
        avcı1.kanat(); //Kuslar classından kullanır

        EKuslar avcı2= new FAvcıKuslar();

        /*
        Bir obje oluşurulurken data türü ile constroctur farklı ise hangi methodun
        geçerli oldugunu bulmak için
        Önce data türünün olduğu class ve parentlarına bakarak o methodu buluruz.
        Bulamazsak CTE verir.
        Bulursak hemen ÇALTIRMAYIZ çalıştırmadan önce o method override edilmiş mi
        diye kontrol ederiz. Edilmişse override eden methodu çalıştırırız.
         */

        avcı2.beslenme();//FavcıKuslar classından kullanır
        avcı2.gaga(); //FavcıKuslar classından kullanır
        //avcı2.pence(); //CTE verir
        avcı2.hareket(); //FavcıKuslar classından kullanır
        avcı2.omur(); //Hayvanlar classından kullanır
        avcı2.solunum(); //Kuslar classından kullanır
        avcı2.cogalma(); //Kuslar classından kullanır
        avcı2.kanat(); //Kuslar classından kullanır

        DHayvanlar avcı3= new FAvcıKuslar();

        avcı3.beslenme();//FavcıKuslar classından kullanır
        //avcı3.gaga(); //CTE verir
        //avcı2.pence(); //CTE verir
        avcı3.hareket(); //FavcıKuslar classından kullanır
        avcı3.omur(); //Hayvanlar classından kullanır
        avcı3.solunum(); //Kuslar classından kullanır
        avcı3.cogalma(); //Kuslar classından kullanır
        //avcı3.kanat(); // CTE verir

        EKuslar kus1= new EKuslar();
        /*
        Methodlarla belirlenen özellikler en güncel bilgiyi bulurken variable ile belirlenen
        özellikler ilk bulduğu değeri kullanır. Bunun için methodlara dinamik özellik
        variablara static özellik denir.
         */

        kus1.cogalma(); //kuslar classından kullanılır
        kus1.gaga(); //kuslar classından kullanılır
        kus1.kanat(); //kuslar classından kullanılır
        kus1.hareket(); //hayvanlar classından kullanılır
        kus1.cogalma(); //kuslar classından kullanılır
        kus1.solunum(); //kuslar classından kullanılır
        kus1.beslenme(); //hayvanlar classından kullanılır
        kus1.omur(); //hayvanlar classından kullanılır

        DHayvanlar kus2= new EKuslar();

        kus2.cogalma(); //kuslar classından kullanılır
        //kus2.gaga(); //CTE verir
        //kus2.kanat(); //CTE verir
        kus2.hareket(); //Hayvanlar classından kullanılır.
        kus2.cogalma(); //kuslar classından kullanılır
        kus2.solunum(); //kuslar classından kullanılır
        kus2.beslenme(); //hayvanlar classından kullanılır
        kus2.omur(); //hayvanlar classından kullanılır

    }

}
