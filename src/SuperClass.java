/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RidwanSaputra
 */
import java.text.SimpleDateFormat;
import java.util.Locale;

public class SuperClass {
    
    java.util.Date tglsekarang = new java.util.Date();
    private SimpleDateFormat smpdtfmt = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
    private String tanggal = smpdtfmt.format(tglsekarang);
    
    
    private String tanggalsekarang = tanggal;
    private String kodetgl = tanggalsekarang.substring(0, 2);
    private String kodebln = tanggalsekarang.substring(3, 5);
    private String tglbln = kodetgl+kodebln;
    private static int kode = 0;
    
    
    private static String username,nopolisi,jam,jeniskendaraan,kodetransaksi ;
    
    private int hargakendaraan,hmotor,hmobil,hbus;
    private int masuk=35,lama;
    private int totalbayaredit,editlama;
    private static int totallamamotor=0,totallamamobil=0,totallamabus=0,
            totalmotor=0,totalmobil=0,totalbus=0,
            totalbmotor=0,totalbmobil=0,totalbbus=0;
            
        
            
    public void setKodeTransaksi(String kode){
       this.kodetransaksi=kode;
   }
   
   public String getKodeTransaksi(){
       return this.kodetransaksi;
   }
    
    public void setLama(int lm){
        lama = lm;
    }
    
    public int getLama(){
        return this.lama;
    }
    
    public void totallama(){
        this.lama += this.masuk;
    }
    
    
    public String getTanggal(){
        return this.tanggalsekarang;
    }
    
    public void setJam(String jm){
        this.jam=jm;
    }
    
    public String getJam(){
        return this.jam;
    }
    
    public static void setUsername(String un){
    username = un;
    }
    
    
    public String getUsername(){
    return this.username;
    }
    
    public void setNoPolisi(String nopol){
        this.nopolisi=nopol;
    }
    
    public String getNoPolisi(){
        return this.nopolisi;
    }
    
    public static void setJenisKendaraan(String jk){
        jeniskendaraan = jk;
    }
    
    public static String getJenisKendaraan(){
        return jeniskendaraan;
    }
    
    public void setHargaMotor(int hm){
        this.hmotor=hm;
    }
    
    public void setHargaMobil(int hamo){
        this.hmobil=hamo;
    }
    
    public void setHargaBus(int hb){
        this.hbus=hb;
    }
    

    public  void setHargaKendaraan(){
       
       this.setHargaMotor(2000);
       this.setHargaMobil(5000);
       this.setHargaBus(12000);
       
       if(this.getJenisKendaraan().equalsIgnoreCase("Motor")){
           this.hargakendaraan = this.hmotor;
       }else if(getJenisKendaraan().equalsIgnoreCase("Mobil")){
          this.hargakendaraan = this.hmobil;
       }else if(getJenisKendaraan().equalsIgnoreCase("Bus")){
           this.hargakendaraan = this.hbus;
       }else{
           this.setJenisKendaraan("PILIH JENIS KENDARAAN");
           this.hargakendaraan = 0;
       }}
    
    public int getHargaKendaraan(){
        return this.hargakendaraan;
    }
    
    public void setTotalBayarSemua(int tba){
        
        totalbayaredit = tba;
    }
    
    public int getTotalbayarSemua(){
        return this.totalbayaredit;
    }
    
    public int getEditLama(){
        return this.editlama;
    }
    
    public void setEditLama(int el){
        editlama = el;
        if (editlama>10){
            editlama = editlama-2;}
    }
    
    
    public int getKode(){
        kode++;
        return kode;
    }
    
    public String getTanggalBulan(){
        return this.tglbln;
    }
    
    
    public void getAddLaporan(){
        if(getJenisKendaraan().equalsIgnoreCase("Motor")){
            totalmotor+=1;
            totalbmotor+=totalbayaredit;
            totallamamotor+=editlama;
        }else if(getJenisKendaraan().equalsIgnoreCase("Mobil")){
            totalmobil+=1;
            totalbmobil+=totalbayaredit;
            totallamamobil+=editlama;
        }else if(getJenisKendaraan().equalsIgnoreCase("Bus")){
            totalbus+=1;
            totalbbus+=totalbayaredit;
            totallamabus+=editlama;
        }
    }
    
    
    public int getTotalMotor(){
        return totalmotor;
    }
    public int getTotalBayarMotor(){
        return totalbmotor;
    }
    public int getTotalLamaMotor(){
        return totallamamotor;
    }
    public int getTotalMobil(){
        return totalmobil;
    }
    public int getTotalBayarMobil(){
        return totalbmobil;
    }
    public int getTotalLamaMobil(){
        return totallamamobil;
    }
    public int getTotalBus(){
        return totalbus;
    }
    public int getTotalBayarBus(){
        return totalbbus;
    }
    public int getTotalLamaBus(){
        return totallamabus;
    }

    
}
