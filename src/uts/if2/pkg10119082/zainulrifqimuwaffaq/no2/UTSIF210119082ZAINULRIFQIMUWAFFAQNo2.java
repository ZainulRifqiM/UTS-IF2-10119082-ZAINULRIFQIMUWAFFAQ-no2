/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119082.zainulrifqimuwaffaq.no2;
import java.util.Scanner;
/**
 *
 * @author Zainul Rifqi
 * NAMA     : Zainul Rifqi Muwaffaq
 * KELAS    : IF2
 * NIM      : 10119082
 * Deskripsi: UTS no2
 */
public class UTSIF210119082ZAINULRIFQIMUWAFFAQNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int saldoAwal,jumlahTarik;
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("masukkan Saldo Awal : ");
        saldoAwal=s.nextInt();
        Tabungan t = new Tabungan(saldoAwal);
        System.out.print("Jumlah uang yang diammbil : ");
        jumlahTarik=s.nextInt();
        System.out.println("Saldo Anda Sekarang : " + t.ambilUang(jumlahTarik));
    }
    
}
