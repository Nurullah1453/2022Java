package ders33_inheritanceDataTipeKullanımı_overriding;

public class EKuslar extends DHayvanlar{

    protected void kanat (){
        System.out.println("Kuslar Kanatlıdır");
    }
    protected void solunum(){
        System.out.println("Kuşlar akciğerle nefes alırlar");
    }
    protected void gaga(){
        System.out.println("Kuşların gagaları vardır");
    }
    protected void cogalma(){
        System.out.println("Kuşlar yumurtayla cogalırlar");
    }

}
