package com.hayeum.backserver.Application.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hayeum.backserver.common.object.UserInfoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service @Slf4j
public class AccountService {



    private final static ObjectMapper objectMapper = new ObjectMapper();
    public HashMap<String,Object> findByToken(String getToken)
    {
        HashMap<String,Object> result = new HashMap<>();
        try{
            String token = "1111";
            if(getToken.equals(token))
            {
                log.info("토큰 정상 생성");
                result.put("info",objectMapper.writeValueAsString(new UserInfoDto("kim","aaa@naver.com","1234")));
            }else{
                result.put("error","tokenValueError");
            }
        } catch (JsonProcessingException e) {
            result.put("error","loginJsonError");
            throw new RuntimeException(e);
        }

        return result;
    }

}
