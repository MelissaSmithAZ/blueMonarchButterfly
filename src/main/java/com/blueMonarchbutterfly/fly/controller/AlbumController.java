package com.blueMonarchbutterfly.fly.controller;

import com.blueMonarchbutterfly.fly.client.AlbumClient;
import com.blueMonarchbutterfly.fly.model.Album;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/albums")
@RequiredArgsConstructor
public class AlbumController {

    public static final String PATH = "// https://jsonplaceholder.typicode.com/albums";

    private final AlbumClient albumClient;

    @GetMapping("/albums")
    public ArrayList<Album> getMyAlbumsPlainJSON() throws Exception {
        return albumClient.getAlbums();
    }

}
