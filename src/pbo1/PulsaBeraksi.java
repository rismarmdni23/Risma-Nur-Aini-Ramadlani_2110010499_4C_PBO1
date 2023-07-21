package pbo1;

import java.util.Scanner;

public class PulsaBeraksi {
    public static void main(String[] args) {

//Error handling
try{
    //io sederhana
    Scanner scanner = new Scanner (System.in);
    //array
        PulsaDetail[] pls = new PulsaDetail[2];
//        Perulangan
        for(int i=0; i<pls.length; i++) {
                System.out.print("Masukkan Nomor : ");
                String nomor = scanner.nextLine();
                System.out.print("Masukkan Nominal Pulsa: ");
                String beli = scanner.nextLine();
                System.out.println("==============================");

        //        objek
                pls[i] = new PulsaDetail (nomor, beli);
    }

        for(PulsaDetail data: pls) {
            System.out.println("******************************");
            System.out.println("             NOTA ");
            System.out.println("         KONTER IMAMA   ");
            System.out.println("******************************");
            System.out.println(data.displayInfo());
        }
    } catch (NumberFormatException e){
        System.out.println("Kesalahan Umum: "+e.getMessage());
    }
  }
}