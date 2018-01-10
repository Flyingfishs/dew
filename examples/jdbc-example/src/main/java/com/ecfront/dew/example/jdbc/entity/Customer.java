package com.ecfront.dew.example.jdbc.entity;

import com.ecfront.dew.jdbc.entity.Column;
import com.ecfront.dew.jdbc.entity.Entity;
import com.ecfront.dew.jdbc.entity.PkColumn;
import com.ecfront.dew.jdbc.entity.Column;
import com.ecfront.dew.jdbc.entity.Entity;
import com.ecfront.dew.jdbc.entity.PkColumn;

import java.io.Serializable;

@Entity
public class Customer implements Serializable{

    @PkColumn
    private int id;
    @Column(notNull = true)
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
