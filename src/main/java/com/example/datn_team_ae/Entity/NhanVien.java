package com.example.datn_team_ae.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Table(name = "nhan_vien")
public class NhanVien {
    public enum Role {
        ADMIN, NHANVIEN
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ho_ten", columnDefinition = "NVARCHAR(255)")
    private String hoTen;

    @Column(name = "username", columnDefinition = "NVARCHAR(255)")
    private String username;

    @Column(name = "password", columnDefinition = "NVARCHAR(255)")
    private String password;

    @Column(name = "email", columnDefinition = "NVARCHAR(255)")
    private String email;

    @Column(name = "dia_chi", columnDefinition = "NVARCHAR(255)")
    private String diaChi;

    @Column(name = "gioi_tinh")
    private Boolean gioiTinh;

    @Column(name = "ngay_sinh")
    private LocalDate ngaySinh;

    @Column(name = "trang_thai", columnDefinition = "NVARCHAR(255)")
    private String trangThai;

    @Enumerated(EnumType.STRING)
    @Column(name = "vai_tro", nullable = false)
    private Role vaiTro;

    @Column(name = "hinh_anh", columnDefinition = "NVARCHAR(255)")
    private String hinhAnh;

    public NhanVien() {
    }

    public NhanVien(Integer id, String hoTen, String username, String password, String email, String diaChi, Boolean gioiTinh, LocalDate ngaySinh, String trangThai, Role vaiTro, String hinhAnh) {
        this.id = id;
        this.hoTen = hoTen;
        this.username = username;
        this.password = password;
        this.email = email;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.trangThai = trangThai;
        this.vaiTro = vaiTro;
        this.hinhAnh = hinhAnh;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
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

    public Role getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(Role vaiTro) {
        this.vaiTro = vaiTro;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
