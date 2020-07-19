package com.zq.tools.test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "tttt")
@Component
public class TTTT {
    private String name;
    private int age;

    public TTTT() {};

    public TTTT(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "TTTT{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
