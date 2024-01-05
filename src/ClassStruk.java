/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RidwanSaputra
 */
public class ClassStruk extends SuperClass {
    private String kode,jenis,nopol,jamin,jamout,lama,total,diskon;

    

    public String getJamout() {
        return jamout;
    }

    public void setJamout(String jamout) {
        this.jamout = jamout;
    }

    public String getLamaPar() {
        return lama;
    }

    public void setLamaPar(String lama) {
        this.lama = lama;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getDiskon() {
        return diskon;
    }

    public void setDiskon(String diskon) {
        this.diskon = diskon;
    }
     public String getStruk(){
        String strukkeluar = "\n\n==== Struk PARKIR MOTOR ====\n\n"+
            "Nama Petugas : "+getUsername()+"\n"+
            "Tanggal : "+getTanggal()+"\n"+
            "============================\n\n"+
            "Kode Transaksi : "+getKodeTransaksi()+"\n"+
            "Jenis Kendaraan : "+getJenisKendaraan()+"\n"+
            "No Polisi       : "+getNoPolisi()+"\n"+
            "Jam Masuk       : "+getJam()+"\n"+
            "Jam Keluar       : "+getJam()+"\n"+
            "Lama Parkir       : "+getEditLama()+"\n"+
            "Harga Per Jam   : "+getHargaKendaraan()+"\n\n"+
            "Potongan       : "+getJam()+"\n"+
            "Total Bayar   : "+getHargaKendaraan()+"\n\n"+
            "============================\n\n"+
            "*HARAP SIMPAN TANDA BUKTI PARKIR INI*\n\n"+
            "======== TERIMAKASIH ========\n\n";
            return strukkeluar;
    }
}
