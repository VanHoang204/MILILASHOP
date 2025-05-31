package com.example.datn_team_ae.Entity;

import jakarta.persistence.*;


import java.time.LocalDate;


@Entity
@Table(name = "chat_lieu")
public class ChatLieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ma_chat_lieu", columnDefinition = "NVARCHAR(255)")
    private String maChatLieu;

    @Column(name = "ten_chat_lieu", columnDefinition = "NVARCHAR(255)")
    private String tenChatLieu;

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

    public ChatLieu() {
    }

    public ChatLieu(Integer id, String maChatLieu, String tenChatLieu, String trangThai, LocalDate ngayTao, LocalDate ngaySua, String nguoiTao, String nguoiSua, Boolean deleted) {
        this.id = id;
        this.maChatLieu = maChatLieu;
        this.tenChatLieu = tenChatLieu;
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

    public String getMaChatLieu() {
        return maChatLieu;
    }

    public void setMaChatLieu(String maChatLieu) {
        this.maChatLieu = maChatLieu;
    }

    public String getTenChatLieu() {
        return tenChatLieu;
    }

    public void setTenChatLieu(String tenChatLieu) {
        this.tenChatLieu = tenChatLieu;
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
