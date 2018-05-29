package com.codegym.model;

import javax.validation.constraints.*;

public class User {
    @NotEmpty(message = "not null")
    @Size(min = 2, max = 65, message = "phai co 2 den 65 ki tu")
    @Pattern(regexp = "^[A-Z a-z]*$", message = "khong duoc co so o day")
    private String name;

    @NotNull
    @Min(18)
    private int age;

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
