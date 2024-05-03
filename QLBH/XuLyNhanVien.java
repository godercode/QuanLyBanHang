package QLBH;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class XuLyNhanVien {

    ArrayList<NhanVien> list = new ArrayList<>();
    public static final String fname = "NhanVien.DAT";

    public void nhap() throws IOException{
        System.out.println("Nhap so nhan vien: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; ++i) {
            NhanVien nv = new NhanVien();
            nv.Nhap();
            list.add(nv);
        }
        ghiF();
    }

    public void hien() throws IOException, FileNotFoundException, ClassNotFoundException {
        list = docF();
        for (NhanVien x : list) {
            x.Hien();
        }
    }
    
    public void themNV() throws IOException, FileNotFoundException, ClassNotFoundException {
        list = docF();
        System.out.println("Moi ban them nhan vien: ");
        NhanVien nv = new NhanVien();
        nv.Nhap();
        list.add(nv);
        ghiF();
    }

    public void xoaNV() throws IOException, FileNotFoundException, ClassNotFoundException {
        list = docF();
        String s;
        boolean a = false;
        System.out.println("Nhap ma nhan vien can xoa: ");
        s = new Scanner(System.in).nextLine();
        for (NhanVien x : list) {
            if (x.getMa().equals(s)) {
                list.remove(x);
                a = true;
                break;
            }
        }
        if (a == false) System.out.println("\nKhong tim thay ma nhan vien.");
    }

    public void timNV() throws IOException, FileNotFoundException, ClassNotFoundException {
        list = docF();
        String s;
        boolean a = false;
        System.out.println("\nNhap ma nhan vien can tim: ");
        s = new Scanner(System.in).nextLine();
        for (NhanVien x : list) {
            if (x.getMa().equals(s)) {
                x.Hien();
                a = true;
                break;
            }
        }
        if (a == false) System.out.println("\nKhong tim thay ma nhan vien.");
    }

    public float tongLuong() throws IOException, ClassNotFoundException {
        list = docF();
        float tong = 0;
        for (NhanVien x : list) {
            tong += x.getLuong();
        }
        return tong;
    }

    public void ghiF() throws FileNotFoundException, IOException {
        File df = new File();
        df.ghiFile(list, fname);
        System.out.println("\nGhi File thành công.");
    }

    public ArrayList<NhanVien> docF() throws FileNotFoundException, IOException, ClassNotFoundException {
        File dg = new File();
        return dg.docFile(fname);
    }
}
