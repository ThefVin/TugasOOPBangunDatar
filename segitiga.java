
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
public class segitiga {
    Scanner input = new Scanner(System.in);
    int alas;
    int tinggi;
    
    public segitiga (){
        this.alas=alas;
        this.tinggi=tinggi;
    }
    
    
    public void inputan(){
       System.out.println("Masukan alas  :");
       alas = input.nextInt();
       
       System.out.println("Masukan tinggi   :");
       tinggi = input.nextInt();
       
    }    
    
    public void luas(){
        double luas =0.5*alas*tinggi;
        System.out.println("Luas segitiga :"+luas);
    }
     public void keliling(){
        double keliling =12+5+2;
        System.out.println("Keliling segitiga :"+keliling);
    }
    
}
