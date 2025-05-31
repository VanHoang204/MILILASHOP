package com.example.datn_team_ae.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "khach_hang")
public class KhachHang {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ho_ten",columnDefinition = "NVARCHAR(255)")
    private String hoTen;

    @Column(name = "username",columnDefinition = "NVARCHAR(255)")
    private String username;

    @Column(name = "password",columnDefinition = "NVARCHAR(255)")
    private String password;

    @Column(name = "so_dien_thoai",columnDefinition = "NVARCHAR(255)")
    private String soDienThoai;

    @Column(name = "email",columnDefinition = "NVARCHAR(255)")
    private String email;

    @Column(name = "gioi_tinh")
    private Boolean gioiTinh;

    @Column(name = "ngay_sinh")
    private LocalDate ngaySinh;

    @Column(name = "trang_thai",columnDefinition = "NVARCHAR(255)")
    private String trangThai;

    @Column(name = "hinh_anh",columnDefinition = "NVARCHAR(255)")
    private String hinhAnh;

    @OneToMany(mappedBy = "khachHang", fetch = FetchType.LAZY)
    private List<DiaChi> diaChis = new ArrayList<>();

    @OneToMany(mappedBy = "khachHang", fetch = FetchType.LAZY)
    private List<HoaDon> hoaDons = new ArrayList<>();

    public KhachHang() {
    }

    public KhachHang(Integer id, String hoTen, String username, String password, String soDienThoai, String email, Boolean gioiTinh, LocalDate ngaySinh, String trangThai, String hinhAnh, List<DiaChi> diaChis, List<HoaDon> hoaDons) {
        this.id = id;
        this.hoTen = hoTen;
        this.username = username;
        this.password = password;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.trangThai = trangThai;
        this.hinhAnh = hinhAnh;
        this.diaChis = diaChis;
        this.hoaDons = hoaDons;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public List<DiaChi> getDiaChis() {
        return diaChis;
    }

    public void setDiaChis(List<DiaChi> diaChis) {
        this.diaChis = diaChis;
    }

    public List<HoaDon> getHoaDons() {
        return hoaDons;
    }

    public void setHoaDons(List<HoaDon> hoaDons) {
        this.hoaDons = hoaDons;
    }
}
