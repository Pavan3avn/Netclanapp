package com.pavan.netclan;

public class personalmodel {

    private String name;
    private String location;
    private String role;
    private String distance;
    private String p1;
    private String p2;

    private String p3;
    private String description;

    public personalmodel(String name, String location, String role, String distance, String p1, String p2, String p3, String description) {
        this.name = name;
        this.location = location;
        this.role = role;
        this.distance = distance;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.description = description;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public String getP3() {
        return p3;
    }

    public void setP3(String p3) {
        this.p3 = p3;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
