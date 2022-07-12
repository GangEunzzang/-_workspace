package com.example.ajax.dto;

public class FruitDTO {
    private int price;
    private String name;
    private String introduce;

    public FruitDTO() {} /* absolutely necessary */

    public FruitDTO(int price, String name, String introduce) {
        this.price=price;
        this.name=name;
        this.introduce=introduce;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIntroduce() {
        return introduce;
    }
    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
