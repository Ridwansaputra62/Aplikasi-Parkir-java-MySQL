/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RidwanSaputra
 */
public class ClassLaporan extends SuperClass{
    

    public  int getTotalLamaSemua(){
        int total=(getTotalLamaMotor()+getTotalLamaMobil()+getTotalLamaBus());
        return total;
    }
    
    public int getTotalBayarAll(){
        int totalAll=(getTotalBayarMotor()+getTotalBayarMobil()+getTotalBayarBus());
        return totalAll;
    }
    
    public int getTotalJenisKendaraan(){
        int tjk = getTotalMotor()+getTotalMobil()+getTotalBus();
        return tjk;
    }
    
}
