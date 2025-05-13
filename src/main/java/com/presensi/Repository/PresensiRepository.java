package com.presensi.Repository;

import com.presensi.Models.PresensiModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresensiRepository extends JpaRepository<PresensiModel, Long> {
}
