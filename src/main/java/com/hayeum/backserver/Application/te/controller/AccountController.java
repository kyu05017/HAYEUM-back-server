package com.hayeum.backserver.Application.te.controller;

import com.hayeum.backserver.Application.service.AccountService;
import com.hayeum.backserver.common.object.SendMap;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;

@RestController
@RequestMapping("/account-controller")
@Slf4j
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/login")
    public HashMap<String, Object> doLogin(HttpServletRequest request)throws IOException {
        /* 통신 객체 생성*/
        SendMap<String,Object> newSendMap = new SendMap<String,Object>(request);

        return accountService.findByToken(newSendMap.getHeaderIn().getValue("token",""));
    }
    @GetMapping("/my-info")
    public HashMap<String,Object> myPage(HttpServletRequest request) throws  IOException{
        SendMap<String,Object> newSendMap = new SendMap<>(request);
        log.info("마이 페이지 입장");
        return new HashMap<>();
    }
}
