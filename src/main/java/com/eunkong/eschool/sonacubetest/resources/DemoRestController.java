package com.eunkong.eschool.sonacubetest.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoRestController {

    @GetMapping(value = "/api/v1/capitalize")
    public ResponseEntity<String> capitlize(@RequestParam("test") String text) {
        String capital = text.toUpperCase();
        return ResponseEntity.ok(capital);
    }
}
