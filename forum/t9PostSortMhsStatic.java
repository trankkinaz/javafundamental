package forum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class t9PostSortMhsStatic {
    //create static class helper for  custom list
    static class LapHasilStudi{
        String nim;
        String nama;
        Double ipk;
        public LapHasilStudi(String nim, String nama,double ipk){
            this.nim=nim;
            this.nama=nama;
            this.ipk=ipk;
        }
        public String getNama(){
            return this.nama;
        }
        public String getNim(){
            return this.nim;
        }
        public Double getIpk(){
            return this.ipk;
        }
    }

    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        List<LapHasilStudi> lhs=new ArrayList<LapHasilStudi>();
        lhs.add(new LapHasilStudi("0340008533","Rumpiah",3.68d));
        lhs.add(new LapHasilStudi("0340008585","Asham",3.85d));
        lhs.add(new LapHasilStudi("0340008556","Samsara",3.75d));
        lhs.add(new LapHasilStudi("0340008519","Sambira",3.75d));
        lhs.add(new LapHasilStudi("0340008529","Sambira",3.75d));
        lhs.add(new LapHasilStudi("0340008522","Fahrah",3.76d));

        System.out.println("LHS Sorted Result:");
        //sort ipk desc -> nama asc -> nim asc
        lhs.sort(Comparator.comparing(LapHasilStudi::getIpk).reversed()
                .thenComparing(Comparator.comparing(LapHasilStudi::getNama))
                .thenComparing(Comparator.comparing(LapHasilStudi::getNim))
        );
        lhs.forEach(mhs-> System.out.println(mhs.nama));
    }

}
