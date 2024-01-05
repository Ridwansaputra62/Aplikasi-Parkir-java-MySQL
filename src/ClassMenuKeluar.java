/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RidwanSaputra
 */
public class ClassMenuKeluar extends SuperClass {
    
    private static String tb;
    private static int lp;

    
    public void setLp(int lp) {
        this.lp = lp;
    }
    
    public void setTb(String lp) {
        this.tb = lp;
    }
    private static int jammasuk,jamkeluar,uangmasuk;
    private static int a=0;
    
    public static void seta(int um){
        a+=um;
    }
    
    public int geta(){
        return this.a;
    }
    
    public void setUangMasuk(int um){
        this.uangmasuk = um;
    }
    
    public int getUangMasuk(){
        return this.uangmasuk;
    }
    
    public void setJamMasuk(int jm){
        this.jammasuk = jm;
    }
    
    public int getJamMasuk(){
        return this.jammasuk;
    }
    
     public void setJamKeluar1(int jk){
        this.jamkeluar = jk;
    }
     
    public int getJamKeluar1(){
        return this.jamkeluar;
    }
    

    
    
    
     public int getLamaParkir(){
        int lamaparkir = this.getJamKeluar1()-this.getJamMasuk();
        if (lamaparkir>10){
            lamaparkir =lamaparkir-2;}
        if (lamaparkir==0){
            lamaparkir = 1;
        }
        return lamaparkir;         
    };
    public int getTotalBayar(){
        int totalbayar = this.getLamaParkir()*this.getHargaKendaraan();
        return totalbayar;
    };
    public int getKembalian(){
        int kembalian = this.getUangMasuk()-this.getTotalbayarSemua();
        return kembalian;
    };
    public int getTotalBayarEdit(){
        int totalbayar1 = this.getEditLama()*this.getHargaKendaraan();
        return totalbayar1;
    };
 
   public String getStruk(){
       
       setHargaKendaraan();
       int potongan;
       if(lp>10){
           potongan = getHargaKendaraan()*2;
       }else{
           potongan = 0;
       }
        String strukkeluar = "\n==== STRUK PARKIR MOTOR ====\n\n"+
                                "Nama Petugas : "+getUsername()+"\n"+
                                "Tanggal : "+getTanggal()+"\n"+
                                "=========================\n\n"+
                                "Kode Transaksi : "+getKodeTransaksi()+"\n"+
                                "Jenis Kendaraan : "+getJenisKendaraan()+"\n"+
                                "No Polisi       : "+getNoPolisi()+"\n"+
                                "Lama Parkir       : "+Integer.toString(lp)+"\n"+
                                "Harga Per Jam   : "+getHargaKendaraan()+"\n"+
                                "Potongan       : "+potongan+"\n"+
                                "Total Bayar   : "+tb+"\n\n"+
                                "=========================\n\n"+
                                "                *HATI-HATI DIJALAN*\n\n"+
                                "======== TERIMAKASIH =======";
            return strukkeluar;
    }
}
