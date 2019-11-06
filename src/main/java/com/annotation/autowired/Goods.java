package com.annotation.autowired;

/**
 * @author codiy
 */
public class Goods {

    public String name;

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
