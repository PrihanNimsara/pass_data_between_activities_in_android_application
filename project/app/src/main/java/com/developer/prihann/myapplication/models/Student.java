package com.developer.prihann.myapplication.models;


import java.io.Serializable;

public class Student  implements Serializable {

    private Integer age;
    private String name;

    public Student() {
    }

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
