package com.blueMonarchbutterfly.fly.client;

import com.blueMonarchbutterfly.fly.model.Album;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;

public class AlbumClient {

    private String url = "https://jsonplaceholder.typicode.com/albums";

    public ArrayList<Album> getAlbums(){
        RestTemplateBuilder r = new RestTemplateBuilder();
        RestTemplate rt = r.build();
        Album[] a = rt.getForObject(url, Album[].class);
        ArrayList<Album> albumList = new ArrayList(Arrays.asList(a));

        return albumList;
    }
}
