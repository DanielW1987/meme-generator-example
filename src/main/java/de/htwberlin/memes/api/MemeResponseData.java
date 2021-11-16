package de.htwberlin.memes.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MemeResponseData {

    @JsonProperty("memes")
    private List<MemeTemplate> memes;

    public List<MemeTemplate> getMemes() {
        return memes;
    }

    public void setMemes(List<MemeTemplate> memes) {
        this.memes = memes;
    }
}
