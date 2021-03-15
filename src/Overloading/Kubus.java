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
 class Kubus extends BangunRuang{
        
        //method overriding luas
        @Override
        float luas(){
        System.out.println("\nMENGHITUNG LUAS PERMUKAAN BANGUN RUANG KUBUS");
        return 0;
        }
        //method overloading HitungKubus untuk menghitung luas permukaan
        void HitungKubus(float sisi){
           
           System.out.println("Sebuah kubus memiliki sisi "+sisi+"cm");
           //menghitung luas permukaan kubus
           float luas = 6 * sisi * sisi;
           System.out.println("Luas Permukaan Kubus = "+luas);    
        }
        //method overriding luas
        @Override
        float volume(){
        System.out.println("\nMENGHITUNG VOLUME BANGUN RUANG KUBUS");
        return 0;
        }
        //method overloading HitungKubus untuk menghitung volume 
        void HitungKubus(float sisi1, float sisi2, float sisi3){
           
           System.out.println("Sebuah kubus memiliki sisi "+sisi1+"cm");
           //menghitung volume kubus
           float volume = sisi1 * sisi2 * sisi3;
           System.out.println("Volume Kubus = "+volume);
           
       }
    
}
