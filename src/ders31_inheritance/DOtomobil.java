package ders31_inheritance;

public class DOtomobil extends BinekArac{

    public static void main(String[] args) {

        DOtomobil oto1=new DOtomobil();
        System.out.println(oto1.marka);

        //inheritance sayesinde bir child class oluşturduğumuzda
        //yeni hiçbir variable veya method oluşturmadan
        //parent classlar'daki tüm özellikleri almış oluruz.
        //Child class'da parent'dan gelen özellikleri
        //update edebilir veya yeni özellikler ekleyebiliriz.


    }
}

