/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulator.jumlahHari;
/**
 *
 * @author Marsy
 */
public class MenghitungJumlahHari {

    /**
     * @param args the command line arguments
     */
    public static String Hitung(int Tahun, String Bulan) {
        // TODO code application logic here
        String[] bulan31 = {"Januari", "Maret","Mei","Juli","Agustus","Oktober","Desember"};
        int getTahun = Integer.valueOf(Tahun);
        String getHari = "";
        for (String i : bulan31) {
            if(Bulan == i){
                getHari = "31";
                break;
            }
        }
        if(getHari == ""){
            if(Bulan == "Februari"){
                if(getTahun % 4 == 0){
                    getHari = "29";
                }else{
                    getHari = "28";
                }
            }else{
                getHari = "30";
            }
        }
    return "Jumlah hari pada bulan "+Bulan+" tahun "+Tahun+" adalah "+getHari;
    }    
}
