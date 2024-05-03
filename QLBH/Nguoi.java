package QLBH;

import java.io.Serializable;
import java.util.Scanner;


public class Nguoi implements Serializable{
    protected String hoTen, gioiTinh, diaChi, SDT, ma;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String gioiTinh, String diaChi, String SDT, String ma) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.ma = ma;
    }   

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    
    
    public void Nhap(){
        System.out.println("Nhap ho ten: ");
        hoTen= new Scanner(System.in).nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh= new Scanner(System.in).nextLine();
        System.out.println("Nhap so dien thoai: ");
        SDT= new Scanner(System.in).nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi= new Scanner(System.in).nextLine();
        System.out.println("Nhap ma: ");
        ma= new Scanner(System.in).nextLine();
    }
    public void Hien(){
        System.out.println("\n__________________________\n");
        System.out.printf("%20s", hoTen);
        System.out.printf("%7s", gioiTinh);
        System.out.printf("%13s", SDT);
        System.out.printf("%15s", diaChi); 
        System.out.printf("%13s", ma); 
    }
}
