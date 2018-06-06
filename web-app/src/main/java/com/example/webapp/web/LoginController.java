package com.example.webapp.web;

import com.example.common.util.AjaxResult;
import com.example.webapp.security.util.LoginUserContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/login")
    public Object index()throws Exception {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setStatus(AjaxResult.FAIL);
        ajaxResult.setDesc("请到/login接口输入您的账号，密码");
        return ajaxResult;
    }

    @GetMapping("/loginSuccess")
    public Object loginSuccess()throws Exception {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setStatus(AjaxResult.SUCCESS);
        ajaxResult.setDesc(LoginUserContext.getUsername()+"：登陆成功");
        return ajaxResult;
    }
}
