package TK4;
//by GIO
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TK4 {
    static Scanner inputAngka = new Scanner(System.in);
    static int panjangArray = dataInput();
    static int[] arrayAngka = new int [panjangArray];
    static int[] arraySortAsc = new int[panjangArray];
    static int[] arraySortDesc = new int[panjangArray];

    public static void main(String[] args) throws IOException {
        do{
            menuApp();
        }
        while(true);
    }

    static void menuApp() throws IOException{
        System.out.println("==========MENU==========");
        System.out.println("[1] Lihat Angka");
        System.out.println("[2] Acak Angka");
        System.out.println("[3] Urutkan Ascending");
        System.out.println("[4] Urutkan Descending");
        System.out.println("[5] Keluar");
        System.out.print("PILIH MENU > ");
            try{
                int selectedMenu = Integer.valueOf(inputAngka.nextLine());
                switch (selectedMenu) {
                    case 1:
                    acakAngka(panjangArray);
                    lihatArray(arrayAngka);
                    break;
                    case 2:
                    acakAngka(panjangArray);
                    lihatArray(arrayAngka);
                    break;
                    case 3:
                    sortAsc(arrayAngka);
                    break;
                    case 4:
                    sortDesc(arrayAngka);
                    break;
                    case 5:
                    System.exit(0);
                    break;
                    default:
                    System.out.println("Pilihan menu tidak tersedia");
                }
            }
    
            catch (Exception e){
                System.out.println("Input harus berupa angka");
            }
    }
            static int dataInput(){
                boolean kondisi = true;
                while(kondisi){
                    try{
                        System.out.print("Input Index Angka: ");
                        panjangArray = Integer.valueOf(inputAngka.nextLine());
                        kondisi = false;
                    }
                    catch (Exception e){
                        System.out.println("Input harus berupa angka");
                    }
                }
                return panjangArray;
            }

        private static int[] acakAngka(int arrayIndex){
            for(int a = 0; a < arrayIndex; a++){
                int angkaAcak = (int) (Math.random() * 20);
                arrayAngka[a] = angkaAcak;
            }
            return arrayAngka;
        }

        private static void lihatArray(int[] dataArray){
            System.out.println("Hasil Acak Angka : " + Arrays.toString(dataArray));
        }

    private static void sortAsc(int[] arrayAngka){
        arraySortAsc = Arrays.copyOf(arrayAngka, panjangArray);
        Arrays.sort(arraySortAsc);
            System.out.println("Hasil Sort Ascending : " + Arrays.toString(arraySortAsc));
    }

    private static void sortDesc(int[] arrayAngka){
        arraySortDesc = Arrays.copyOf(arrayAngka, panjangArray);
        Arrays.sort(arraySortDesc);
        for(int a = 0; a < panjangArray/2; a++){
            int b = arraySortDesc[panjangArray-(a+1)];

            arraySortDesc[panjangArray-(a+1)] = arraySortDesc[a];
            arraySortDesc[a] = b;
        }
        System.out.println("Hasil Sort Descending : " + Arrays.toString(arraySortDesc));
    }
}