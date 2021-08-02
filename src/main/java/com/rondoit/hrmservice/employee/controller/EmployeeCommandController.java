package com.rondoit.hrmservice.employee.controller;

import com.rondoit.contracts.json.hrmservice.employee.request.CreateEmployeeJsonObject;
import com.rondoit.contracts.json.hrmservice.employee.response.EmployeeIdJsonObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeCommandController {

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> create(@RequestBody final CreateEmployeeJsonObject createEmployeeJsonObject) {
        String employeeId = UUID.randomUUID().toString();
        //  should validate then send command

        return new ResponseEntity<Object>(new EmployeeIdJsonObject(employeeId), HttpStatus.OK);
    }

}
