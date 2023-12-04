package com.example.grpcclient.domo.model;


import java.util.List;


public class PersonInfoModel {
    int id;
    String school;
    boolean isBoy  ;
    List<IdentityModel> personalInfos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public boolean isBoy() {
        return isBoy;
    }

    public void setBoy(boolean boy) {
        isBoy = boy;
    }

    public List<IdentityModel> getPersonalInfos() {
        return personalInfos;
    }

    public void setPersonalInfos(List<IdentityModel> personalInfos) {
        this.personalInfos = personalInfos;
    }
}