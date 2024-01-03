package com.hayeum.backserver.common.object;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Getter @Setter @AllArgsConstructor
public class UserInfoDto {

    private String name;

    private String email;
    /* 중요 데이터 ex) 패스워드 */
    @JsonIgnore
    private String pwd;


}
