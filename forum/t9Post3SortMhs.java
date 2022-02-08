package forum;

import java.util.*;

public class t9Post3SortMhs {

    static Scanner input=new Scanner(System.in);
    static ArrayList<String> listNama= new ArrayList<>();
    static ArrayList<String> listNim=new ArrayList<>();
    static ArrayList<Double> listIpk=new ArrayList<>();


    public static void main(String[] args) {
        //input data
//        System.out.print("Input Jumlah data: ");
//        int dataCnt= Integer.parseInt(input.nextLine());
//        for(int i=0; i<dataCnt;++i){
//            System.out.println("Data Mahasiswa-" + (i+1));
//            System.out.print("Input NIM : ");
//            listNim.add(input.nextLine());
//            System.out.print("Input Nama: ");
//            listNama.add(input.nextLine());
//            System.out.print("Input IPK : ");
//            listIpk.add(Double.parseDouble(input.nextLine()));
//            System.out.println("----- o0o -----");
//        }
        //dummy data
        listNim.add("0340008533");
        listNama.add("Rumpiah");
        listIpk.add(3.68d);
        listNim.add("0340008585");
        listNama.add("Asham");
        listIpk.add(3.85d);
        listNim.add("0340008556");
        listNama.add("Samsara");
        listIpk.add(3.75d);
        listNim.add("0340008519");
        listNama.add("Sambira");
        listIpk.add(3.75d);
        listNim.add("0340008522");
        listNama.add("Fahrah");
        listIpk.add(3.76d);

        //sorting grade by ipk desc -> name asc -> nim asc
        System.out.println("----- RESULT -----");
        //sorting IPK desc and stream unique value only
        List<Double> ipkDesc= listIpk.stream().distinct().sorted(Comparator.reverseOrder()).toList();

        for (double x:ipkDesc) {
            int freq=Collections.frequency(listIpk,x);
            if(freq>1){
                getNameSorted(x);
            }else{
                System.out.println(listNama.get(listIpk.indexOf(x)));
            }

        }

    }
    static void getNameSorted(double ipk){
       String idxlist="";
        for (int i = 0; i < listIpk.size(); i++) {
            if(listIpk.get(i)==ipk){
              idxlist +=i+",";
            }
        }
        ArrayList<String> lsNama=new ArrayList<>();
        String[] idxNama=idxlist.split(",");
        for(int i=0; i<idxNama.length; i++){
            lsNama.add(listNama.get(Integer.parseInt(idxNama[i])));
        }
        lsNama.stream().sorted().forEach(System.out::println);

    }
    static String getNameByNimSorted(){
        //sample soal forum output hanya nama, sort by NIM has no visual diff anyway
        return  "";
    }
}
