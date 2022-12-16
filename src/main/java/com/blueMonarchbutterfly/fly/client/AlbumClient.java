package com.blueMonarchbutterfly.fly.client;

import com.blueMonarchbutterfly.fly.model.Album;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Component
@RequiredArgsConstructor
public class AlbumClient {

    @Value("${service.path.api-path}")
    private String url;

    public ArrayList<Album> getAlbums() throws Exception {
        RestTemplateBuilder r = new RestTemplateBuilder();
        RestTemplate rt = r.build();
        Album[] a = rt.getForObject(url, Album[].class);
        if (a == null) {
            throw new Exception("array List is empty Bad call ");
        }

        ArrayList<Album> filteredList = new ArrayList<>();
//        ArrayList<Album> albumList = new ArrayList(Arrays.asList(a));
        //for loop
//        for (int i = 0; i < albumList.size(); i++) {
//            if (albumList.get(i).getUserId().equals("2")) {
//                filteredList.add(albumList.get(i));
//            }
//        };
//        return filteredList;
        //forEach
//        for (Album album:albumList) {
//            if(album.getUserId().equals("2")) {
//                filteredList.add(album);
//            }
//        }

        //below we are setting the string Title in the Album to
        //all caps by using album.toBuilder instead of Album.Builder
        //we can only change the items we want and don't need to add all the
        //items in the Album it will pull all that are there and only alter the one mentioned
        //conversley you can use @Data if we want to be able to change it
        // the @Value does not have setters as it is immutible
        ArrayList<Album> albumList = new ArrayList(Arrays.asList(a));

             albumList.forEach(album -> {
                Album modifiedAlbum =  album.toBuilder().title(album.getTitle().toUpperCase()).build();
                 filteredList.add(modifiedAlbum);
             });
        return filteredList;
            };
    }







