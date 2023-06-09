package com.asgn2group.cmptasgn2.models;

import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    private String name;
    private float height;
    private float weight;
    private String haircolor;
    private float gpa;
    public Student() {
    }
    
    public Student(String name, float height, float weight, String haircolor, float gpa) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.haircolor = haircolor;
        this.gpa = gpa;
    }
    
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public String getHaircolor() {
        return haircolor;
    }
    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    
    
    // you should create a database table (called “Student”) to 
    // collect information about a series of Students. 
    // The minimum  attributes for the Students are name, weight, height, hair color, and gpa.
    //  In addition, you may add as many other Student attributes as you’d like (Be creative: P). 



    
}
