package com.rondoit.hrmservice.employee.repository;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeCommandRepositoryImpl implements EmployeeCommandRepository {

    private final DSLContext context;

    @Autowired
    public EmployeeCommandRepositoryImpl(DSLContext context) {
        this.context = context;
    }

    public void create(String id, String name, String personnelId) {
        // should implement
    }

    public int updateBasic() {
        // should implement
        return 0;
    }
}
