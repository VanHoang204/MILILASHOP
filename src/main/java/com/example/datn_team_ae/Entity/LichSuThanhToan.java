package com.example.datn_team_ae.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Table(name = "lich_su_thanh_toan")
public class LichSuThanhToan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_hoa_don", referencedColumnName = "id")
    private HoaDon hoaDon;

    @ManyToOne
    @JoinColumn(name = "id_nhan_vien", referencedColumnName = "id")
    private NhanVien nhanVien;

    @ManyToOne
    @JoinColumn(name = "id_phuong_thuc_thanh_toan", referencedColumnName = "id")
    private PhuongThucThanhToan phuongThucThanhToan;

    @Column(name = "so_tien_thanh_toan")
    private Float soTienThanhToan;

    @Column(name = "thoi_gian_thanh_toan")
    private LocalDateTime thoiGianThanhToan;

    @Column(name = "trang_thai", columnDefinition = "NVARCHAR(255)")
    private String trangThai;

    @Column(name = "ghi_chu", columnDefinition = "NVARCHAR(255)")
    private String ghiChu;

    @Column(name = "ma_giao_dich", columnDefinition = "NVARCHAR(50)")
    private String maGiaoDich;

    public LichSuThanhToan() {
    }

    public LichSuThanhToan(Integer id, HoaDon hoaDon, NhanVien nhanVien, PhuongThucThanhToan phuongThucThanhToan, Float soTienThanhToan, LocalDateTime thoiGianThanhToan, String trangThai, String ghiChu, String maGiaoDich) {
        this.id = id;
        this.hoaDon = hoaDon;
        this.nhanVien = nhanVien;
        this.phuongThucThanhToan = phuongThucThanhToan;
        this.soTienThanhToan = soTienThanhToan;
        this.thoiGianThanhToan = thoiGianThanhToan;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
        this.maGiaoDich = maGiaoDich;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public PhuongThucThanhToan getPhuongThucThanhToan() {
        return phuongThucThanhToan;
    }

    public void setPhuongThucThanhToan(PhuongThucThanhToan phuongThucThanhToan) {
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

    public Float getSoTienThanhToan() {
        return soTienThanhToan;
    }

    public void setSoTienThanhToan(Float soTienThanhToan) {
        this.soTienThanhToan = soTienThanhToan;
    }

    public LocalDateTime getThoiGianThanhToan() {
        return thoiGianThanhToan;
    }

    public void setThoiGianThanhToan(LocalDateTime thoiGianThanhToan) {
        this.thoiGianThanhToan = thoiGianThanhToan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }
}
