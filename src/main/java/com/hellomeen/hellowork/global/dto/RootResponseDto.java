package com.hellomeen.hellowork.global.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Builder;
import lombok.Getter;

@JsonInclude(Include.NON_ABSENT)
@Builder
@Getter
public class RootResponseDto<T> {

    String code;
    String message;
    T data;

}
