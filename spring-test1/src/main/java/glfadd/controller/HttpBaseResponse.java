package glfadd.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class HttpBaseResponse {
    /**
     * 响应类
     */
    private Integer code;
    private String msg;
}
