package com.example.webapp.security.util;

import com.example.common.util.UserContext;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

public class LoginUserContext extends UserContext {

    public static String getUsername() {
        Authentication auth     = SecurityContextHolder.getContext().getAuthentication();
        String         username = null;
        if (auth.getPrincipal() != "anonymousUser") {
            username = ((User) auth.getPrincipal()).getUsername();
        } else {
            username = "anonymousUser";
        }
        return username;
    }

}
