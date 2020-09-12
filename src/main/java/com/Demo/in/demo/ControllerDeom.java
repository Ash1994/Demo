package com.Demo.in.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControllerDeom
{

    @GetMapping("/")
    private ResponseEntity<?> siteUp() {
        log.info("Site Is Ready to Use:: {}");
        return ResponseEntity.ok("Success");
    }
}
