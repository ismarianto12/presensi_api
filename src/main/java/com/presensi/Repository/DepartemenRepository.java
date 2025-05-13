package com.presensi.Repository;

import com.presensi.Models.Departemen;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DepartemenRepository extends JpaRepository<Departemen,Long> {
}