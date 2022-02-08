/*
Forum Topik-5
Budi Sutiarso - 2402003881
*/
package forum;
import java.util.Scanner;

public class t5KataBolakBalik {
    public static void main(String[] args) {
        String kata;
        Scanner input=new Scanner(System.in);

        //ask for input
        System.out.print("Masukkan Kalimat: ");
        kata= input.nextLine();

        //check per char
        Boolean isCool=true; //default value
        int y=kata.length()-1;
        for(int x=0;x<kata.length();x++){
            if(!(kata.charAt(x)==kata.charAt(y))){
                isCool=false;
                break;
            }
            y-=1;
        }
        System.out.println("Jenis Kalimat: "+ ((isCool)?"COOL":"BAD"));
    }
}
