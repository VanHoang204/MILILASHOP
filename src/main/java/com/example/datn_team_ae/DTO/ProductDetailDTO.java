package com.example.datn_team_ae.DTO;

import lombok.Data;

import java.util.List;

@Data
public class ProductDetailDTO {
    private Integer sanPhamId;
    private List<Integer> mauSacIds;
    private List<Integer> kichThuocIds;
}
