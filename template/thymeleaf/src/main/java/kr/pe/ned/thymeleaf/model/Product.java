package kr.pe.ned.thymeleaf.model;

import lombok.Data;

@Data
public class Product {

    private Long id;
    private String name;
    private String note;

    public Product(String name, String note) {
        this.name = name;
        this.note = note;
    }

}
