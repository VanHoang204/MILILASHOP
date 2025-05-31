package com.example.datn_team_ae.Controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HinhAnhController {
    @RequestMapping("admin/hinh-anh")
    public String HinhAnh() {
        return "Admin/HinhAnh/hien-thi";
    }
}
