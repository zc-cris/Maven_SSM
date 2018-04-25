package com.zc.cris.model.user;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_user")
public class UserVO {

    @Id
    private Integer id;
    @Column(name = "user_name")
    private String name;
    @Column(name = "user_age")
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public UserVO(Integer id, String name, Integer age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public UserVO() {
        super();

    }
    

    public UserVO(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserVO [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}
