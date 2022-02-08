package tgsKelompok;

import java.util.Scanner;

public class Tk2Case4 {
    public static String rPad(String text,int textLength){
        return String.format("%"+(-textLength)+"s",text);
    }
    public static void main(String[] args) {
        System.out.println("**** Program Hitung Luas & Volume ****");
        System.out.println("[1] Luas Permukaan dan Volume Tabung");
        System.out.println("[2] Luas Permukaan dan Volume Balok");
        System.out.println("[3] Luas Permukaan dan Volume Bola");
        System.out.println("[4] Keluar");
        System.out.println("-".repeat(38));

        //init var
        double panjang,lebar,tinggi,jari,luas,volume;

        //init input
        Scanner input = new Scanner(System.in);
        int idMenu=0;

        //loop for user input
        while (idMenu!=4){
            System.out.print("Input Menu [1/2/3/4] : ");
            idMenu=Integer.parseInt(input.nextLine());
            System.out.println("-".repeat(38));
            //menu switcing
            switch (idMenu){
                case 1: {
                    //luas permukaan : 2 * π * r * ( r + t )
                    //volume tabung:  π * r² * t
                    System.out.println("[1] Luas Permukaan dan Volume Tabung");
                    System.out.print(rPad("Input Jari-jari",30)+": ");
                    jari=Integer.parseInt(input.nextLine());
                    System.out.print(rPad("Input Tinggi",30)+": ");
                    tinggi=Integer.parseInt(input.nextLine());
                    luas= Math.round(2 * Math.PI * jari * (jari + tinggi));
                    volume=Math.round( Math.PI * Math.pow(jari,2) * tinggi);
                    System.out.println("-".repeat(30));
                    System.out.println(rPad("~ Luas Permukaan Tabung",30)+": "+String.format("%1$.0f",luas));
                    System.out.println(rPad("~ Volume Tabung",30)+": "+String.format("%1$.0f",volume));
                    System.out.println("~".repeat(38));
                    break;
                    }
                case 2:{
                    //luas permukaan:  2 × (p.l + p.t +l.t)
                    //volume: p × l × t
                    System.out.println("[2] Luas Permukaan dan Volume Balok");
                    System.out.print(rPad("Input Panjang",30)+": ");
                    panjang=Integer.parseInt(input.nextLine());
                    System.out.print(rPad("Input Lebar",30)+": ");
                    lebar=Integer.parseInt(input.nextLine());
                    System.out.print(rPad("Input Tinggi",30)+": ");
                    tinggi=Integer.parseInt(input.nextLine());
                    luas= 2 * ((panjang*lebar)+(panjang*tinggi)+(tinggi*lebar));
                    volume= panjang * lebar * tinggi;
                    System.out.println("-".repeat(30));
                    System.out.println(rPad("~ Luas Permukaan Balok",30)+": "+String.format("%1$.0f",luas));
                    System.out.println(rPad("~ Volume Balok",30)+": "+String.format("%1$.0f",volume));
                    System.out.println("~".repeat(38));
                    break;
                    }
                case 3:{
                    //luas permukaan bola: 4 × π × r²
                    //volume bola: 4/3 × π × r³
                    System.out.println("[3] Luas Permukaan dan Volume Bola");
                    System.out.print(rPad("Input Jari-jari",30)+": ");
                    jari=Integer.parseInt(input.nextLine());
                    luas=Math.round(4 * Math.PI * Math.pow(jari,2));
                    volume=Math.round( (4.0/3) * Math.PI * Math.pow(jari,3));
                    System.out.println("-".repeat(30));
                    System.out.println(rPad("~ Luas Permukaan Bola",30)+": "+String.format("%1$.0f",luas));
                    System.out.println(rPad("~ Volume Bola",30)+": "+String.format("%1$.0f",volume));
                    System.out.println("~".repeat(38));
                    break;
                    }
                case 4:{
                    System.out.println("~~~~ Good Bye ~~~~");
                    break;
                }
                default:System.out.println("Oops!, Menu tidak tersedia, ulangi input");
            }
        }
    }
}
