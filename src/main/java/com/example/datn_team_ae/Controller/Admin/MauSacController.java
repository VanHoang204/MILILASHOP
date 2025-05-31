package com.example.datn_team_ae.Controller.Admin;

import com.example.datn_team_ae.Repository.MauSacRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MauSacController {
    @Autowired
    private MauSacRepository mauSacRepository;
    @RequestMapping("admin/mau-sac")
    public String MauSac(Model model) {
        model.addAttribute("mauSac", mauSacRepository.findByDeleted(false, Sort.by(Sort.Direction.DESC,"id")));
        return "Admin/MauSac/hien-thi";
    }
}
