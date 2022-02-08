package forum;

public class pptMath {
    public static void main(String[] args) {
        //math class
        //hitung 8 pangkat 4
        double caseNoPow= 8 * 8 * 8 * 8;
        System.out.println(" hasil 8 pangkat 4: " + caseNoPow);

        //hitung 8 pangkat 4 dengan method pow
        double casePow=Math.pow(8, 4);
        System.out.println(" hasil pow(8,4): " + casePow);

        //case rounding: 7.25
        double caseRound= 7.25;
        System.out.println(String.format("Round %1$s metode round : %2$s", caseRound,Math.round(caseRound)));
        System.out.println(String.format("Round %1$s metode ceil : %2$s", caseRound,Math.ceil(caseRound)));
        System.out.println(String.format("Round %1$s metode floor : %2$s", caseRound,Math.floor(caseRound)));
        System.out.println(String.format("Round %1$s metode rint : %2$s", caseRound,Math.rint(caseRound)));
        System.out.println(String.format("Round %1$s metode rint : %2$s", caseRound,(int) Math.floor(caseRound + 0.5)));

        //case min & max
        double tarif =2000;
        double tarifMaks = 50000;
        double jamParkir= 30;
        double jmlBiaya=0;
        System.out.println(String.format("Nilai Min dari  %1$s dan %2$s : %3$s", tarif,tarifMaks, Math.min(tarif,tarifMaks)));
        System.out.println(String.format("Nilai Max dari  %1$s dan %2$s : %3$s", tarif,tarifMaks, Math.max(tarif,tarifMaks)));

        //tarif parkir per jam rp. 5, max 50rb
        System.out.println(String.format("Biaya Parkir tarif  %1$s dan %2$s : %3$s", tarif,jamParkir, tarif * jamParkir));
        //cara1:
        if ((jamParkir * tarif)<tarifMaks){
            jmlBiaya=jamParkir * tarif;
        }else{
            jmlBiaya=tarifMaks;
        }
       
        System.out.println(String.format("Biaya Parkir selama %1$s jam : %2$s", jamParkir, jmlBiaya));
         
        //cara2: math class
        System.out.println(String.format("Biaya Parkir selama %1$s jam Math: %2$s", jamParkir, Math.min((tarif * jamParkir), tarifMaks)));

        //cara3: ternary operation
        double jmlBiaya3=((jamParkir*tarif)<tarifMaks?(jamParkir*tarif):tarifMaks);
        System.out.println(String.format("Biaya Parkir selama %1$s jam ternary: %2$s", jamParkir,jmlBiaya3));

        //sqrt
        jamParkir=7;
        System.out.println(String.format(" %1$s kuadrat: %2$s", jamParkir, Math.sqrt(jamParkir)));

        
        


    }
}
