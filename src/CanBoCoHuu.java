public class CanBoCoHuu extends NhanVien {
    private double luongCoBan;
    private double heSoLuong;
    
    public CanBoCoHuu(String tenNhanVien, double luongCoBan, double heSoLuong) {
        super(tenNhanVien);
        if (luongCoBan < 0) throw new IllegalArgumentException("Luong co ban khong the nho hon 0");
        if (heSoLuong <= 0) throw new IllegalArgumentException("He so luong phai lon hon 0");
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }
    
    @Override
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }
    
    @Override
    public void inThongTin() {
        System.out.println("\nCan bo co huu:");
        super.inThongTin();
    }
}