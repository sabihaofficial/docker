package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class TestData {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    private String name;

    public TestData() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public TestData(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
