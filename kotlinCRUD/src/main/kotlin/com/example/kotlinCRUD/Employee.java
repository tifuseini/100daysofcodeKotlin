package com.example.kotlinCRUD;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Employee {
    private @Id @GeneratedValue Long id;
    private String name;
    private String role;

    Employee(){}

    Employee(String name,String role){
        this.name = name;
        this.role = role;
    }

    public Long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
    public  String getRole(){
        return this.role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equ
}
