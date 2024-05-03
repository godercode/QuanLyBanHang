package QLBH;

import java.io.Serializable;
import java.util.Scanner;


public class NhanVien extends Nguoi implements IChucVu, Serializable {

    private float heSL;
    private float lcb;
    private String chucVu;
    int chonl;
    double luong;

    public NhanVien() {
        super();
    }

    public NhanVien(float heSL, float lcb, String chucVu) {
        super();
        this.heSL = heSL;
        this.lcb = lcb;
        this.chucVu = chucVu;
    }

    public float getHeSL() {
        return heSL;
    }

    public void setHeSL(float heSL) {
        this.heSL = heSL;
    }

    public float getLcb() {
        return lcb;
    }

    public void setLcb(float lcb) {
        this.lcb = lcb;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.println("Nhap he so luong: ");
        heSL = new Scanner(System.in).nextFloat();
        int chon;
        do {
            System.out.println("Nhap chuc vu nhan vien: ");
            System.out.println("1. Nhan vien ban hang");
            System.out.println("2. Nhan vien kho hang ");
            System.out.println("3. Nhan vien quang cao");
            System.out.println("4. Ket thuc");
            chon = new Scanner(System.in).nextInt();
            switch (chon) {
                case 1 -> { 
                    chucVu = BANHANG;
                    chonl = 1;
                }
                case 2 -> { 
                    chucVu = KHOHANG;
                    chonl = 2;
                }
                case 3 -> {
                    chucVu = QUANGCAO;
                    chonl = 3;
                }
                case 4 -> {
                }
                default -> {
                }
            }
        } while (chon != 4);
    }

    public float luongCB() {
        if (chucVu.equals(BANHANG)) {
            lcb = (float) 300000;
        }
        if (chucVu.equals(KHOHANG)) {
            lcb = (float) 400000;
        }
        if (chucVu.equals(QUANGCAO)) {
            lcb = (float) 500000;
        }
        return lcb;
    }
    
    public float getLuong(){
        return luongCB()*heSL;
    }
    
        @Override
        public void Hien(){
        super.Hien();
            System.out.printf("%10.1f", +heSL);
            System.out.printf("%15s", chucVu);
            System.out.printf("%15.1f", getLuong());
        }
    }
