package com.example.datn_team_ae.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Table(name = "hinh_anh")
public class HinhAnh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "url_hinh_anh",columnDefinition = "NVARCHAR(255)")
    private String urlHinhAnh;

    @Column(name = "public_id", columnDefinition = "NVARCHAR(255)")
    private String publicId;

    @ManyToOne
    @JoinColumn(name = "id_san_pham_chi_tiet", referencedColumnName = "id")
    @JsonIgnore
    private SanPhamChiTiet sanPhamChiTiet;

    @Column(name = "trang_thai",columnDefinition = "NVARCHAR(255)")
    private String trangThai;

    @Column(name = "ngay_tao")
    private LocalDate ngayTao;

    @Column(name = "ngay_sua")
    private LocalDate ngaySua;

    @Column(name = "deleted")
    private Boolean deleted;

    public HinhAnh() {
    }

    public HinhAnh(Integer id, String urlHinhAnh, String publicId, SanPhamChiTiet sanPhamChiTiet, String trangThai, LocalDate ngayTao, LocalDate ngaySua, Boolean deleted) {
        this.id = id;
        this.urlHinhAnh = urlHinhAnh;
        this.publicId = publicId;
        this.sanPhamChiTiet = sanPhamChiTiet;
        this.trangThai = trangThai;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.deleted = deleted;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrlHinhAnh() {
        return urlHinhAnh;
    }

    public void setUrlHinhAnh(String urlHinhAnh) {
        this.urlHinhAnh = urlHinhAnh;
    }

    public String getPublicId() {
        return publicId;
    }

    public void setPublicId(String publicId) {
        this.publicId = publicId;
    }

    public SanPhamChiTiet getSanPhamChiTiet() {
        return sanPhamChiTiet;
    }

    public void setSanPhamChiTiet(SanPhamChiTiet sanPhamChiTiet) {
        this.sanPhamChiTiet = sanPhamChiTiet;
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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
