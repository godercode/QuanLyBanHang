package QLBH;

import java.io.Serializable;
import java.util.Scanner;


public class KhachHang extends Nguoi implements IDacDiem, Serializable {

    private String dacDiem;
    private float khuyenMai;

    public KhachHang() {
    }

    public KhachHang(String dacDiem, float khuyenMai) {
        super();
        this.dacDiem = dacDiem;
        this.khuyenMai = khuyenMai;
    }

    public String getDacDiem() {
        return dacDiem;
    }

    public void setDacDiem(String dacDiem) {
        this.dacDiem = dacDiem;
    }

    public float getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(float khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        int chon;
        do {
            System.out.println("Nhap dac diem khach hang: ");
            System.out.println("1. Khach hang thong thuong");
            System.out.println("2. Khach hang quen ");
            System.out.println("3. Khach hang VIP");
            System.out.println("4. Ket thuc");
            chon = new Scanner(System.in).nextInt();
            switch (chon) {
                case 1 -> dacDiem = THONGTHUONG;
                case 2 -> dacDiem = KHACHQUEN;
                case 3 -> dacDiem = KHACHVIP;
                case 4 -> {
                }
                default -> {
                }
            }
        } while (chon != 4);
    }
    public float giamGia(){
        if(dacDiem.equals(THONGTHUONG)){
            khuyenMai =0; 
        }
       if(dacDiem.equals(KHACHQUEN)){
            khuyenMai = (float) 0.1 ; 
        }
       if(dacDiem.equals(KHACHVIP)){
            khuyenMai =(float) 0.5; 
        }
       return khuyenMai;
    }
    @Override
    public void Hien(){
        super.Hien();
        System.out.printf("%20s", dacDiem);
        System.out.printf("%15.1f", giamGia());
    }
    
}

