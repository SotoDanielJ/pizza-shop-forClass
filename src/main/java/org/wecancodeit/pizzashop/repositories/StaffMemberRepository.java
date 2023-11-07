package org.wecancodeit.pizzashop.repositories;

import java.util.HashMap;
import java.util.Map;

import org.wecancodeit.pizzashop.dto.PizzaMenuDto;
import org.wecancodeit.pizzashop.dto.StaffMemberDto;
import org.wecancodeit.pizzashop.models.PizzaMenuModel;
import org.wecancodeit.pizzashop.models.StaffMemberModel;

public class StaffMemberRepository {
     private Map<Long,StaffMemberModel> table = new HashMap<>();

      public StaffMemberModel createStaff(StaffMemberDto dto){
        StaffMemberModel staffMemberModel = dto.convertToStaff();
        table.put(staffMemberModel.getId(), staffMemberModel);
        return staffMemberModel;
    }
}
