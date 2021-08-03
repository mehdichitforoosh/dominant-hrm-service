package com.rondoit.hrmservice.employee.repository;

public interface EmployeeCommandRepository {

    void create(String id,String name,String personnelId);

    int updateBasic();
}
