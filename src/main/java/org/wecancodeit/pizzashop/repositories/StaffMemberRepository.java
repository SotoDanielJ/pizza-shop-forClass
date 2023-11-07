package org.wecancodeit.pizzashop.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.wecancodeit.pizzashop.dto.StaffMemberDto;
import org.wecancodeit.pizzashop.models.StaffMemberModel;

public class StaffMemberRepository {
     private Map<Long,StaffMemberModel> table = new HashMap<>();

      public StaffMemberModel createStaff(StaffMemberDto dto){
        StaffMemberModel staffMemberModel = dto.convertToStaff();
        table.put(staffMemberModel.getId(), staffMemberModel);
        return staffMemberModel;
    }
 public List<StaffMemberDto> listStaff(){
        ArrayList<StaffMemberDto> returnValue = new ArrayList<>();
        for(StaffMemberModel model: table.values()){
            returnValue.add(new StaffMemberDto(model));
        }
        return returnValue;
    }

}
