package com.example.datn_team_ae.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {
    private String email;
    private String password;
    private String loaiTaiKhoan;
}
