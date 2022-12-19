package com.example.lab04;

import org.json.JSONObject;


public class Airplane {
    private long id;
    private String model;
    private String company;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "User[id=" + id + ", model=" + model + ", company=" + company + ", toString()=" + super.toString() + "]";
    }

    public String toJson(){
        JSONObject json = new JSONObject();
        json.put("id", id);
        json.put("model", model);
        json.put("company", company);

        return json.toString();
    }
}
