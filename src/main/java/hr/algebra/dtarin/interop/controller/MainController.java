package hr.algebra.dtarin.interop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MainController {

    @GetMapping("/get")
    public ResponseEntity<String> getMethod() {
        return ResponseEntity.ok("GET Request OK");
    }

    @PostMapping("/post")
    public ResponseEntity<String> postMethod(@RequestBody String body) {
        return ResponseEntity.ok("POST Request OK");
    }

    @PutMapping("/put")
    public ResponseEntity<String> putMethod(@RequestBody String body) {
        return ResponseEntity.ok("PUT Request OK");
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteMethod() {
        return ResponseEntity.ok("DELETE Request OK");
    }
}