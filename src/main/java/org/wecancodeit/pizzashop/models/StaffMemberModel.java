package org.wecancodeit.pizzashop.models;

public class StaffMemberModel {
    private static long idCounter = 1;
    private long id;
    private String name;
    private String role;
    private String shift;

    public StaffMemberModel() {
    }

    public StaffMemberModel(String name, String role, String shift) {
        this.name = name;
        this.role = role;
        this.shift = shift;
        this.id = idCounter++;
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

    public String getRole() {
        return role;
    }

    public String getShift() {
        return shift;
    }

}
