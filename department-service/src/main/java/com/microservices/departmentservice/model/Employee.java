package com.microservices.departmentservice.model;

//It will have all the getters and setters and class is final.
public record Employee(Long id, Long departmetnId, String name, int age, String position) {

}
