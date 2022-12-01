package com.geekdev.pocgoogleauthentication.model;

import lombok.Data;

@Data
public class DataSource {
    private String dataStreamId;
    private String dataStreamName;
    private String type;
    private DataType dataType;
    private Application application;
}
