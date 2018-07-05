package com.example.user.entity;

import lombok.Data;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long    id;
    private String  roleName;
    private String  remark;
    private String  createBy;
    private Date    createDate;
    private String  updateBy;
    private Date    updateDate;

    @ManyToMany
    @JoinTable(name = "role_menu",joinColumns = @JoinColumn(name="role_id"),inverseJoinColumns = @JoinColumn(name="menu_id"))
    private Set<Menu> menus;
}