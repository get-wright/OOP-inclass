public abstract class NhanVien {
    protected String tenNhanVien;
    
    public NhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
    
    public abstract double tinhLuong();
    
    public void inThongTin() {
        System.out.println("Ten nhan vien: " + tenNhanVien);
        System.out.println("Luong: " + String.format("%.0f", tinhLuong())); 
    }
}