package com.code.Dto;

import lombok.Data;

import java.util.UUID;
@Data
public class CarDTO {
    private String name;
    private int seat;
    private Long price;
    private String color;
    private UUID categoryId;
    private UUID brandId;
}
