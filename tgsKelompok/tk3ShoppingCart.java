package tgsKelompok;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class tk3ShoppingCart {
    static ArrayList<String>cartList=new ArrayList<String>();
    static ArrayList<Integer>cartQty=new ArrayList<Integer>();
    static Scanner input= new Scanner(System.in);

    public static void main(String[] args) {
        int idMenu=0;
        //display menu options
        System.out.println("**** KERANJANG BELANJA TEAM-2 ****");
        System.out.println("[1] Tambah Produk");
        System.out.println("[2] Hapus Produk");
        System.out.println("[3] Ubah Produk");
        System.out.println("[4] Lihat Produk");
        System.out.println("[5] Keluar");

        //loop by idmenu input
        while(idMenu!=5){
            System.out.println("-".repeat(80));
            idMenu=askNumberInput("Input Menu [1/2/3/4/5] : ");
            System.out.println("-".repeat(80));
            switch (idMenu){
                case 1:{
                    addProduk(askProdName());
                    break;
                }
                case 2:{
                    delProduk(askProdName());
                    break;
                }
                case 3:{
                    editProduk(askProdName());
                    break;
                }
                case 4:{
                    listProduk();
                    break;
                }
                case 5:{
                    break;
                }
                default:System.out.println("Oops!, Menu tidak tersedia, ulangi input");
            }
        }
        System.out.println(".:. Terima kasih, Sampai Jumpa Lagi .:.");
    }

    public static int askNumberInput(String msgPrompt){
        //validate user input for number data
        //loop until user entry valid number
        System.out.print(msgPrompt);
        try{
            int rs=Integer.parseInt(input.nextLine());
            if(rs>0){
                return rs;
            } else{
                System.out.println("Invalid Number, input angka > 0");
                return askNumberInput(msgPrompt);
            }
        }catch (InputMismatchException ex){
            System.out.println("Invalid Input");
            return askNumberInput(msgPrompt);
        }catch (NumberFormatException ex){
            System.out.println("Invalid Input");
            return askNumberInput(msgPrompt);
        }
    }

    public static String askProdName(){
        //validate string input for empty string or length <3
        System.out.print("Input Nama Produk: ");
        String rsText=input.nextLine();
        if(rsText.equals("")||rsText.length()<3){
            System.out.println("Input tidak boleh kosong atau kurang dari 3 karakter");
            return askProdName();
        }else {
            return rsText;
        }
    }

    public static int getProdukIndex(String prodName){
        //check if produk sudah ada di arraylist
        //memastikan tidak ada data produk double
        //return -1 jika produk tidak ada di cart
        return cartList.indexOf(prodName);
    }

    public static void addProduk(String prodName){
        //add prod name element to array
        //check if new produk is already exist on cart
        System.out.println("[1] Tambah Produk");
        int idxProduk=getProdukIndex(prodName);
        if(idxProduk==-1){
            //ask for qty
            int qty=askNumberInput("Input Qty Produk: ");
            cartList.add(prodName);
            cartQty.add(qty);
            System.out.println("Produk: " + prodName +" * " + qty + " ditambahkan ke Keranjang.") ;
        }else{
            //call edit method
            System.out.print("Produk: "+ prodName +" sudah ada di keranjang!,"+ System.lineSeparator()+"Edit Produk ini? [Ya | Tidak]:");
            String rsPrompt= input.nextLine();
            if(rsPrompt.toLowerCase().equals("ya")){
                editProduk(prodName);
            }
        }

    }

    public static void editProduk(String prodName){
        System.out.println("[3] Ubah Produk");
        int idxProduk=getProdukIndex(prodName);
        if(idxProduk>=0){
            int qtyBaru=askNumberInput("Input Qty Produk yang baru: ");
            cartQty.set(idxProduk,qtyBaru);
            System.out.println("Produk: " +prodName + " diubah qty menjadi * "+ qtyBaru);
        }else{
            System.out.println("Produk Yang dicari tidak ada");
        }
    }

    public static void delProduk(String prodName){
        System.out.println("[2] Hapus Produk");
        int idxProduk=getProdukIndex(prodName);
        if(idxProduk>=0){
            System.out.print("Apakah Anda yakin mau menghapus produk ini dari keranjang Anda? [Ya | Tidak]: ");
            String rsPrompt= input.nextLine();
            if(rsPrompt.toLowerCase().equals("ya")){
                cartList.remove(idxProduk);
                cartQty.remove(idxProduk);
                System.out.println("Produk: "+ prodName + " dihapus dari keranjang");
            }
        }else{
            System.out.println("Produk Yang dicari tidak ada");
        }
    }

    public static void listProduk(){
        System.out.println("[4] Lihat Produk");
        if(cartList.size()==0){
            System.out.println("Keranjang Anda masih kosong, Ayo diisi!");
            return;//exit if cart is empty
        }
        System.out.println("Daftar Produk dalam Keranjang Anda:");
        for(int i=0;i<cartList.size();i++){
            System.out.println(String.format("%1$s. %2$s * %3$s",i+1,rPad(cartList.get(i),60),cartQty.get(i)));
        }

    }

    public static String rPad(String text,int textLength){
        return String.format("%"+(-textLength)+"s",text);
    }

}
