package com.app.model;

//It will have all the getters and setters and class is final.
public record Employee(Long id, Long departmentId, String name, int age, String position) {

}
