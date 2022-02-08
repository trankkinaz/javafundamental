/*
    By: Budi Sutiarso - 2402003881
    Penjumlahan no HP
 */
package forum;
import java.util.Scanner;

public class w3NoHp {
    public static void main(String [] args){
        String noHp;
        int charVal;
        int jml=0;

        //input
        System.out.println("Input Nomor HP Anda:");
        Scanner input=new Scanner(System.in);
        noHp=input.next();

        //process
        int i;
        for(i=0;i<noHp.length();i++){
            charVal=Integer.parseInt(noHp.substring(i,i+1));
            jml +=charVal;
        }
        System.out.println("Hasil Penjumlahan No HP: " );
        System.out.println(jml);
    }
}
