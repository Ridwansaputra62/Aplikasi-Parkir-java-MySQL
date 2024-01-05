
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RidwanSaputra
 */
public class database {
    public Statement stm=null;
    public Connection con=null;

    String url ="jdbc:mysql://localhost:3306/projectuas";
    String user = "root";
    String pass = "";
    
    public String sql1="";
    ResultSet Rs =null;
    
    String kodetransaksi,nopolisi,no_pol,jenis,jam_in,jam_out,biaya,lama;
    String jeniskendaraan,jammasuk;
    /**
     *
     */
    public void datamenumasuk(){
    
    {
try
{
con = DriverManager.getConnection(url,user,pass);
stm = con.createStatement();
Statement statement = (Statement) con.createStatement();
String sql=("insert into laporan values('"+kodetransaksi+"','"+no_pol+"','"+jenis+"','"+jam_in+"','"+biaya+"')");
int executeUpdate = statement.executeUpdate(sql);
statement.close();
con.close();
}
catch (SQLException e)
{
JOptionPane.showMessageDialog(null, "Eror: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
}}}

    public void datamenukeluar(){
         {
try
{
con = DriverManager.getConnection(url,user,pass);
stm = con.createStatement();
Statement statement = (Statement) con.createStatement();
String sql=("insert into riwayat values('"+kodetransaksi+"','"+no_pol+"','"+jenis+"','"+jam_in+"','"+jam_out+"','"+lama+"','"+biaya+"')");
int executeUpdate = statement.executeUpdate(sql);
statement.close();
try{
    sql1="DELETE FROM laporan WHERE Kode_Transaksi='"+ kodetransaksi +"'";
    stm=con.createStatement();
    stm.execute(sql1);
}catch (Exception e){

}
con.close();
}
catch (SQLException e)
{
JOptionPane.showMessageDialog(null, "Eror: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
}}
        
    }

public void carikeluar(){
try
{
con = DriverManager.getConnection(url,user,pass);
stm = con.createStatement();
Statement statement = (Statement) con.createStatement();
String sql="SELECT * FROM laporan WHERE Kode_Transaksi like '"+kodetransaksi+"'";
 java.sql.ResultSet rs = statement.executeQuery(sql);
if (rs.next())
{
no_pol=rs.getString(2);
jeniskendaraan=rs.getString(3);
jammasuk=rs.getString(4);
JOptionPane.showMessageDialog(null, "Data ditemukan","Insert Data",JOptionPane.INFORMATION_MESSAGE);

}
else
{
JOptionPane.showMessageDialog(null, "Data tidak ditemukan ","Insert Data",JOptionPane.INFORMATION_MESSAGE);
no_pol="";
jeniskendaraan="";
jammasuk="";
}
statement.close();
con.close();
}
catch ( SQLException e)
{
JOptionPane.showMessageDialog(null, "Eror:"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
} 
}}
    

