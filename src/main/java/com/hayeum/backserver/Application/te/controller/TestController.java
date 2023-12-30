package com.hayeum.backserver.Application.te.controller;

import java.io.IOException;
import java.util.HashMap;

import com.hayeum.backserver.common.object.SendMap;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/TestController")
@Slf4j
public class TestController {

	@PostMapping("/test")
	public HashMap<String, Object> test(HttpServletRequest request)throws IOException {
		SendMap<String,Object> newSendMap = new SendMap<String,Object>(request);
		log.info("통신 성공");
		return new HashMap<>();
	}
}
