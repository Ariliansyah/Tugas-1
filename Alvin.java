
package alvin;

import java.util.Scanner;

public class Alvin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("INI ADALAH TUGAS NOMOR1");
       int jam,menit,detik,totdek;
       System.out.println("Masuk jam=");
       jam=input.nextInt();
       
       System.out.println("masukan Menit=");
       menit=input.nextInt();
       
       System.out.println("Masukan Detik");
       detik=input.nextInt();
       
       totdek=jam*3600+menit*60+detik;
       System.out.println("Total Detik="+totdek);
    }
    
}
