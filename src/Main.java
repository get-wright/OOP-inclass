public class Main {
    public static void main(String[] args) {
        // Tao cong ty
        CongTy congTy = new CongTy("SEC_comp");
    
        congTy.setLoiNhuan(100000000); // 1 tỷ đồng
        
        // Tạo các nhân viên
        NhanVien giamDoc = new GiamDoc("Nguyen Van A", 20000000, 3.0, 10000000, congTy);
        NhanVien truongPhong1 = new TruongPhong("Tran Thi B", 15000000, 2.5, 5000000);
        NhanVien quanLy = new CanBoQuanLy("Le Van C", 12000000, 2.0, congTy);
        NhanVien canBoCoHuu = new CanBoCoHuu("Pham Van D", 10000000, 1.5);
        NhanVien canBoHopDong = new CanBoHopDong("Vo Thi E", 8000000);
        
        // Thêm nhân viên vào công ty
        congTy.themNV(giamDoc);
        congTy.themNV(truongPhong1);
        congTy.themNV(quanLy);
        congTy.themNV(canBoCoHuu);
        congTy.themNV(canBoHopDong);
        
        congTy.inThongTin(); // In thông tin công ty và nhân viên
        System.out.println("\nTong luong cong ty: " + String.format("%.0f", congTy.tinhTongLuong())); // In tổng lương
    }
}