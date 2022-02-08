package forum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class t6Post3Refactor {
    public static void main(String[] args) {
        int x,y;
        String rs = null;
        Scanner input=new Scanner(System.in);
        try{
            System.out.print("Masukkan X: ");
            x=input.nextInt();
            System.out.print("Masukkan Y: ");
            y=input.nextInt();
            rs="" +(x/y);
        }catch (ArithmeticException ex){
            rs= ex.getClass().getCanonicalName() +": " + ex.getMessage();
        }catch (InputMismatchException ex){
            rs= ex.getClass().getCanonicalName() + ": " + ex.getMessage();
        }finally {
            System.out.println("Hasilnya : "+ rs);
        }
    }
}
