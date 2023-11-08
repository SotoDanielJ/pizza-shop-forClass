package org.wecancodeit.pizzashop.services;

import org.springframework.stereotype.Service;
import org.wecancodeit.pizzashop.dto.LoginDto;

@Service
public class LoginService {
 
    public boolean loginUser(LoginDto dto){
        if(dto.getUserId().equalsIgnoreCase("NewUser")){
            return dto.getPassword().equals("password");
        }
    return false;
    }
}
