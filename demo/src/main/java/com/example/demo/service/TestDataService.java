package com.example.demo.service;

import com.example.demo.data.TestDataRepository;
import com.example.demo.domain.TestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestDataService {

    @Autowired
    TestDataRepository testDataRepository;


    public TestData getTestDataById(Long id) {

        Optional<TestData> data = testDataRepository.findById(id);
        if (null == data.get()) {
            System.out.println("No data present!!");
        }
        return data.get();
    }

    public List<TestData> getAllTestData() {

        List<TestData> testDataSet = testDataRepository.findAll();
        if (testDataSet.size() <= 0) {
            System.out.println("No Test Data!!");
        }
        return testDataSet;

    }

    public void putTestData(Long id, String Name) {

        TestData testData = new TestData(id, Name);
        testDataRepository.save(testData);
        System.out.println("Data Saved!!");

    }


}
