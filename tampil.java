
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author revin
 */
public class tampil {
     Scanner input = new Scanner(System.in);
     
    JajarGenjang jajargenjang1 = new JajarGenjang();
    PersegiPanjang persegipanjang1 = new PersegiPanjang();
    lingkaran lingkaran1 = new lingkaran();
    persegi persegi1 = new persegi();
    segitiga segitiga1 = new segitiga();
    
    int pilihan,pi,pilihan1;
    
    public tampil(){
        this.jajargenjang1 = jajargenjang1;
        this.persegipanjang1 = persegipanjang1;
        this.lingkaran1 = lingkaran1;
        this.persegi1 = persegi1;
        this.pilihan = pilihan;
        this.pilihan1 = pilihan1;
        this.segitiga1 = segitiga1;
        
    }
    public void tampilbangunan(){
        System.out.println("masukkan pilihan bangun \n1.jajar genjang \n2.persegi panjang \n3.lingkaran \n4.persegi \n5.segitiga");
        pilihan = input.nextInt();
        System.out.println("pilih [1]luas / [2]keliling ");
        pilihan1 = input.nextInt();
        
        switch(pilihan){
            case 1 : 
                    jajargenjang1.inputan();

                    if(pilihan1==1){
                        jajargenjang1.luas();
                    }
                    else if(pilihan1==2){
                        jajargenjang1.keliling();
                    }
                    else{
                        System.out.println("pilihan tidak tersedia");
                    }
                    break;
            
            case 2 : 
                    if(pilihan1==1){
                        persegipanjang1.luas();
                        persegipanjang1.luas();
                    }
                    else if(pilihan1==2){
                        persegipanjang1.keliling();
                        persegipanjang1.keliling();
                    }
                    else{
                        System.out.println("pilihan tidak tersedia");
                    }
                    break;

            case 3 : 
                    lingkaran1.inputan();
                    if(pilihan1==1){
                        lingkaran1.luaslingkaran();
                    }
                    else if(pilihan1==2){
                        lingkaran1.kelilinglingkaran();
                    }
                    else{
                        System.out.println("pilihan tidak tersedia");
                    }
                    break;

            case 4 : 
                    persegi1.inputan();
                    if(pilihan1==1){
                        persegi1.luas();
                    }
                    else if (pilihan1==2){
                        persegi1.keliling();
                    }
                    else{
                        System.out.println("pilihan tidak tersedia");
                    }
                    break;

            case 5 : 
                    segitiga1.inputan();
                    if(pilihan1==1){
                        segitiga1.luas();
                    }
                    else if (pilihan1==2){
                        segitiga1.keliling();
                    }
                    else{
                        System.out.println("pilihan tidak tersedia");
                    }
                    break;
    }
    
    
}
}

    
     
     

