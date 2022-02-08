/*
    Program Tebak Angka
    By: Budi Sutiarso - 2402003881
    Date: 04-Dec-2021
    Desc: Permainan tebak angka. User menebak angka hingga benar.
          Tampilkan nilai jika 5 kali gagal.
*/
package forum;
import java.util.Scanner;

public class w2TebakAngka {
    public static void main(String[] args) {
        //Input
        int random, tebak, trial;
        random = (int) (Math.random() * 100);
        System.out.println("Tebaklah Angka Antara 1-100");
        Scanner masukan = new Scanner(System.in);
        trial = 0;
        //Proses
        do {
            trial++;
            if (trial>5){
                System.out.println("*** OOOPPS! ****");
                System.out.println("Maaf, Kesempatan Menebak Anda Sudah HABIS!");
                System.out.println("Nilai Yang Benar Adalah: " + random);
                System.out.println("*** Jangan Sedih Ya ^_^ ****");
                break;
            }
            System.out.print("Masukkan Tebakan Anda : ");
            tebak = masukan.nextInt();
            //Output
            if (tebak > random) {
                System.out.println("Tebakan Terlalu Besar");
            } else if (tebak < random) {
                System.out.println("Tebakan Terlalu Kecil");
            } else {
                System.out.print("Tebakan Benar! Setelah " + trial + " Kali Menebak");
                break;
            }
        } while (trial != random);
    }
}
