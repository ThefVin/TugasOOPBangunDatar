
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
public class PersegiPanjang {
    Scanner input = new Scanner(System.in);
    
    int p;
    int l;
    
    public PersegiPanjang (){
        this.p=p;
        this.l=l;
    }
    
    public void inputan(){
       System.out.println("Masukan panjang  :");
       p = input.nextInt();
        System.out.println("Masukan lebar  :");
       l = input.nextInt();
    }
    
    public void luas(){
        int luas =p*l;
        System.out.println("Luas persegi panjang :"+luas);
    }
    
    public void keliling(){
        int keliling =2*(p+l);
        System.out.println("Luas persegi panjang :"+keliling);
    }
    
}
