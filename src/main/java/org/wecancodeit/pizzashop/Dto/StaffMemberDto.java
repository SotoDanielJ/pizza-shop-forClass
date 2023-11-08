package org.wecancodeit.pizzashop.dto;

import org.wecancodeit.pizzashop.models.PizzaMenuModel;
import org.wecancodeit.pizzashop.models.StaffMemberModel;

public class StaffMemberDto extends LoginDto{
    private long id;
    private String name;
    private String role;
    private String shift;
    public StaffMemberDto() {
    }
    public StaffMemberDto(long id, String name, String role, String shift, String userid, String password) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.shift = shift;
        this.setUserId(userid);
        this.setPassword(password);
    }
     public StaffMemberDto(StaffMemberModel staff) {
         this.id = staff.getId();
        this.name = staff.getName();
        this.role = staff.getRole();
        this.shift = staff.getShift();
    }
  public StaffMemberModel convertToStaff() {
        StaffMemberModel staff = new StaffMemberModel(this.getName(),
        this.role,
        this.shift);
        staff.setId(this.getId());
        return staff;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getShift() {
        return shift;
    }
    public void setShift(String shift) {
        this.shift = shift;
    }

    
}
