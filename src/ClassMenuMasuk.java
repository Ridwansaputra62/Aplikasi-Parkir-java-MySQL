/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RidwanSaputra
 */
public class ClassMenuMasuk extends SuperClass {
    
   private String struk;
  
   
   public void setStruk(){
       this.struk = "\n\n==== BUKTI PARKIR MOTOR ====\n\n"+
            "Nama Petugas : "+getUsername()+"\n"+
            "Tanggal : "+getTanggal()+"\n"+
            "============================\n\n"+
            "Kode Transaksi : "+getKodeTransaksi()+"\n"+
            "Jenis Kendaraan : "+getJenisKendaraan()+"\n"+
            "No Polisi       : "+getNoPolisi()+"\n"+
            "Jam Masuk       : "+getJam()+"\n"+
            "Harga Per Jam   : "+getHargaKendaraan()+"\n\n"+
            "============================\n\n"+
            "*HARAP SIMPAN TANDA BUKTI PARKIR INI*\n\n"+
            "======== TERIMAKASIH ========\n\n";
   }
   
   public String getStruk(){
       return this.struk;
   }
    
}
