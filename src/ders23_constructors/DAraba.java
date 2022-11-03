package ders23_constructors;

public class DAraba {

    //Bir proje oluşturulurken tüm classlarda main method olmasına gerek yoktur
    //çoğu class obje oluşturularak kullanılmak üzere hazırlanmış depolardır.
    //Bizde bu class'ı araba objeleri için bir depo olarak dizayn edelim.

    String marka="Marka Belirtilmedi";
    String model="Model Belirtilmedi";
    String yakıt;
    int yıl;
    int fiyat;

    @Override
    public String toString() {
        return "Araba Özellikleri " +
                "\nmarka= " + marka +
                "\nmodel= " + model +
                "\nyakıt: " + yakıt +
                "\nyıl: " + yıl +
                "\nfiyat: " + fiyat
                ;
    }

    public int maxHiz(String yakıt){
        int maxHiz=120;
        if (yakıt.equalsIgnoreCase("dizel")){
            maxHiz=200;
        } else if (yakıt.equalsIgnoreCase("benzin")) {
            maxHiz=230;

        } else if (yakıt.equalsIgnoreCase("elektrikli")) {
            maxHiz=180;

        }
        return maxHiz;
    }

}
