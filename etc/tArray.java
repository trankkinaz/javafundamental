package etc;
import java.util.Scanner;

public class tArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[5];

        // index start from 0
        // element start from 1
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan array index ke-" + i +": ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }


    }

}
