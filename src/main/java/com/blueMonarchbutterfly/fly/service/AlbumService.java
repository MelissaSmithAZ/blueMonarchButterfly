//package com.blueMonarchbutterfly.fly.service;
//
//import com.blueMonarchbutterfly.fly.client.AlbumClient;
//import com.blueMonarchbutterfly.fly.model.Album;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//
//@Component
//@RequiredArgsConstructor
//public class AlbumService {
//
//    private final AlbumClient albumClient;
//
//    public ArrayList<Album> sortUserId(ArrayList<Album> clientListAlbum) throws Exception {
//        ArrayList<Album> userIdList = new ArrayList<>();
//        albumClient.getAlbums().stream().map(a -> {
//             if(a.getUserId().equals("2")){
//                 userIdList.add(a);
//            };
//            return userIdList;
//        });
//        return null;
//    }
//}
