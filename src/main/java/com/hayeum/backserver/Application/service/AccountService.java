package com.hayeum.backserver.Application.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hayeum.backserver.common.object.UserInfoDto;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service @Slf4j
public class AccountService {

    @Value("${testUser.token}")
    private String token;
    @Value("${testUser.name}")
    private String name;
    @Value("${testUser.postCnt}")
    private int postCnt;


    @Autowired
    HttpSession session;
    private final static ObjectMapper objectMapper = new ObjectMapper();
    public boolean findByToken()
    {
        try{
            if(session.getAttribute("token").equals(token))
            {
                session.setAttribute("Info",objectMapper.writeValueAsString(new UserInfoDto(token,name,postCnt)));
                log.info("토큰 정상 생성");
                return true;
            }
        }catch(NullPointerException e) {
            log.info("token null ->{}",e );
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

}
