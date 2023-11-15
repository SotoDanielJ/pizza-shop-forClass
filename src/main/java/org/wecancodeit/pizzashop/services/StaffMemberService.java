package org.wecancodeit.pizzashop.services;

import java.util.List;

import org.springframework.stereotype.Service;

import org.wecancodeit.pizzashop.Dto.StaffMemberDto;
import org.wecancodeit.pizzashop.models.StaffMemberModel;
import org.wecancodeit.pizzashop.repositories.StaffMemberRepository;

@Service
public class StaffMemberService {
    private StaffMemberRepository staffMemberRepository;

    public StaffMemberService() {
        staffMemberRepository = new StaffMemberRepository();
    }

     public StaffMemberModel createMenu(StaffMemberDto dto) {
        return staffMemberRepository.createStaff(dto);
    }
     public List<StaffMemberDto> listStaff(){
        return staffMemberRepository.listStaff();
    }
}
