package QLBH;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


public class HoaDon implements Serializable{
    private String maHD;
    private String ngayLap;
    private ArrayList<HangHoa>lstHH;
    
    
    public HoaDon() {
    }

    public HoaDon(String maHD, String ngayLap) {
        this.maHD = maHD;
        this.ngayLap = ngayLap;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public void Nhap() {
        System.out.println("Nhap ma hoa don: ");
        maHD = new Scanner(System.in).nextLine();
        System.out.println("Nhap ngay lap hoa don: ");
        ngayLap = new Scanner(System.in).nextLine();
        int n;
        System.out.println("\nNhap so luong hang hoa: ");
        n = new Scanner(System.in).nextInt();
        lstHH = new ArrayList<>();
        for(int i=0; i<n; i++){
            HangHoa x= new HangHoa();
            x.Nhap();
            lstHH.add(x);
        }
    }
    
    public void Hien() {
        System.out.printf("%10s", maHD);
        System.out.printf("%15s", ngayLap);
        for(HangHoa x: lstHH){
            x.Hien();
        }
    }
}
