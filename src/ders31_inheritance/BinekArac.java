package ders31_inheritance;

public class BinekArac extends Arac {
    protected String marka="Binek Araçların Markası Olur.";
    protected String model="Binek Araçların Modeli Olur.";
    protected int yıl=1900;

    protected void hız (String yakıt){
        System.out.println("Binek Araçların Hızı Modele Göre Değişir");
    }

    protected void teker(){
        System.out.println("Binek Araçların 4 Tekeri Olur.");
    }

}
