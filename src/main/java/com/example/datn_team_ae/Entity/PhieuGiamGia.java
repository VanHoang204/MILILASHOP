package com.example.datn_team_ae.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Table(name = "phieu_giam_gia")
public class PhieuGiamGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ma_phieu_giam_gia", columnDefinition = "NVARCHAR(255)")
    private String maPhieuGiamGia;

    @Column(name = "ten_phieu_giam_gia", columnDefinition = "NVARCHAR(255)")
    private String tenPhieuGiamGia;

    @Column(name = "gia_tri_giam")
    private Float giaTriGiam;

    @Column(name = "don_vi_tinh", columnDefinition = "NVARCHAR(255)")
    private String donViTinh;

    @Column(name = "dieu_kien")
    private Float dieuKien;

    @Column(name = "ngay_bat_dau")
    private LocalDate ngayBatDau;

    @Column(name = "ngay_ket_thuc")
    private LocalDate ngayKetThuc;

    @Column(name = "mo_ta", columnDefinition = "NVARCHAR(255)")
    private String moTa;

    @Column(name = "trang_thai", columnDefinition = "NVARCHAR(255)")
    private String trangThai;

    @Column(name = "ngay_tao")
    private LocalDate ngayTao;

    @Column(name = "ngay_sua")
    private LocalDate ngaySua;

    @Column(name = "nguoi_tao", columnDefinition = "NVARCHAR(255)")
    private String nguoiTao;

    @Column(name = "nguoi_sua", columnDefinition = "NVARCHAR(255)")
    private String nguoiSua;

    @Column(name = "deleted")
    private Boolean deleted;

    @Column(name = "so_luot_su_dung")
    private Integer soLuotSuDung; // Số lượt có thể sử dụng

    public PhieuGiamGia() {
    }

    public PhieuGiamGia(Integer id, String maPhieuGiamGia, String tenPhieuGiamGia, Float giaTriGiam, String donViTinh, Float dieuKien, LocalDate ngayBatDau, LocalDate ngayKetThuc, String moTa, String trangThai, LocalDate ngayTao, LocalDate ngaySua, String nguoiTao, String nguoiSua, Boolean deleted, Integer soLuotSuDung) {
        this.id = id;
        this.maPhieuGiamGia = maPhieuGiamGia;
        this.tenPhieuGiamGia = tenPhieuGiamGia;
        this.giaTriGiam = giaTriGiam;
        this.donViTinh = donViTinh;
        this.dieuKien = dieuKien;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.moTa = moTa;
        this.trangThai = trangThai;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.nguoiTao = nguoiTao;
        this.nguoiSua = nguoiSua;
        this.deleted = deleted;
        this.soLuotSuDung = soLuotSuDung;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaPhieuGiamGia() {
        return maPhieuGiamGia;
    }

    public void setMaPhieuGiamGia(String maPhieuGiamGia) {
        this.maPhieuGiamGia = maPhieuGiamGia;
    }

    public String getTenPhieuGiamGia() {
        return tenPhieuGiamGia;
    }

    public void setTenPhieuGiamGia(String tenPhieuGiamGia) {
        this.tenPhieuGiamGia = tenPhieuGiamGia;
    }

    public Float getGiaTriGiam() {
        return giaTriGiam;
    }

    public void setGiaTriGiam(Float giaTriGiam) {
        this.giaTriGiam = giaTriGiam;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public Float getDieuKien() {
        return dieuKien;
    }

    public void setDieuKien(Float dieuKien) {
        this.dieuKien = dieuKien;
    }

    public LocalDate getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(LocalDate ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public LocalDate getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(LocalDate ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    public LocalDate getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(LocalDate ngaySua) {
        this.ngaySua = ngaySua;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public String getNguoiSua() {
        return nguoiSua;
    }

    public void setNguoiSua(String nguoiSua) {
        this.nguoiSua = nguoiSua;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Integer getSoLuotSuDung() {
        return soLuotSuDung;
    }

    public void setSoLuotSuDung(Integer soLuotSuDung) {
        this.soLuotSuDung = soLuotSuDung;
    }
}
