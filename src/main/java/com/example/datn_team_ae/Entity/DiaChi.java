package com.example.datn_team_ae.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "dia_chi")
public class DiaChi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dia_chi_cu_the",columnDefinition = "NVARCHAR(255)")
    private String diaChiCuThe;

    @Column(name = "phuong",columnDefinition = "NVARCHAR(255)")
    private String phuong;

    @Column(name = "huyen",columnDefinition = "NVARCHAR(255)")
    private String huyen;

    @Column(name = "thanh_pho",columnDefinition = "NVARCHAR(255)")
    private String thanhPho;

    @Column(name = "trang_thai",columnDefinition = "NVARCHAR(255)")
    private String trangThai;

    @ManyToOne
    @JoinColumn(name = "id_khach_hang")
    @JsonIgnore
    private KhachHang khachHang;

    public DiaChi() {
    }

    public DiaChi(Integer id, String diaChiCuThe, String phuong, String huyen, String thanhPho, String trangThai, KhachHang khachHang) {
        this.id = id;
        this.diaChiCuThe = diaChiCuThe;
        this.phuong = phuong;
        this.huyen = huyen;
        this.thanhPho = thanhPho;
        this.trangThai = trangThai;
        this.khachHang = khachHang;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiaChiCuThe() {
        return diaChiCuThe;
    }

    public void setDiaChiCuThe(String diaChiCuThe) {
        this.diaChiCuThe = diaChiCuThe;
    }

    public String getPhuong() {
        return phuong;
    }

    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }

    public String getHuyen() {
        return huyen;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }
}
