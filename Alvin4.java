/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alvin4;

import java.util.Scanner;

public class Alvin4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("INI ADALAH TUGAS NOMOR 4");
    Scanner keyboard=new Scanner(System.in);
    
    String nama,alamat;
    int umur;
    
    System.out.println("Nama:");
    nama=keyboard.next();
    
    System.out.println("Alamat:");
    alamat=keyboard.next();
    
    System.out.println("umur:");
    umur=keyboard.nextInt();
    
    System.out.println("Saudara:"+nama);
    System.out.println("Alamat:"+alamat);
    System.out.println("Berumur:"+umur+"Tahun");
    
    }
    
}
