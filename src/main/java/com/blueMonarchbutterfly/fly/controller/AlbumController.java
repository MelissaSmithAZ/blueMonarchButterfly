package com.blueMonarchbutterfly.fly.controller;

import com.blueMonarchbutterfly.fly.client.AlbumClient;
import com.blueMonarchbutterfly.fly.model.Album;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = AlbumController.PATH, produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class AlbumController {

    public static final String PATH = "// https://jsonplaceholder.typicode.com";

        AlbumClient albumClient;
    @GetMapping("/albums")
    public ArrayList<Album> getMyAlbumsPlainJSON() {
        return albumClient.getAlbums();
    }




}
