/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4mg3;
import java.util.Scanner;

public class Tugas4Mg3 {

    public static void main(String[] args) {
        // membuat variabel dan Scanner
        int[] harga = new int[5];
        String nama;
        String hadiah;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        
        //header
        System.out.println("-------------------------------------");
        System.out.println("Kharizma Agung Plaza <KAP>");
        System.out.println("Promo Belanja Berhadiah");
        System.out.println("Dengan harga minimum Rp 10000,00");
        System.out.println("-------------------------------------");
        System.out.println("Masukkan nama pembeli : ");
        
        //body
        System.out.println("");
        System.out.println("Masukkan harga barang ke-1 : ");
        harga[0] = scan.nextInt();
        System.out.println("Masukkan harga barang ke-2 : ");
        harga[1] = scan.nextInt();
        System.out.println("Masukkan harga barang ke-3 : ");
        harga[2] = scan.nextInt();
        System.out.println("Masukkan harga barang ke-4 : ");
        harga[3] = scan.nextInt();
        System.out.println("Masukkan harga barang ke-5 : ");
        harga[4] = scan.nextInt();
        
        for (int i =0; i < harga.length; i++){
            sum = sum + harga[i];
        }
        System.out.println("Total harga pembelian atas nama "+ nama +" adalah Rp " +sum);
        
        if(sum >= 100000){
            hadiah = "Mug Cantik";
        } else if(sum >= 75000){
            hadiah = "Piring Kaca";
        }else if(sum >= 50000){
            hadiah = "Rinso 250 gram";
        }else if(sum >= 25000){
            hadiah = "Tanggo";
        }else if(sum >= 20000){
            hadiah = "Tictac";
        }else if(sum >= 10000){
            hadiah = "Sachet Nescafe";
        }else{
            hadiah = "Anda tidak mendapatkan hadiah karena tidak memenuhi harga pembelian";
        }
        System.out.println("");
        System.out.println("Selamat....");
        System.out.println("Anda mendapatkan 1 buah "+hadiah);
        
        //footer
        System.out.println("--------------------------------------------");
        System.out.println("Terima Kasih");
        System.out.println("Anda sudah belanja di Kharizma Agung Plaza");
        
    }
    
}
