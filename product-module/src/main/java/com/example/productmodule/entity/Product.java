package com.example.productmodule.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long   id;

    @Column
    private String name;

    @Column
    private Date   createDate;

    @Column
    private Double price;

    @Column
    private String deleteFlg;
}
