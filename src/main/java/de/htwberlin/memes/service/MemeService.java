package de.htwberlin.memes.service;

import de.htwberlin.memes.api.MemeResponse;
import de.htwberlin.memes.api.MemeTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Service
public class MemeService {

    private final RestTemplate restTemplate;

    public MemeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<MemeTemplate> fetchTemplates() {
        ResponseEntity<MemeResponse> response = restTemplate.getForEntity("https://api.imgflip.com/get_memes", MemeResponse.class);
        MemeResponse memeResponse = response.getBody();
        return memeResponse != null? memeResponse.getData().getMemes() : Collections.emptyList();
    }
}
