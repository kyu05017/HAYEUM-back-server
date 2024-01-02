package com.hayeum.backserver.Application.te.controller;

import com.hayeum.backserver.Application.service.AccountService;
import com.hayeum.backserver.common.object.SendMap;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/login")
    public HashMap<String, Object> doLogin(HttpServletRequest request)throws IOException {
        /* 통신 객체 생성*/
        SendMap<String,Object> newSendMap = new SendMap<String,Object>(request);

        //System.out.println("토큰 = " + request.getSession().getAttribute("token"));
        System.out.println("토큰 = "+newSendMap.getHeaderIn().getValue("token",""));
        accountService.findByToken();
        HashMap<String,Object> result = new HashMap<>();
        
        result.put("result","true");
        return result;

    }
    @PostMapping("/my-info")
    public HashMap<String,Object> myPage(HttpServletRequest request) throws  IOException{
        SendMap<String,Object> newSendMap = new SendMap<>(request);
        log.info("마이 페이지 입장");
        return new HashMap<>();
    }
}
