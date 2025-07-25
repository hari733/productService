package com.example.productservice.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

public abstract class BaseClass {
    private long id;
    private Date createdAt;
    private Date updatedAt;
}
