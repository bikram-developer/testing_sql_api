package com.sql.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sql.api.entity.TestEntity;

@EnableJpaRepositories
public interface TestRepo extends JpaRepository<TestEntity, Integer>{

}
