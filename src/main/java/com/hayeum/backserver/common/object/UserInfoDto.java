package com.hayeum.backserver.common.object;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Getter @Setter @AllArgsConstructor
public class UserInfoDto {

    private String name;

    private String email;

    private String pwd;


}
