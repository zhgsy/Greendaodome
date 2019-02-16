package com.bw.com.greendaodome.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class PersonEntity {
    @Id(autoincrement = true)
    @Unique
    private Long id;
    public  String name;
    @Generated(hash = 705012136)
    public PersonEntity(long id, String name) {
        this.id = id;
        this.name = name;
    }
    @Generated(hash = 69356185)
    public PersonEntity() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
