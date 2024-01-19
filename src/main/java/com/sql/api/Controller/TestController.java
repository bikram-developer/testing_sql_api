package com.sql.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.sql.api.repo.TestRepo;

import com.sql.api.entity.TestEntity;
import com.sql.api.repo.TestRepo;

@RestController
@RequestMapping("api/v-1")
public class TestController {

	@Autowired private TestRepo repo;
	
	@GetMapping("hello")
	public String hello() {
		return "hello world";
	}
	
	@GetMapping("getall")
	public List<TestEntity> getName() {
		try {
			return repo.findAll();
		} catch (Exception e) {
			return null;
		}
	}
	@PostMapping("add")
	public TestEntity add(@RequestBody TestEntity entity) {
		try {
			return repo.save(entity);
		} catch (Exception e) {
			return null;
		}
	}
	@GetMapping("get/{id}")
	public TestEntity getById(@PathVariable int id) {
		try {
			return repo.findById(id).orElse(null);
		} catch (Exception e) {
			return null;
		}
	}
}
