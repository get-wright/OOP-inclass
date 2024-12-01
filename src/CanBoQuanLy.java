public class CanBoQuanLy extends CanBoCoHuu implements QuanLy {
    private CongTy congTy;
    
    public CanBoQuanLy(String tenNhanVien, double luongCoBan, double heSoLuong, CongTy congTy) {
        super(tenNhanVien, luongCoBan, heSoLuong);
        this.congTy = congTy;
    }
    
    @Override
    public double tinhLuong() {
        return super.tinhLuong() + tinhHoaHong();
    }
    
    @Override
    public double tinhHoaHong() {
        // Hoa hồng = 0.2% lợi nhuận công ty
        return 0.002 * congTy.getLoiNhuan();
    }
    
    @Override
    public void inThongTin() {
        System.out.println("\nCan bo quan ly:");
        super.inThongTin();
    }
}