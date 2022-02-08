package forum;

import java.util.Scanner;

public class w4Selection {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int val=0;
        String hasil="";
        
        System.out.print("Masukkan Angka antara 1 - 100: ");
        val= input.nextInt();

        //casting hasil
        if(val % 2==0){
            if(val>=2 && val<6){
                hasil="Tidak AJAIB";
            }else if(val>=6 && val<=20){
                hasil="AJAIB";
            }else{
                hasil="Tidak AJAIB";
            }

        }else{
            hasil="AJAIB";
        }
        System.out.println("Hasil: " + hasil);


    }
}
