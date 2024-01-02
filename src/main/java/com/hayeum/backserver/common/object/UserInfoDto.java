package com.hayeum.backserver.common.object;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@AllArgsConstructor
public class UserInfoDto {

    private String name;

    private String email;
    @JsonIgnore
    private int postCnt;


}
