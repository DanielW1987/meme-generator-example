package de.htwberlin.memes.web;

import de.htwberlin.memes.service.MemeService;
import de.htwberlin.memes.api.MemeTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemeRestController {

    private final MemeService memeService;

    public MemeRestController(MemeService memeService) {
        this.memeService = memeService;
    }

    @GetMapping(path = "/api/v1/memetemplates")
    public ResponseEntity<List<MemeTemplate>> fetchMemeTemplates() {
        List<MemeTemplate> memeTemplates = memeService.fetchTemplates();
        return ResponseEntity.ok(memeTemplates);
    }
}
