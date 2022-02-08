package forum;

import java.util.Scanner;
public class t7Post3Method {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Masukkan Nilai x: ");
        int pownum= input.nextInt();
        System.out.println("Jawabannya: " + powDigitSum(pownum));
    }

    public static String powDigitSum(int powerNum){
        String rs="";
        int rsPow=(int) Math.pow(2, powerNum);
        int rsPowVal=0;
        for(char c:String.valueOf(rsPow).toCharArray()){
            rsPowVal += Integer.parseInt(String.valueOf(c));
            rs += c + "+";
        }
        //return result to main method as string.
        //concat each digit and total sum
        return rs.substring(0,rs.length()-1) + "= " + rsPowVal;
    }


}
