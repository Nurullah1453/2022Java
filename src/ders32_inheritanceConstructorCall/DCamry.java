package ders32_inheritanceConstructorCall;

public class DCamry extends BToyota {

    DCamry(String pc){
        super("Deniz");
        System.out.println("String Parametreli DCmary");

    }
    DCamry () {

    }
    public static void main(String[] args) {
        //Eğer kullanılan argümente uygun bir constructor parants classda yok direkt CTE olur.

        DCamry camry2= new DCamry("celal");

        DCamry camry1= new DCamry();

    }
}
