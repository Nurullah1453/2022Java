package ders32_inheritanceConstructorCall;

public class GAvcıKuslar extends FKuslar{

    public static void main(String[] args) {

        GAvcıKuslar avcı1= new GAvcıKuslar();

        FKuslar avcı2= new GAvcıKuslar();

        EHayvanlar avcı3= new GAvcıKuslar();

        /*
        Bir child classda obje oluşturmak için child class constructor'ı kullanılır.
        Ama
        Data türünü o objenin bağlı olduğu classlardan seçebiliriz.

        Eğer constructor ve data türü farklı seçilirse bu durumda class üyesi olan
        variable ve methodlar farklı davranışlar gösterirler.
         */

    }

}
