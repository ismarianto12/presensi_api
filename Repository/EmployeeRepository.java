package com.presensi.Repository;

import com.presensi.Models.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employe, Long> {
}
