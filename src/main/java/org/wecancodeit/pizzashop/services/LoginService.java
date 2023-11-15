package org.wecancodeit.pizzashop.services;

import org.springframework.stereotype.Service;
import org.wecancodeit.pizzashop.Dto.LoginDto;
import org.wecancodeit.pizzashop.Dto.StaffMemberDto;
import org.wecancodeit.pizzashop.repositories.StaffMemberRepository;

@Service
public class LoginService {
    private StaffMemberRepository staffMemberRepository = new StaffMemberRepository();

    public boolean loginUser(LoginDto dto) {

        for (StaffMemberDto model : staffMemberRepository.listStaff()) {
            if (model.getUserId().equalsIgnoreCase(dto.getUserId())) {
                return model.getPassword().equals(dto.getPassword());
            }
        }
        return false;
    }
}
