package com.geekdev.pocgoogleauthentication.model;

import lombok.Data;

import java.util.List;

@Data
public class DataPoint {
    private String startTimeNanos;
    private String endTimeNanos;
    private String dataTypeName;
    private String originDataSourceId;
    private List<Value> value;
    private String modifiedTimeMillis;
}
