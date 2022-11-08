package ders31_inheritance;

public class FToyota extends EAraba{

    FToyota(){
        super();
        System.out.println("FToyota consructor çalıştı");
    }

    protected String marka="Toyota";
    protected String motor="Toyota araçlar çevreci motor kullanır.";
    protected String üretimYeri="Üretim Yeri Belirtilmedi";
    protected int hız=140;


}
