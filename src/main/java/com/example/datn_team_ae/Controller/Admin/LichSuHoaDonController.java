package com.example.datn_team_ae.Controller.Admin;

import com.example.datn_team_ae.Service.LichSuHoaDonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LichSuHoaDonController {

    @Autowired
    private LichSuHoaDonService lichSuHoaDonService;

    @GetMapping("admin/order-details")
    public String orderDetails(@RequestParam(value = "hoaDonId") Integer hoaDonId,
                               Model model) {
        if (hoaDonId == null) {
            throw new IllegalArgumentException("hoaDonId không được để trống.");
        }

        lichSuHoaDonService.getOrderDetails(hoaDonId, model);
        return "Admin/HoaDonChiTiet/order-details";
    }

}
