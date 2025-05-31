package com.example.datn_team_ae.Repository;

import com.example.datn_team_ae.Entity.MauSac;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MauSacRepository extends JpaRepository<MauSac,Integer> {
    boolean existsByTenMauSac(String tenMauSac);

    List<MauSac> findByTrangThai(String trangThai, Sort sort);

    List<MauSac> findByDeleted(Boolean deleted, Sort sort);
}
