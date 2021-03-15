/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author MOKLET1
 */
    class Balok extends BangunRuang{
    
        //method overriding luas
        @Override
        float luas(){           
              System.out.println("\nMENGHITUNG LUAS PERMUKAAN BANGUN RUANG");
              return 0;
        }
        //method overloading HitungBalok untuk menghtiung luas permukaan
        void HitungBalok(float rumus, float panjang, float lebar, float tinggi){
         
        System.out.println("\nSebuah balok memiliki panjang "+panjang+"cm, lebar "
                 +lebar+"cm, dan tinggi "+tinggi+"cm"); 
        //menghitung luas permukaan balok
        float luas = rumus * ((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
        System.out.println("Luas Permukaan Balok = "+luas);
        }
        //method overriding volume
        @Override
        float volume(){
        System.out.println("\nMENGHITUNG VOLUME BANGUN RUANG KUBUS");
        return 0;
        }
        //method overloading HitungBalok untuk menghitung volume balok
        void HitungBalok(float panjang, float lebar, float tinggi){
         
        System.out.println("\nSebuah balok memiliki panjang "+panjang+"cm, lebar "
                 +lebar+"cm, dan tinggi "+tinggi+"cm"); 
        //menghitung volume balok
        float volume = panjang * lebar * tinggi;
        System.out.println("Volume Balok = "+volume);        
        } 
    }
