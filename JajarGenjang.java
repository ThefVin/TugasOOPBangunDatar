
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
public class JajarGenjang {
    Scanner input = new Scanner(System.in);
    
    int a;
    int t;
    
    public JajarGenjang(){
        this.a=a;
        this.t=t;
    }
    
    public void inputan(){
       System.out.println("Masukan alas  :");
       a = input.nextInt();
        System.out.println("Masukan tinggi  :");
       t = input.nextInt();
    }
    
    public void luas(){
        int luas =a*t;
        System.out.println("Luas jajar genjang :"+luas);
    }
    
    public void keliling(){
        int luas =2*(a+t);
        System.out.println("Luas persegi panjang :"+luas);
    }
    
}
