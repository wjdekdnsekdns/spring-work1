package com.example.demo2.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class DeleteApiController {
	
	
	// METHOD : delete
	// http://localhost:8080/api2/delete/{userId}
	// http://localhost:8080/api2/delete/{userId}?account=우리은행
	// http://localhost:8080/api2/delete/100?account=우리은행
	@DeleteMapping("/delete/{userId}")
	public void delete(@PathVariable String userId,
			@RequestParam String account) {
		System.out.println("userId : " + userId);
		System.out.println("account : " + account);
	}
	
	// 문제 delete 주소 설게 및 응답 처리
	// path , quert 둘 다 사용해보기
	
	
	// http://localhost:8080/api2/delete2/10?account=가나다라
	@DeleteMapping("/delete2/{userId}")
	public void delete2(@PathVariable String userId,
			@RequestParam String account) {
		System.out.println("userId : " + userId);
		System.out.println("account : " + account);
	}
	
	
	
}
