package QLBH;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class XuLyKhachHang {
    ArrayList<KhachHang> list = new ArrayList<>();
    public static final String fname = "KhachHang.DAT";

    public void nhap() throws IOException {
        System.out.println("Nhap so khach hang: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i<n;++i){
            KhachHang kh = new KhachHang();
            kh.Nhap();
            list.add(kh);
        }
        ghiF();
    }
    
    public void themKH() throws ClassNotFoundException, IOException{
        list = docF();
        KhachHang x= new KhachHang();
        x.Nhap();
        list.add(x);
    }
    
    public void xoaKH() throws IOException, FileNotFoundException, ClassNotFoundException{
        list = docF();
        String s;
        boolean a = false;
        System.out.println("Nhap ma hang hoa can xoa: ");
        s= new Scanner (System.in).nextLine();
        for(KhachHang x: list){
            if(x.getMa().equals(s)){
                list.remove(x);
                a = true;
                break; 
            }
        }
        if (a == false) System.out.println("\nKhong tim thay khach hang."); 
    }
    
    public void timHH() throws IOException, FileNotFoundException, ClassNotFoundException{
        list = docF();
        String s;
        boolean a = false;
        System.out.println("\nNhap ma khach hang can tim: ");
        s= new Scanner(System.in).nextLine();
        for(KhachHang x: list){
            if(x.getMa().equals(s)){
                x.Hien();
            }
        }
        if ( a == false) System.out.println("Khong tim thay khach hang");
    }
    
    
    public void ghiF() throws FileNotFoundException, IOException {
        File df = new File();
        df.ghiFile(list, fname);
        System.out.println("\nGhi File thành công.");
    }

    public ArrayList<KhachHang> docF() throws FileNotFoundException, IOException, ClassNotFoundException {
        File dg = new File();
        return dg.docFile(fname);
    }

    public void hien() throws IOException, ClassNotFoundException {
        list = docF();
        for(KhachHang kh : list) {
            kh.Hien();
        }
    }
}
