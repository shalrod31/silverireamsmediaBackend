package com.silverdreamsmediaBackend.demo.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

public class loginController {
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<Boolean> loginController(@RequestParam(
    @RequestHeader HttpHeaders headers, @RequestBody LoginRequest loginRequest) {
        
        Boolean isLoginRequest=false;
        isLoginRequest = loginService(loginRequest);
        
        return new ResponseEntity<Boolean>(loginRequest, HttpStatus.OK);
    }
    
}
