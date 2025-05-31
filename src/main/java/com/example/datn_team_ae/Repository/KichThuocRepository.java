package com.example.datn_team_ae.Repository;

import com.example.datn_team_ae.Entity.KichThuoc;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KichThuocRepository extends JpaRepository<KichThuoc,Integer> {
    boolean existsByTenKichThuoc(String tenKichThuoc);

    List<KichThuoc> findByTrangThai(String trangThai, Sort sort);

}
