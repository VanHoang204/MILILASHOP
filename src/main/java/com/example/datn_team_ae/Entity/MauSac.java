package com.example.datn_team_ae.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Table(name = "mau_sac")
public class MauSac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ma_mau_sac",columnDefinition = "NVARCHAR(255)")
    private String maMauSac;

    @Column(name = "ten_mau_sac",columnDefinition = "NVARCHAR(255)")
    private String tenMauSac;

    @Column(name = "trang_thai",columnDefinition = "NVARCHAR(255)")
    private String trangThai;

    @Column(name = "ngay_tao")
    private LocalDate ngayTao;

    @Column(name = "ngay_sua")
    private LocalDate ngaySua;

    @Column(name = "nguoi_tao",columnDefinition = "NVARCHAR(255)")
    private String nguoiTao;

    @Column(name = "nguoi_sua",columnDefinition = "NVARCHAR(255)")
    private String nguoiSua;

    @Column(name = "deleted")
    private Boolean deleted;

    public MauSac() {
    }

    public MauSac(Integer id, String maMauSac, String tenMauSac, String trangThai, LocalDate ngayTao, LocalDate ngaySua, String nguoiTao, String nguoiSua, Boolean deleted) {
        this.id = id;
        this.maMauSac = maMauSac;
        this.tenMauSac = tenMauSac;
        this.trangThai = trangThai;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.nguoiTao = nguoiTao;
        this.nguoiSua = nguoiSua;
        this.deleted = deleted;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaMauSac() {
        return maMauSac;
    }

    public void setMaMauSac(String maMauSac) {
        this.maMauSac = maMauSac;
    }

    public String getTenMauSac() {
        return tenMauSac;
    }

    public void setTenMauSac(String tenMauSac) {
        this.tenMauSac = tenMauSac;
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
}
