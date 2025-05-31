package com.example.datn_team_ae.Repository;

import com.example.datn_team_ae.Entity.PhuongThucThanhToan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PhuongThucThanhToanRepository extends JpaRepository<PhuongThucThanhToan,Integer> {

    // Lấy phương thức thanh toán đầu tiên theo ID tăng dần
    Optional<PhuongThucThanhToan> findFirstByOrderByIdAsc();

    PhuongThucThanhToan findByTenPhuongThuc(String tenPhuongThuc);

}
