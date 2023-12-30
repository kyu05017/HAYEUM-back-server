package com.hayeum.backserver.Application.te.controller;

import java.util.Enumeration;
import java.util.HashMap;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/TestController")
@Slf4j
public class TestController {

	@PostMapping("/test")
	public HashMap<String, Object> test(@RequestBody HashMap<String, Object> request){

		HashMap<String, Object> returnMap = request;
		returnMap.put("result", "성공1");

		returnMap.forEach((key, value) ->{
			log.info("key [{}] value [{}]",key,value);
		});
		return returnMap;
	}
}
