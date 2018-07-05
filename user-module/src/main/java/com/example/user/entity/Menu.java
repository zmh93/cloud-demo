package com.example.user.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Menu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long    id;
    private String  name;
    private String  pId;
    private String  url;
    private Integer orderNum;
    private String  icon;
    private String  createBy;
    private Date    createDate;
    private String  updateBy;
    private Date    updateDate;
    private String  permission;
    private Byte    menuType;
/*    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "role_menu", joinColumns = @JoinColumn(name = "menu_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set     roles;*/
}