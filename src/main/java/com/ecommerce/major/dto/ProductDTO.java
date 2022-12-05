package com.ecommerce.major.dto;

import com.ecommerce.major.model.Category;
import lombok.Data;

import javax.persistence.*;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private int categoryId;
    private double price;
    private String description;
    private String imageName;
}
