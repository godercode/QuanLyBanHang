package QLBH;

import java.io.Serializable;
import java.util.Scanner;


public class HangHoa implements ILoaiHang, Serializable {

    private String maHH, tenHH, loaiHH;
    private int soLuong;
    private float donGia, giamGia;

    public HangHoa() {
    }

    public HangHoa(String maHH, String tenHH, String loaiHH, int soLuong, float donGia, float giamGia) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.loaiHH = loaiHH;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public String getLoaiHH() {
        return loaiHH;
    }

    public void setLoaiHH(String loaiHH) {
        this.loaiHH = loaiHH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public float getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(float giamGia) {
        this.giamGia = giamGia;
    }

    public void Nhap() {
        System.out.println("Nhap ma hang hoa: ");
        maHH = new Scanner(System.in).nextLine();
        System.out.println("Nhap ten hang hoa: ");
        tenHH = new Scanner(System.in).nextLine();
        int chon;
        do {
            System.out.println("Nhap loai hang: ");
            System.out.println("1. Hang cu");
            System.out.println("2. Hang moi ");
            System.out.println("3. Hang like new");
            System.out.println("4. Ket thuc");
            chon = new Scanner(System.in).nextInt();
            switch (chon) {
                case 1 -> loaiHH = CU;
                case 2 -> loaiHH = MOI;
                case 3 -> loaiHH = LIKENEW;
                case 4 -> {
                }
                default -> {
                }
            }
        } while (chon != 4);
        System.out.println("Nhap so luong: ");
        soLuong = new Scanner(System.in).nextInt();
        System.out.println("Nhap don gia: ");
        donGia = new Scanner(System.in).nextFloat();
    }

    public float giamGia() {
        if (loaiHH.equals(CU)) {
            giamGia = (float) 0.1;
        }
        if (loaiHH.equals(MOI)) {
            giamGia = (float) 0.5;
        }
        if (loaiHH.equals(LIKENEW)) {
            giamGia = (float) 0.3;
        }
        return giamGia;
    }

    public float tinhTien() {
        return soLuong * donGia * giamGia();
    }

    public void Hien() {
        System.out.printf("%10s", maHH);
        System.out.printf("%15s", tenHH);
        System.out.printf("%10s", loaiHH);
        System.out.printf("%5d", soLuong);
        System.out.printf("%7.1f", donGia);
        System.out.printf("%10.1f", tinhTien());

    }
}
