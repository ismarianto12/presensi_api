package com.presensi.Models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "presensi")
public class PresensiModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(nullable = false)
    private LocalDate tanggal;

    @Column(name = "jam_masuk")
    private LocalTime jamMasuk;

    @Column(name = "jam_keluar")
    private LocalTime jamKeluar;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusPresensi status;

    // Enum untuk status
    public enum StatusPresensi {
        HADIR,
        IZIN,
        SAKIT,
        ALPHA
    }

    // Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public LocalTime getJamMasuk() {
        return jamMasuk;
    }

    public void setJamMasuk(LocalTime jamMasuk) {
        this.jamMasuk = jamMasuk;
    }

    public LocalTime getJamKeluar() {
        return jamKeluar;
    }

    public void setJamKeluar(LocalTime jamKeluar) {
        this.jamKeluar = jamKeluar;
    }

    public StatusPresensi getStatus() {
        return status;
    }

    public void setStatus(StatusPresensi status) {
        this.status = status;
    }
}
