package com.deviro.datbase.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Books {
    @Id
    private Long book_id;
    private String book_author;
}






