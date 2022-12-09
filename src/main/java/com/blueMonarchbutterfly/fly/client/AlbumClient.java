package com.blueMonarchbutterfly.fly.client;

import com.blueMonarchbutterfly.fly.model.Album;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@Service
@Component
@RequiredArgsConstructor
public class AlbumClient {

    @Value("${service.path.api-path}")
    private String url ;


    public ArrayList<Album> getAlbums() throws Exception {
        RestTemplateBuilder r = new RestTemplateBuilder();
        RestTemplate rt = r.build();
        Album[] a = rt.getForObject(url, Album[].class);
        if(a == null) {
           throw new Exception("array List is empty Bad call ");

        }
        ArrayList<Album> albumList = new ArrayList(Arrays.asList(a));
        return albumList;
    }
    
}
