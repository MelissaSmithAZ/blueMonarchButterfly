package com.blueMonarchbutterfly.fly.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(builderClassName = "AlbumBuilder", toBuilder = true)
@JsonDeserialize(builder = Album.AlbumBuilder.class)
public class Album {
     @JsonPOJOBuilder(withPrefix = "")
     public static class AlbumBuilder {}

     String userId;
     String id;
     String title;
}
