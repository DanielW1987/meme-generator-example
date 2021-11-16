package de.htwberlin.memes.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MemeTemplate {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("url")
    private String url;

//    @JsonProperty("width")
//    private int width;
//
//    @JsonProperty("height")
//    private int height;
//
//    @JsonProperty("box_count")
//    private int boxCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public int getBoxCount() {
//        return boxCount;
//    }
//
//    public void setBoxCount(int boxCount) {
//        this.boxCount = boxCount;
//    }
}
