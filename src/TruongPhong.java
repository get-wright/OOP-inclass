public class TruongPhong extends CanBoCoHuu {
    private double phuCap;
    
    public TruongPhong(String tenNhanVien, double luongCoBan, double heSoLuong, double phuCap) {
        super(tenNhanVien, luongCoBan, heSoLuong);
        this.phuCap = phuCap;
    }
    
    @Override
    public double tinhLuong() {
        return super.tinhLuong() + phuCap;
    }
    
    @Override
    public void inThongTin() {
        System.out.println("\nTruong phong:");
        super.inThongTin();
    }
}