package com.example.and103_thanghtph31577_assignment.models;

public class Address {
    String _id;
    String name;
    String address;

    public Address(String _id, String name, String address) {
        this._id = _id;
        this.name = name;
        this.address = address;
    }

    public Address() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
