package com.hayeum.backserver.Application.te.controller;

import java.util.HashMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/TestController")
@Slf4j
public class TestController {

	@PostMapping("/test")
	public HashMap<String, Object> test(@RequestBody HashMap<String, Object> resultMap){
		log.info("파라미터 ? [{}]",resultMap.toString());
		log.info("통신 성공");
		log.info("[{}]","커밋테스트");
		HashMap<String, Object> returnMap = new HashMap<>();
		returnMap.put("result", "00000");
		return returnMap;
	}
}
