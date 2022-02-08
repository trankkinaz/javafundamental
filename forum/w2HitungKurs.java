// Program Hitung Kurs
// By: Budi Sutiarso - 2402003881
// Date: 04-Dec-2021
// Desc: Hitung Kurs Rupiah ke: Yen, Ringgit, SGD, Yuan
package forum;
import java.util.Scanner;

public class w2HitungKurs {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        float rupiah, yen, ringgit,sgd, yuan;
        System.out.print("Masukan Rupiah = ");
        rupiah = masukan.nextFloat();
        //konversi nilai rupiah sesuai kurs tanggal 4-Dec-2021
        yen = (float) (rupiah*0.0078);
        ringgit = (float) (rupiah*0.00029);
        sgd = (float) (rupiah*0.000094);
        yuan = (float) (rupiah*0.00004);
        System.out.println("Hasil Kurs : ");
        System.out.println("_____");
        System.out.println("Yen"+" ".repeat(8-"yen".length())+"= " + yen);
        System.out.println("Ringgit"+" ".repeat(8-"Ringgit".length())+"= "  + ringgit);
        System.out.println("SGD"+" ".repeat(8-"SGD".length())+"= "  + sgd);
        System.out.println("Yuan" +" ".repeat(8-"Yuan".length())+"= " + yuan);
        System.out.println("*****");
    }
}
