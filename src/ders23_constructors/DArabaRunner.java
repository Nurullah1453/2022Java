package ders23_constructors;

public class DArabaRunner {

    public static void main(String[] args) {

        //Daraba class'ından bir obje oluşturalım.

        DAraba arb1=new DAraba();

        System.out.println(arb1.marka); // Marka Belirtilmedi
        System.out.println(arb1.model); // Model Belirtilmedi
        System.out.println(arb1.yakıt); // null
        System.out.println(arb1.yıl); //0
        System.out.println(arb1.fiyat); //0

        arb1.marka="Tofas";
        arb1.model="Kartal";
        arb1.yakıt="Benzin";
        arb1.fiyat=50000;
        arb1.yıl=1991;
        arb1.maxHiz(arb1.yakıt);

        System.out.println(arb1.marka); //Tofas
        System.out.println(arb1.model); //Kartal
        System.out.println(arb1.yakıt); //Benzin
        System.out.println(arb1.yıl); //1991
        System.out.println(arb1.fiyat); //50000
        System.out.println(arb1.maxHiz(arb1.yakıt)); //230

        DAraba arb2=new DAraba();

        //arb2'nin özellikleri yazdırmak istersek
        System.out.println("Marka: " + arb2.marka+
                "\nModel: "+ arb2.model+
                "\nYakıt: "+arb2.yakıt+
                "\nYıl: "+arb2.yıl+
                "\nFiyat: "+arb2.fiyat);

        DAraba arb3=new DAraba();

        System.out.println(arb3);

        System.out.println(arb1);

        DAraba arb4= new DAraba();

        System.out.println(arb4);
    }
}
