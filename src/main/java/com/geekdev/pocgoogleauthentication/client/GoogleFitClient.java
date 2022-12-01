package com.geekdev.pocgoogleauthentication.client;

import com.geekdev.pocgoogleauthentication.model.DataPoint;
import com.geekdev.pocgoogleauthentication.model.DataSource;
import feign.Headers;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Headers("Authorization: Bearer {token}")
@FeignClient(name = "GoogleFitClient", url = "https://www.googleapis.com/fitness/v1")
public interface GoogleFitClient {

    @GetMapping(value = "/users/me/dataSources")
    List<DataSource> getDataSources(@Param("token") String token);

    @GetMapping(value = "/users/me/dataSources/{dataSourceId}/dataPointChanges")
    List<DataPoint> getDataPoint(@Param("token") String token, @PathVariable("dataSourceId") String dataSourceId);

}
