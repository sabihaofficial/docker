package com.example.demo.controller;

import com.example.demo.domain.TestData;
import com.example.demo.service.TestDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestDataController {
    @Autowired
    TestDataService testDataService;

    @GetMapping("/getTestData/{id}")
    public TestData getTestDataById(@PathVariable("id") Long id) {
        return testDataService.getTestDataById(id);
    }

    @GetMapping("/getTestData")
    public List<TestData> getTestData() {
        return testDataService.getAllTestData();
    }

    @PutMapping("/addData/{id}/{name}")
    public void addData(@PathVariable("id") Long id, @PathVariable("name") String name) {
        testDataService.putTestData(id, name);
    }
}
