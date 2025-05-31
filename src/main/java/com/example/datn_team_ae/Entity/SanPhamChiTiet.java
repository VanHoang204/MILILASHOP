package com.example.datn_team_ae.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "san_pham_chi_tiet")
public class SanPhamChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_san_pham", referencedColumnName = "id")
    @JsonBackReference
    private SanPham sanPham;

    @ManyToOne
    @JoinColumn(name = "id_mau_sac", referencedColumnName = "id")
    private MauSac mauSac;

    @ManyToOne
    @JoinColumn(name = "id_kich_thuoc", referencedColumnName = "id")
    private KichThuoc kichThuoc;

    @Column(name = "so_luong")
    private Integer soLuong;

    @Column(name = "gia")
    private Float gia;

    @OneToMany(mappedBy = "sanPhamChiTiet",fetch = FetchType.LAZY)
    private List<HinhAnh> hinhAnh;

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

    @Transient // Không lưu vào cơ sở dữ liệu
    private Float giaGiam;

    public SanPhamChiTiet() {
    }

    public SanPhamChiTiet(Integer id, SanPham sanPham, MauSac mauSac, KichThuoc kichThuoc, Integer soLuong, Float gia, List<HinhAnh> hinhAnh, String trangThai, LocalDate ngayTao, LocalDate ngaySua, String nguoiTao, String nguoiSua, Boolean deleted, Float giaGiam) {
        this.id = id;
        this.sanPham = sanPham;
        this.mauSac = mauSac;
        this.kichThuoc = kichThuoc;
        this.soLuong = soLuong;
        this.gia = gia;
        this.hinhAnh = hinhAnh;
        this.trangThai = trangThai;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.nguoiTao = nguoiTao;
        this.nguoiSua = nguoiSua;
        this.deleted = deleted;
        this.giaGiam = giaGiam;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public MauSac getMauSac() {
        return mauSac;
    }

    public void setMauSac(MauSac mauSac) {
        this.mauSac = mauSac;
    }

    public KichThuoc getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(KichThuoc kichThuoc) {
        this.kichThuoc = kichThuoc;
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

    public List<HinhAnh> getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(List<HinhAnh> hinhAnh) {
        this.hinhAnh = hinhAnh;
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

    public Float getGiaGiam() {
        return giaGiam;
    }

    public void setGiaGiam(Float giaGiam) {
        this.giaGiam = giaGiam;
    }
}
