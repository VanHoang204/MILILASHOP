package com.example.datn_team_ae.Repository;

import com.example.datn_team_ae.Entity.PhieuGiamGia;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PhieuGiamGiaRepository extends JpaRepository<PhieuGiamGia,Integer> {
    List<PhieuGiamGia> findByDieuKienLessThanEqualAndTrangThaiAndDeletedFalse(Float tongTien, String trangThai);

    List<PhieuGiamGia> findByTrangThai(String trangThai, Sort sort);

    Optional<PhieuGiamGia> findByTenPhieuGiamGia(String tenPhieuGiamGia);


    List<PhieuGiamGia> findByDeletedFalse(Sort sort);

    List<PhieuGiamGia> findByDeletedFalseAndTrangThai(String trangThai, Sort sort);

    Integer countByTrangThaiAndDeletedFalse(String trangThai);

    Integer countByDeletedFalse();

    List<PhieuGiamGia> findByDeleted(Boolean deleted, Sort sort);
}
