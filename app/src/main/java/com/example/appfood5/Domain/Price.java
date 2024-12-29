package com.example.appfood5.Domain;

public class Price {
    private int Id;
    private String Value;

    @Override
    public String toString() {
        return Value;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        this.Value = value;
    }

    public Price() {
    }

    public Price(int Id, String Value) {
        this.Id = Id;
        this.Value = Value;
    }
}
