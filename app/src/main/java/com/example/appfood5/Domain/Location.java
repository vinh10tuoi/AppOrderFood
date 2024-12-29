package com.example.appfood5.Domain;

public class Location {
    private int Id;
    private String Loc;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getLoc() {
        return Loc;
    }

    public void setLoc(String loc) {
        this.Loc = loc;
    }

    @Override
    public String toString() {
        return Loc;
    }

    public Location() {
    }

    public Location(int Id, String Loc) {
        this.Id = Id;
        this.Loc = Loc;
    }
}
