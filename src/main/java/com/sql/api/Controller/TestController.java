package com.sql.api.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.sql.api.repo.TestRepo;

@RestController
@RequestMapping("api/v-1")
public class TestController {

//	@Autowired private TestRepo repo;
	
	@GetMapping("hello")
	public String hello() {
		return "hello world";
	}
	
//	@GetMapping("getall")
//	public List<TestEntity> getName() {
//		try {
//			return repo.findAll();
//		} catch (Exception e) {
//			return null;
//		}
//	}
	@Value("${server.port}")
    private String serverPort;

    @GetMapping("/getPort")
    public String getPort() {
        return "Server is running on port: " + serverPort;
    }	
}
