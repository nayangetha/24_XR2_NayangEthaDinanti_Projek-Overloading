/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

import java.util.Scanner;

/**
 *
 * @author MOKLET1
 */
public class Main {
    public static void main(String[] args) {
        
        //Scanner input
        Scanner input = new Scanner(System.in);
        // membuat objek print untuk class Bangun Ruang
        BangunRuang print = new BangunRuang();
        // membuat objek bangun1 untuk class Kubus
        Kubus bangun1 = new Kubus();
        // membuat objek bangun2 untuk class Balok
        Balok bangun2 = new Balok();
        //judul    
        System.out.println("KALKULATOR BANGUN RUANG");
        //pilihan bangun ruang
        System.out.print("1. Kubus \n2. Balok \nPilihan = ");
        //input pilihan user
        String pilihan = input.nextLine();
        //percabangan untuk menentukan pilihan user
        //jika user memilih nomor 1, maka akan menghitung kubus
        if (pilihan.equalsIgnoreCase("1")){
            //pilihan perhitungan bangun ruang
            System.out.print("\n1.");
            //memanggil method luas pada class BangunRuang menggunakan objek print
            print.luas();
            System.out.print("2.");
            //memanggil method volume pada class BangunRuang menggunakan objek print
            print.volume();
            //input pilihan user
            System.out.print("Pilihan = ");
            String p1 = input.nextLine();
            System.out.println("");
            //percabangan untuk menentukan pilihan user
            //jika user memilih nomor 1, maka akan menghitung luas permukaan kubus
            if (p1.equalsIgnoreCase("1")){
                //pemanggilan method overriding luas pada class Kubus menggunakan objek bangun1
                bangun1.luas();
                //pemanggilan method overloading HitungKubus pada class Kubus menggunakan objek bangun1
                bangun1.HitungKubus(10); //pengisian nilai sisi pada method HitungKubus
            }
            else if (p1.equalsIgnoreCase("2")){
                //pemanggilan method overriding volume pada class Kubus menggunakan objek bangun1
                bangun1.volume();
                //pemanggilan method overloading HitungKubus pada class Kubus menggunakan objek bangun1
                bangun1.HitungKubus(10, 10, 10); //pengisian nilai sisi 1,2,3 pada method HitungKubus
            }   
        }
        //jika user memilih nomor 2, maka akan menghitung balok
        else if (pilihan.equalsIgnoreCase("2")){
            //pilihan perhitungan bangun ruang
            System.out.print("\n1.");
            //memanggil method luas pada class BangunRuang menggunakan objek print
            print.luas();
            System.out.print("2.");
            //memanggil method volume pada class BangunRuang menggunakan objek print
            print.volume();
            //input pilihan user
            System.out.print("Pilihan = ");
            String p2 = input.nextLine();
            System.out.println("");
            //percabangan untuk menentukan pilihan user
            //jika user memilih nomor 1, maka akan menghitung luas permukaan balok
            if (p2.equalsIgnoreCase("1")){
                //pemanggilan method overriding luas pada class Balok menggunakan objek bangun2
                bangun2.luas();
                //pemanggilan method overloading HitungBalok pada class Balok menggunakan objek bangun2
                bangun2.HitungBalok(2, 5, 10, 15); //pengisian nilai rumus, panjang, lebar, dan tinggi pada method HitungBalok
            }
            //jika user memilih nomor 2, maka akan menghitung volume balok
            else if (p2.equalsIgnoreCase("2")){
                //pemanggilan method overriding volume pada class Balok menggunakan objek bangun2
                bangun2.volume();
                //pemanggilan method overloading HitungBalok pada class Balook menggunakan objek bangun2
                bangun2.HitungBalok(5, 10, 15); //pengisian nilai panjang, lebar, dan tinggi pada method HitungBalok
            } 
        }     
    }   
}
