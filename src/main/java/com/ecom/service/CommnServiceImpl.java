package com.ecom.service;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class CommnServiceImpl implements CommonService{

    @Override
    public void removeSessionMessage() {
       
       HttpServletRequest request = ((ServletRequestAttributes)(RequestContextHolder.getRequestAttributes())).getRequest();
       HttpSession session = request.getSession();
       session.removeAttribute("succMsg");
       session.removeAttribute("errorMsg");
       
    }
    
}
