package tgsKelompok;

import java.util.Scanner;

public class Tk1CaseGrading {
    public static String rPad(String text,int textLength){
        return String.format("%"+(-textLength)+"s",text);
    }

    public static void main(String[] args){
        int tp1,tp2,tk1,tk2,quiz1,quiz2,exam;
        double nilaiAkhir;
        String nim,namaMhs,grade;
        Scanner input= new Scanner(System.in);

        //ask for input
        System.out.print(rPad("Input NIM",34)+": ");
        nim= input.nextLine();
        System.out.print(rPad("Input Nama Mahasiswa",34)+": ");
        namaMhs= input.nextLine();
        System.out.print(rPad("Input Nilai Tugas Personal ke-1",34)+": ");
        tp1=Integer.parseInt(input.nextLine());
        System.out.print(rPad("Input Nilai Tugas Personal ke-2",34)+": ");
        tp2=Integer.parseInt(input.nextLine());
        System.out.print(rPad("Input Nilai Tugas Kelompok ke-1",34)+": ");
        tk1=Integer.parseInt(input.nextLine());
        System.out.print(rPad("Input Nilai Tugas Kelompok ke-2",34)+": ");
        tk2=Integer.parseInt(input.nextLine());
        System.out.print(rPad("Input Nilai Quiz ke-1",34)+": ");
        quiz1=Integer.parseInt(input.nextLine());
        System.out.print(rPad("Input Nilai Quiz ke-2",34)+": ");
        quiz2=Integer.parseInt(input.nextLine());
        System.out.print(rPad("Input Nilai Exam",34)+": ");
        exam=Integer.parseInt(input.nextLine());
        System.out.println("-".repeat(50));

        //process: 15%TP1 + 15%TP2 + 10%TK1 + 10%TK2 + 10% kuis 1+ 10% kuis 2 + 30% UAS
        nilaiAkhir=(tp1*0.15) + (tp2*0.15) + (tk1*0.1) + (tk2*0.1)+(quiz1*0.1)+ (quiz2*0.1) + (exam*0.3);
        if(nilaiAkhir>=85)
            grade="A";
        else if(nilaiAkhir>=75)
            grade="B";
        else if(nilaiAkhir>=65)
            grade="C";
        else if(nilaiAkhir>=50)
            grade="D";
        else
            grade="F";

        System.out.println(rPad("*** NILAI AKHIR",34)+": " + nilaiAkhir);
        System.out.println(rPad("*** GRADE",34)+": " + grade);
        System.out.println("=".repeat(50));

    }
}
