/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RidwanSaputra
 */
public class ClassMenuLogin extends SuperClass {
    
    private String useradmin,userpetugas,passwordadmin,passwordpetugas; 
    
    
    
    
  
    
    public String getUserAdmin(){
    return this.useradmin;
    }
    
    public String getPasswordAdmin(){
    return this.passwordadmin;
    }
    
    public String getUserPetugas(){
    return this.userpetugas;
    }
    
    public String getPasswordPetugas(){
    return this.passwordpetugas;
    }
    
    
    
    public void login(){
        this.useradmin = "admin";
        this.passwordadmin = "12345";
        this.userpetugas = "kelompok4";
        this.passwordpetugas = "54321";
    }
    
}
