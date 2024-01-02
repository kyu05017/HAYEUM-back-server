package com.hayeum.backserver.Application.te.controller;

import java.util.HashMap;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;
import com.hayeum.backserver.common.object.SendMap;

@RestController
@RequestMapping("/TestController")
@Slf4j
public class TestController {

	@PostMapping("/test")
	public HashMap<String, Object> test(HttpServletRequest request)throws Exception {
		SendMap<String,Object> newSendMap = new SendMap<String,Object>(request);
		log.info("통신 성공");
		// 한줄 복사는 컨트롤 + D
		// 줄이동은 알트 + 쉬프트 + 화살표
		// 객체 자동생성은 V + 엔터
		return new HashMap<>();
	}

	@GetMapping(value = "/test2")
	public HashMap<String, Object> test2(HttpServletRequest request) throws Exception {
		SendMap<String,Object> newSendMap = new SendMap<String,Object>(request);
		log.info("통신 성공");

		log.info(newSendMap.toString());

		return new HashMap<>();
	}
 }
