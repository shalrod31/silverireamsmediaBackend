package com.service;

import java.io.UnsupportedEncodingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

public class loginService {

     public Boolean getAdminProfile(LoginRequest loginRequest) throws RestClientException, CookieExpiredException, PreConditionNotMetException, UnsupportedEncodingException {
        
        EmployeeDataTypeForAdmin adminData = employeeClientFactory.getInstance(siteminderInfo).getAdminInfo(adminId);
        AdminPermissions adminPermissions = adminSecurityService.getAdminPermissions(adminId, siteminderInfo);      
        
        return AdminProfileMap(adminData, adminPermissions);
    }   
    
}
