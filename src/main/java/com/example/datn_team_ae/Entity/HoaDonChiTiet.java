package com.example.datn_team_ae.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "hoa_don_chi_tiet")
public class HoaDonChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_san_pham_chi_tiet",referencedColumnName = "id")
    private SanPhamChiTiet sanPhamChiTiet;

    @ManyToOne
    @JoinColumn(name = "id_hoa_don",referencedColumnName = "id")
    private HoaDon hoaDon;

    @Column(name = "so_luong")
    private Integer soLuong;

    @Column(name = "gia")
    private Float gia;

    @Column(name = "thanh_tien")
    private Float thanhTien;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(Integer id, SanPhamChiTiet sanPhamChiTiet, HoaDon hoaDon, Integer soLuong, Float gia, Float thanhTien) {
        this.id = id;
        this.sanPhamChiTiet = sanPhamChiTiet;
        this.hoaDon = hoaDon;
        this.soLuong = soLuong;
        this.gia = gia;
        this.thanhTien = thanhTien;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SanPhamChiTiet getSanPhamChiTiet() {
        return sanPhamChiTiet;
    }

    public void setSanPhamChiTiet(SanPhamChiTiet sanPhamChiTiet) {
        this.sanPhamChiTiet = sanPhamChiTiet;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }

    public Float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Float thanhTien) {
        this.thanhTien = thanhTien;
    }
}
