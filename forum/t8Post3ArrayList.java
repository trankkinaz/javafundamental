package forum;

import java.util.ArrayList;

public class t8Post3ArrayList {
    public static void main(String[] args) {
        ArrayList<String> coba= new ArrayList<String>();
        coba.add("satu");
        coba.add("dua");
        System.out.println(coba.contains(new String("satu")));
        System.out.println(coba.indexOf("dua"));
        coba.clear();
        System.out.println(coba);
        System.out.println(coba.get(1));

    }
}
