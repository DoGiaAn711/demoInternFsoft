package com.example.demoInternFsoft.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "acc_user")
public class AccountUser {
    @Id
    private String id;
    private String account;
    private String nickname;
    private String avatar;
    private String state;
    private String mobile;
    private int gender;
    private String dob;
    private String email;
    private boolean isAuthentication;
    private Date createAt;
    private String createBy;
    private Date updateAt;
    private String updateBy;
    private boolean isDelete;
}
