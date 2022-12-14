package com.example.demo.data;

import com.example.demo.domain.TestData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TestDataRepository extends JpaRepository<TestData, Long>
{

    Optional<TestData> findById(Long aLong);

    List<TestData> findAllById(Iterable<Long> longs);



}
