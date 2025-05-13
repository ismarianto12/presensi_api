package com.presensi.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "role_position")
public class Role {
    @Id
    private String id;
    @Column(name = "role_name")
    private String roleName;
    private String userId;
    @Column(name = "created_at")
    private String cretedAt;


    public String getCretedAt() {
        return cretedAt;
    }

    public void setCretedAt(String cretedAt) {
        this.cretedAt = cretedAt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Role() {

    }


}
