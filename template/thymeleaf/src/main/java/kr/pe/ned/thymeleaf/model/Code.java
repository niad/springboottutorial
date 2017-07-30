package kr.pe.ned.thymeleaf.model;

import lombok.Data;

@Data
public class Code {

    private String code;
    private String name;

    public Code(String code, String name) {
        this.code = code;
        this.name = name;
    }

}
