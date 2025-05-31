package com.example.datn_team_ae.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SanPhamViewDto {
    private Integer id;
    private String tenSanPham;
    private Float gia;
    private String urlHinhAnh;
}
