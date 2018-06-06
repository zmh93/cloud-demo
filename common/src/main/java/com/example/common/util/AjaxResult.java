package com.example.common.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AjaxResult {
    public final static String SUCCESS = "success";
    public final static String FAIL = "fail";

    private String status = SUCCESS;
    private String desc = "请求成功";
    private Object data = null;

    public AjaxResult(String status, String desc) {
        this.status = status;
        this.desc = desc;
    }
}
