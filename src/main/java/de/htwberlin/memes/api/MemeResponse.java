package de.htwberlin.memes.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MemeResponse {

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("data")
    private MemeResponseData data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public MemeResponseData getData() {
        return data;
    }

    public void setData(MemeResponseData data) {
        this.data = data;
    }
}

