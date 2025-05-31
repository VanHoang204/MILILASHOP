package com.example.datn_team_ae.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SanPhamChiTietDTO {
    private List<Integer> ids;
    private String tenSanPham;
    private String tenMauSac;
    private String tenKichThuoc;
    private Integer id;
    private String mauSac;
    private String kichThuoc;
    private Integer soLuong;
    private Float gia;
    private List<String> hinhAnh;
    private String thuongHieu;
    private String xuatXu;
    private String trangThai;
    private LocalDate ngayTao;
    private Integer mauSacId;
    private Integer kichThuocId;

    // Constructor cho phép ánh xạ dữ liệu từ query
    public SanPhamChiTietDTO(String tenSanPham, String tenMauSac, String tenKichThuoc) {
        this.tenSanPham = tenSanPham;
        this.tenMauSac = tenMauSac;
        this.tenKichThuoc = tenKichThuoc;
    }
}
