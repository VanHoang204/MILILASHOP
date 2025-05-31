package com.example.datn_team_ae.Repository;

import com.example.datn_team_ae.Entity.LichSuHoaDon;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LichSuHoaDonRepository extends JpaRepository<LichSuHoaDon,Integer> {
    List<LichSuHoaDon> findByHoaDonId(Integer hoaDonId);
}
