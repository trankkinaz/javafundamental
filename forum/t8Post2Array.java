package forum;

import java.util.Arrays;

public class t8Post2Array {
    public static void main(String[] args) {
        String[] kota={"Serang","Tangerang","Palembang","Lombok","Halmahera","Surabaya"};
        //sort desc z to a
        Arrays.stream(kota).sorted((s1,s2)->s2.compareTo(s1))
        //sort asc a to z
        //Arrays.stream(kota).sorted((s1,s2)->s1.compareTo(s2))
                .forEach(System.out::println);
    }
}
