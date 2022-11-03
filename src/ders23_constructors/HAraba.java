package ders23_constructors;

public class HAraba {

    String marka="Marka Belirtilmedi";
    String model="Model Belirtilmedi";
    String yakıt;
    int yıl;
    int fiyat;

    public HAraba(String mrk,String mdl,String ykt,int yl,int fyt){

        marka=mrk;
        model=mdl;
        yakıt=ykt;
        yıl=yl;
        fiyat=fyt;


    }
    public HAraba(String mrk,String mdl,int yl){
        //İstersek parametreleri azaltarakta constructer oluşturabiliriz
        marka=mrk;
        model=mrk;
        yıl=yl;
    }

    public HAraba(){
        //görünür durumdaki parametresiz constructer default constructer değildir
        //Default constructer'ın bodyside boş olur
        //Ancak parametresiz constructerda bodye kod yazılabilir.

        //parametresiz constructer'ın bodysinde kod yoksa default constructer
        //ile aynı işlevi görür ama yinede görünür durumdaysa default constructer denmez
    }

    //Biz gözle görülür herhangi bir constructor oluşurduğumuzda java default constructor'u
    //siler bu durumda daha önce oluşturulmuş olan objelerin sorun olmaması için
    //class'a parametresiz bir constructor eklememiz faydalı olur.


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
