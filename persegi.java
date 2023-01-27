
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
public class persegi {
    Scanner input = new Scanner(System.in);
    
    int s;
    
    public persegi (){
        this.s=s;
    }
    
    public void inputan(){
       System.out.println("Masukan alas  :");
       s = input.nextInt();
       
       
    }
    public void luas(){
        int luas =s*s;
        System.out.println("Luas persegi :"+luas);
    }
    
    public void keliling(){
        int keliling =4*s;
        System.out.println("Keliling persegi :"+keliling);
    }
    
}
