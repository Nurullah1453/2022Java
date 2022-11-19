package ders40_Interfaces;

public interface I01_Interface {

    //Interfaceler özel yapı olduklarından yazılsada yazılmasda public static final'dir
    String mesaj="Hello Interface";
    static int sayı=20;
    public static boolean guzelMı=true;
    public static final int sayı2=30;
    
    void method1();
    abstract int method2();
    public abstract String method3();
    //aynı şekilde tüm methodlar public ve abstractır.
}
