package etc;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        //buat segitiga sama sisi
        Scanner input= new Scanner(System.in);
        System.out.print("Input sisi segitiga: ");
        int sisi= input.nextInt();
        int sfx=0;
        //print
        int i;
        for (i=1;i<=sisi;i++){
            sfx=((sisi-i)/2)+2;
            System.out.println(" ".repeat(sfx) + "*".repeat(i) + " ".repeat(sfx));
        }
    }
}
