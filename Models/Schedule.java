package com.presensi.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.springframework.context.annotation.Primary;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.client.HttpClientErrorException;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "schedule")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "time", length = 10)
    private Timestamp time;

    @NotBlank(message = "field is requierd")
    @Column(name = "date", length = 10)
    private Date date;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;


}
