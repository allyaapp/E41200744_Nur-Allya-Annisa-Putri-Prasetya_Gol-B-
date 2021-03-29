/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5mg3;
import java.util.Scanner;

public class Tugas5Mg3 {

    public static void main(String[] args) {
        // membuat variabel Scanner
        String menu = null;
        String nama;
        Scanner scan = new Scanner(System.in);
        
        //header
        System.out.println("CAFE CERIA");
        System.out.println("ANEKA MINUMAN");
        System.out.println("-------------------");
        
        //body
        System.out.println("SPECIAL MENU");
        System.out.println("1. Soft drinks");
        System.out.println("2. Mix juice");
        System.out.println("3. Nescafe");
        System.out.println("4. Soda milk");
        System.out.println("5. Tea");
        System.out.println("------------------");
        System.out.println("Masukkan nama pembeli");
        nama = scan.nextLine();
        System.out.println("Silahkan masukkan pilihan anda : ");
        menu = scan.nextLine();
        
        switch(menu){
            case "1":
                System.out.println("Minuman yang anda pesan adalah Soft drinks");
                break;
            case "2":
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                break;
            case "3":
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                break;
            case "4":
                System.out.println("Minuman yang anda pesan adalah Soda milk");
                break;
            case "5":
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
            default:
                System.out.println("Menu tidak ada");
        }
        
        //footer
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terimakasih "+ nama +"telah berkunjung di Cafe Ceria");
    }
    
}
