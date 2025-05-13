package com.presensi.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "departemen")
public class Departemen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "divisname")
    private String divisname;

    public String getDivisCode() {
        return divisCode;
    }

    public void setDivisCode(String divisCode) {
        this.divisCode = divisCode;
    }

    public String getDivisname() {
        return divisname;
    }

    public void setDivisname(String divisname) {
        this.divisname = divisname;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    @Column(name = "divisiCOde", precision = 1)
    private String divisCode;

    public Departemen() {

    }
}
