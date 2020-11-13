package com.hz.domain;

public class Student {

    private String name;
    private Integer age;

    public Student() {
        System.out.println("Student无参构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName：" + name);
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        System.out.println("setAge：" + age);
        this.age = age;
    }
}