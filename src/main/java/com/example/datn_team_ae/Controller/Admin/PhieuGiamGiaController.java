package com.example.datn_team_ae.Controller.Admin;

import com.example.datn_team_ae.Repository.PhieuGiamGiaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhieuGiamGiaController {

    @Autowired
    private PhieuGiamGiaRepository phieuGiamGiaRepository;

    @RequestMapping("admin/phieu-giam-gia")
    public String PhieuGiamGia(Model model) {
        model.addAttribute("phieuGiamGia", phieuGiamGiaRepository.findByDeleted(true, Sort.by(Sort.Direction.DESC,"id")));
        return "Admin/PhieuGiamGia/hien-thi";
    }
}
