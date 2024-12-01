public class GiamDoc extends CanBoCoHuu implements QuanLy {
    private double phuCap;
    private CongTy congTy;
    
    public GiamDoc(String tenNhanVien, double luongCoBan, double heSoLuong, double phuCap, CongTy congTy) {
        super(tenNhanVien, luongCoBan, heSoLuong);
        this.phuCap = phuCap;
        this.congTy = congTy;
    }
    
    @Override
    public double tinhLuong() {
        return super.tinhLuong() + phuCap + tinhHoaHong();
    }
    
    @Override
    public double tinhHoaHong() {
        // Hoa hồng = 5% lợi nhuận công ty
        return 0.05 * congTy.getLoiNhuan();
    }
    
    @Override
    public void inThongTin() {
        System.out.println("\nGiam doc:");
        super.inThongTin();
    }
}