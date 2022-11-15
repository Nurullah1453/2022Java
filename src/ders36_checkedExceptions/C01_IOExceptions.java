package ders36_checkedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C01_IOExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis= new FileInputStream("src/ders36_checkedExceptions/Deneme.txt");
        FileOutputStream fos= new FileOutputStream("src/ders36_checkedExceptions/Deneme.txt");
        //Java ile bilgisayarımızdaki bir dosyaya ulaşmak istersek
        // FileInputStream classından obje oluşturup o obje aracılığıyla dosyayı kullanabiliriz.

        //fis oluşururken ulaşmak istediğimiz dosyanın dosya yolunu parametre olarak girmeliyiz.

        //Checked exception oluşturma ihtimali olan kodları yazdıgımızda
        // java compile time'da orada bir hata ihtimali oldugunu görür ve kodun altını kırmızı cizer
        //Bu durumda kırmızı çizgiyi kaldırmak için iki yöntem vardır:
        //1- Excaption'u try catch bloğu ile handle etmek
        //2- Javaya sorun ihtimalinin farkında oldugumuzu ama kodumuza güvendiğimizi ve çalışmaya
        //devam etmesini istediğimizi söylemek. Bunun için method signaturesine method
        //declarasyonu ile curly braces arasına throws keyword ve beklenen excepion türü yazılabilir.
    }

}
