package ders39_abstractClass;

public abstract class BHonda extends Araba{
    //abstrack bir classı parent edindiğimizde 2 alternati olur
    //1-Parentta bulunan abstract methodları override etmek
    //2-Proje yapımız gerektiriyorsa bu classıda abstract yapmak.

    public void marka(){
        System.out.println("Marka: Honda");
    }

    public abstract void yakıt();

    public abstract void güvenlik();

    public void özelTeknoloji(){
        System.out.println("Tüm Honda arabalar vtec teknolojisi kullanır");
    }
}
