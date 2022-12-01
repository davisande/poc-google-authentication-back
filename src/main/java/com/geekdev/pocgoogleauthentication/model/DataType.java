package com.geekdev.pocgoogleauthentication.model;

import lombok.Data;

import java.util.List;

@Data
public class DataType {
    private String name;
    private List<Field> field;
}
