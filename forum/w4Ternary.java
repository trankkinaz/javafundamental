package forum;

public class w4Ternary {
    public static void main(String[] args) {
        int nilai=76;
        if ( nilai > 75 )
            System.out.println("Lulus");
        else
            System.out.println("Gagal");
        
        // String hasilTernary= (nilai>75)? "Lulus":"Gagal";
        // System.out.println("Hasil dgn Ternary: " + hasilTernary);
        System.out.println("Hasil dgn Ternary: " + ((nilai>75)? "Lulus":"Gagal"));

    }

}
