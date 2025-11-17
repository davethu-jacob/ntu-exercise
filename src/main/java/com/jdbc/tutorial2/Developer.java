package com.jdbc.tutorial2;

public class Developer {
    private String name;
    private int developerId;

    public Developer(String name, int developerId) {
        this.name = name;
        this.developerId = developerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(int developerId) {
        this.developerId = developerId;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", developerId=" + developerId +
                '}';
    }
}
