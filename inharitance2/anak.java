/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inharitance2;

/**
 *
 * @author Radityo
 */

        public class anak extends ayah{
    double nilaimax=99.9;
    String nama;
    int age = 17;
    
    public void setnama(String nama){
        this.nama=nama;
    }
    public void Cetak(){
        System.out.println("Anak ini memiliki sifat "+super.sifat);
        System.out.println("yang bernama "+nama);
        System.out.println("berumur "+age+" tahun");
        System.out.println("dengan tinggi Badan "+super.TB);
        
        System.out.println("Nama ayah : ");
        super.hobi();
    }
    
}


    /**
     * 
     */
    


