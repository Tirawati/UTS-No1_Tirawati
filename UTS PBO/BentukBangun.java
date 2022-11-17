/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tirawati
 */import java.util.Scanner;
public class BentukBangun implements Rumus{

    @Override
    public void LuasLingkaran() {
        
       Scanner input = new Scanner(System.in);
      
    System.out.println("##  Program Java Menghitung Luas Lingkaran  ##");
    System.out.println("==============================================");
    System.out.println();
     
    double r, luas;
 
    System.out.print("Input jari-jari lingkaran: ");
    r = input.nextDouble();
  
    luas = 3.14 * r * r;
      
    System.out.println("Luas lingkaran: "+luas);

  }
}