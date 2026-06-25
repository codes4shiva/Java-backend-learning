package com.shivanshu;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;

@Embeddable
public class Laptop {
    private int aid;
    private String brandname;
    private int Ramsize;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public int getRamsize() {
        return Ramsize;
    }

    public void setRamsize(int ramsize) {
        Ramsize = ramsize;
    }
}
