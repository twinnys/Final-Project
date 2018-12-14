/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmobil;
import java.util.Scanner;
/**
 *
 * @author NurcahyaNaniaA
 */
public class RentalMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);//menambahkan scanner sehingga bisa menginputkan data
        
        //menambahkan data pada Mini_Bus
        Mini_Bus mobil = null;
        Mini_Bus mb1 = new Mini_Bus("N 1234 AB","Avanza",2014,2000000,4);
        Mini_Bus mb2 = new Mini_Bus("N 2323 RE","Xenia",2012,1500000,3);
        Mini_Bus mb3 = new Mini_Bus("N 7877 DD","Alphard",2016,3500000,3);
        Mini_Bus mb4 = new Mini_Bus("N 4567 EE","Gran Max",2014,3000000,2);
        
        //menambahkan data pada Truk
        Truk truk = null;
        Truk tr1 = new Truk("N 5555 RE","Hino",2014,2000000,4);
        Truk tr2 = new Truk("N 2344 YT","Isuzu",2012,1500000,2);
        Truk tr3 = new Truk("N 3433 CX","Volvo",2014,3500000,3);
        Truk tr4 = new Truk("N 6556 FF","Mitsubishi FUSO",2013,3000000,3);
        
        //menambahkan data pada Sedan
        Sedan sedan = null;
        Sedan sd1 = new Sedan("N 7866 OO","Toyota Vios",2015,3000000,4);
        Sedan sd2 = new Sedan("N 3344 FE","Toyota Camry",2015,3500000,2);
        Sedan sd3 = new Sedan("N 5666 SS","Toyota New Corolla Altis",2014,2500000,2);
        Sedan sd4 = new Sedan("N 3442 TT","Honda Civic",2015,4000000,2);
        
        
        //menambahkan data pada Pickup
        Pickup pickup = null;
        Pickup pk1 = new Pickup("N 3456 UI","Gran Max",2014,3500000,2);
        Pickup pk2 = new Pickup("N 8778 JU","Mitsubishi L300",2013,3000000,4);
        Pickup pk3 = new Pickup("N 2213 CS","Carry Futura",2014,3000000,2);
        Pickup pk4 = new Pickup("N 2881 HJ","Mitsubishi Colt",2014,3000000,4);
        
        //menambahkan data pada Jeep
        Jeep jeep = null;
        Jeep jp1 = new Jeep("N 7766 JE","CJ7",2014,3500000,2);
        Jeep jp2 = new Jeep("N 6778 UU","Wrangler",2015,4500000,3);
        Jeep jp3 = new Jeep("N 3093 JK","Hummer",2015,4000000,4);
        Jeep jp4 = new Jeep("N 7048 GH","Grand Wagoneer",2014,3000000,4);
        
        
        
        Mini_Bus mini[] = {mb1,mb2,mb3,mb4};
        Truk t[] = {tr1,tr2,tr3,tr4};
        Sedan s[] = {sd1,sd2,sd3,sd4};
        Pickup pi[] = {pk1,pk2,pk3,pk4};
        Jeep j[] = {jp1,jp2,jp3,jp4};
        
        String nama, alamat, no_telp, tgl_sewa, kembali;
        int Pilihan1, lama_sewa, bayar;

        //mengecek kondisi dengan perulangan do-while dan else-if
        do{
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("*** SELAMAT DATANG DI Rental Mobil ***");
        System.out.println("*****************************");
        System.out.println(" ");
        System.out.println("MENU OPTION");
        System.out.println("1. Lihat Daftar Mobil");
        System.out.println("2. Sewa Mobil");
        System.out.println("3. Kembalikan Mobil(Coming Soon)");
        System.out.print("Pilihan : ");
        Pilihan1 = in.nextInt();
        
        if(Pilihan1 == 1){
                System.out.println(" ");
                System.out.println("*****************************");
                System.out.println(" ");
                System.out.println("MENU Jenis Mobil");
                System.out.println("1. Minibus");
                System.out.println("2. Truk");
                System.out.println("3. Sedan");
                System.out.println("4. Pickup");
                System.out.println("5. Jeep");
                System.out.print("Pilihan : ");
                Pilihan1 = in.nextInt();

                if(Pilihan1 == 1) {
                        System.out.println(" ");
                        System.out.println("*****************************");
                        System.out.println(" ");
                        System.out.println("Daftar Mobil Minibus");
                        for(int i = 0; i < mini.length; i++)
                        {
                            System.out.println(i+1 + ". " + mini[i].getMerk() + " (kuota : " + mini[i].getKuota() + ")");
                        }
                }
                else if(Pilihan1 == 2) {
                        System.out.println(" ");
                        System.out.println("*****************************");
                        System.out.println(" ");
                        System.out.println("Daftar Mobil Truk");
                        for(int i = 0; i < t.length; i++)
                        {
                            System.out.println(i+1 + ". " + t[i].getMerk() + " (kuota : " + t[i].getKuota() + ")");
                        }
                }
                else if(Pilihan1 == 3) {
                        System.out.println(" ");
                        System.out.println("*****************************");
                        System.out.println(" ");
                        System.out.println("Daftar Mobil Sedan");
                        for(int i = 0; i < s.length; i++)
                        {
                            System.out.println(i+1 + ". " + s[i].getMerk() + " (kuota : " + s[i].getKuota() + ")");
                        }
                }
                else if(Pilihan1 == 4) {
                        System.out.println(" ");
                        System.out.println("*****************************");
                        System.out.println(" ");
                        System.out.println("Daftar Mobil Pickup");
                        for(int i = 0; i < pi.length; i++)
                        {
                            System.out.println(i+1 + ". " + pi[i].getMerk() + " (kuota : " + pi[i].getKuota() + ")");
                        }
                }
                else if(Pilihan1 == 5) {
                        System.out.println(" ");
                        System.out.println("*****************************");
                        System.out.println(" ");
                        System.out.println("Daftar Mobil Jeep");
                        for(int i = 0; i < j.length; i++)
                        {
                            System.out.println(i+1 + ". " + j[i].getMerk() + " (kuota : " + j[i].getKuota() + ")");
                        }
                }
                else {
                        System.out.println("SALAH INPUT!!");
                }
        }
        else if(Pilihan1 == 2) {
                System.out.println(" ");
                System.out.println("*****************************");
                System.out.println(" ");
                System.out.println("MENU Jenis Mobil");
                System.out.println("1. Minibus");
                System.out.println("2. Truk");
                System.out.println("3. Sedan");
                System.out.println("4. Pickup");
                System.out.println("5. Jeep");
                System.out.print("Pilihan : ");
                Pilihan1 = in.nextInt();

                if(Pilihan1 == 1) {
                        System.out.println(" ");
                        System.out.println("*****************************");
                        System.out.println(" ");
                        System.out.println("Daftar Mobil Minibus");
                        for(int i = 0; i < mini.length; i++)
                        {
                            System.out.println(i+1 + ". " + mini[i].getMerk());
                        }
                        System.out.print("Pilihan : ");
                        Pilihan1 = in.nextInt();
                        
                        System.out.println(" ");
                        System.out.println("*****************************");
                        System.out.println("Masukkan Data Penyewa");
                        in.nextLine();
                        System.out.print("Nama Penyewa : ");
                        nama = in.nextLine();
                        System.out.print("Alamat Penyewa : ");
                        alamat = in.nextLine();
                        System.out.print("Nomor Telepon : ");
                        no_telp = in.nextLine();
                        System.out.print("Tanggal Sewa : ");
                        tgl_sewa = in.nextLine();
                        System.out.print("Lama Sewa(Satuan Hari) : ");
                        lama_sewa = in.nextInt();
                        System.out.println("*****************************");
                        System.out.println("Harga : " + lama_sewa * mini[Pilihan1-1].getHarga());
                        mobil = mini[Pilihan1-1];
                        System.out.print("Bayar : ");
                        bayar = in.nextInt();
                        
                        mobil.setKuota(mobil.getKuota()-1);
                        Penyewa p_mini = new Penyewa(nama, alamat, no_telp, tgl_sewa, lama_sewa, bayar);
                        mb4.Sewa_Minibus(p_mini,mobil);
                }
                else if(Pilihan1 == 2) {
                        System.out.println(" ");
                        System.out.println("*****************************");
                        System.out.println(" ");
                        System.out.println("Daftar Mobil Truk");
                        for(int i = 0; i < t.length; i++)
                        {
                            System.out.println(i+1 + ". " + t[i].getMerk());
                        }
                        System.out.print("Pilihan : ");
                        Pilihan1 = in.nextInt();
                        
                        System.out.println(" ");
                        System.out.println("*****************************");
                        System.out.println("Masukkan Data Penyewa");
                        in.nextLine();
                        System.out.print("Nama Penyewa : ");
                        nama = in.nextLine();
                        System.out.print("Alamat Penyewa : ");
                        alamat = in.nextLine();
                        System.out.print("Nomor Telepon : ");
                        no_telp = in.nextLine();
                        System.out.print("Tanggal Sewa : ");
                        tgl_sewa = in.nextLine();
                        System.out.print("Lama Sewa(Satuan Hari) : ");
                        lama_sewa = in.nextInt();
                        System.out.println("*****************************");
                        System.out.println("Harga : " + lama_sewa * t[Pilihan1-1].getHarga());
                        truk = t[Pilihan1-1];
                        System.out.print("Bayar : ");
                        bayar = in.nextInt();
                        
                        truk.setKuota(truk.getKuota()-1);
                        Penyewa p_truk = new Penyewa(nama, alamat, no_telp, tgl_sewa, lama_sewa, bayar);
                        tr4.Sewa_Truk(p_truk,truk);
                }
                else if(Pilihan1 == 3) {
                        System.out.println(" ");
                        System.out.println("*****************************");
                        System.out.println(" ");
                        System.out.println("Daftar Mobil Sedan");
                        for(int i = 0; i < s.length; i++)
                        {
                            System.out.println(i+1 + ". " + s[i].getMerk());
                        }
                        System.out.print("Pilihan : ");
                        Pilihan1 = in.nextInt();
                        
                        System.out.println(" ");
                        System.out.println("*****************************");
                        System.out.println("Masukkan Data Penyewa");
                        in.nextLine();
                        System.out.print("Nama Penyewa : ");
                        nama = in.nextLine();
                        System.out.print("Alamat Penyewa : ");
                        alamat = in.nextLine();
                        System.out.print("Nomor Telepon : ");
                        no_telp = in.nextLine();
                        System.out.print("Tanggal Sewa : ");
                        tgl_sewa = in.nextLine();
                        System.out.print("Lama Sewa(Satuan Hari) : ");
                        lama_sewa = in.nextInt();
                        System.out.println("*****************************");
                        System.out.println("Harga : " + lama_sewa * s[Pilihan1-1].getHarga());
                        sedan = s[Pilihan1-1];
                        System.out.print("Bayar : ");
                        bayar = in.nextInt();
                        
                        sedan.setKuota(sedan.getKuota()-1);
                        Penyewa p_sedan = new Penyewa(nama, alamat, no_telp, tgl_sewa, lama_sewa, bayar);
                        sd4.Sewa_Sedan(p_sedan,sedan);
                }
                else if(Pilihan1 == 4) {
                        System.out.println(" ");
                        System.out.println("*****************************");
                        System.out.println(" ");
                        System.out.println("Daftar Mobil Pickup");
                        for(int i = 0; i < pi.length; i++)
                        {
                            System.out.println(i+1 + ". " + pi[i].getMerk());
                        }
                        System.out.print("Pilihan : ");
                        Pilihan1 = in.nextInt();
                        
                        System.out.println(" ");
                        System.out.println("*****************************");
                        System.out.println("Masukkan Data Penyewa");
                        in.nextLine();
                        System.out.print("Nama Penyewa : ");
                        nama = in.nextLine();
                        System.out.print("Alamat Penyewa : ");
                        alamat = in.nextLine();
                        System.out.print("Nomor Telepon : ");
                        no_telp = in.nextLine();
                        System.out.print("Tanggal Sewa : ");
                        tgl_sewa = in.nextLine();
                        System.out.print("Lama Sewa(Satuan Hari) : ");
                        lama_sewa = in.nextInt();
                        System.out.println("*****************************");
                        System.out.println("Harga : " + lama_sewa * pi[Pilihan1-1].getHarga());
                        pickup = pi[Pilihan1-1];
                        System.out.print("Bayar : ");
                        bayar = in.nextInt();
                        
                        pickup.setKuota(pickup.getKuota()-1);
                        Penyewa p_pickup = new Penyewa(nama, alamat, no_telp, tgl_sewa, lama_sewa, bayar);
                        pk4.Sewa_Pickup(p_pickup,pickup);
                }
                else if(Pilihan1 == 5) {
                        System.out.println(" ");
                        System.out.println("*****************************");
                        System.out.println(" ");
                        System.out.println("Daftar Mobil Jeep");
                        for(int i = 0; i < j.length; i++)
                        {
                            System.out.println(i+1 + ". " + j[i].getMerk());
                        }
                        System.out.print("Pilihan : ");
                        Pilihan1 = in.nextInt();
                        
                        System.out.println(" ");
                        System.out.println("*****************************");
                        System.out.println("Masukkan Data Penyewa");
                        in.nextLine();
                        System.out.print("Nama Penyewa : ");
                        nama = in.nextLine();
                        System.out.print("Alamat Penyewa : ");
                        alamat = in.nextLine();
                        System.out.print("Nomor Telepon : ");
                        no_telp = in.nextLine();
                        System.out.print("Tanggal Sewa : ");
                        tgl_sewa = in.nextLine();
                        System.out.print("Lama Sewa(Satuan Hari) : ");
                        lama_sewa = in.nextInt();
                        System.out.println("*****************************");
                        System.out.println("Harga : " + lama_sewa * j[Pilihan1-1].getHarga());
                        jeep = j[Pilihan1-1];
                        System.out.print("Bayar : ");
                        bayar = in.nextInt();
                        
                        jeep.setKuota(jeep.getKuota()-1);
                        Penyewa p_jeep = new Penyewa(nama, alamat, no_telp, tgl_sewa, lama_sewa, bayar);
                        jp4.Sewa_Jeep(p_jeep,jeep);
                }
                else {
                        System.out.println("SALAH INPUT!!");
                }
        }
        else if(Pilihan1 == 3) {
            
        }
        else {
                System.out.println("SALAH INPUT!!");
        }
        in.nextLine();
        System.out.print("Kembali ke Menu Utama [y/n] ? ");
        kembali = in.nextLine();
        }while("y".equals(kembali));
    }
}
