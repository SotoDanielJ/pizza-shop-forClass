package org.wecancodeit.pizzashop.services;

import org.springframework.stereotype.Service;
import org.wecancodeit.pizzashop.dto.LoginDto;
import org.wecancodeit.pizzashop.dto.StaffMemberDto;
import org.wecancodeit.pizzashop.models.StaffMemberModel;
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
