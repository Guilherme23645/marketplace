package br.com.depaula.marketplace.registration.infrastructure;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/health")
    ResponseEntity<String> health() {
        return ResponseEntity.ok("Service is UP!");
    }

}
