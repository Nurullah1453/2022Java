package ders39_abstractClass;

public abstract class Araba {
    //araba classını inherit eden tüm classlar motor marka kasa ve tekerlek
    //methodlarını override etmek zorunda kalsın.
    //ancak abs, klima methodları obsiyonel olsun isteyen child bu methodları override etsin
    //isteyen override etmesin

    public abstract void motor();

    public abstract void marka();

    public abstract void kasa();

    public abstract void tekerler();

    public void abs(){
        System.out.println("Güvenlik arttırmak isteyen arabalar abs kullanmalı");
    }

    public void klima(){
        System.out.println("Konfor arttırmak isteyen arabalar klima kullanmalı");
    }

}
