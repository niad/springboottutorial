package kr.pe.ned.thymeleaf.model;

import lombok.Data;

import java.util.Date;

@Data
public class Product {

    private Long id;
    private String name;
    private String note;
    private Integer price;
    private Date createdDate;

    public Product(String name, String note, Integer price) {
        this.name = name;
        this.note = note;
        this.price = price;
        this.createdDate = new Date();
    }

}
