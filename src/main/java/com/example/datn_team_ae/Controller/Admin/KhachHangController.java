package com.example.datn_team_ae.Controller.Admin;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KhachHangController {
    @RequestMapping("admin/khach-hang")
    public String khachHang() {
        return "admin/KhachHang/hien-thi";
    }

}
