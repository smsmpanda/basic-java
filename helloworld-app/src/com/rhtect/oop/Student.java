package com.rhtect.oop;

public class Student {
    String name;
    int age;
    public void ChangeName(String newName){
        this.name = newName;
    }

    public void Growonece(){
        ++this.age;
    }
}