package com.hayeum.backserver.Application.te.controller;

import com.hayeum.backserver.common.object.SendMap;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/login")
@Slf4j
public class TestLoginController {
    @PostMapping("")
    public HashMap<String, Boolean> test(HttpServletRequest request)throws IOException {
        SendMap<String,Object> newSendMap = new SendMap<String,Object>(request);

        String id = (String)newSendMap.getBodyIn().get("id");
        String pw = (String)newSendMap.getBodyIn().get("pw");
        String token = (String)newSendMap.getBodyIn().get("token");

        log.info(id); log.info(pw); log.info(token);

        String testId = "user00", testPw = "user01";
        // 테스트 id,pw와 일치하면 true 반환
        return new HashMap<>(){{
                    put("loginResult", testId.equals(id) && testPw.equals(pw));
                }};

    }
}
