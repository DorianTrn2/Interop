package hr.algebra.dtarin.interop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MainController {
    private final JmsTemplate jmsTemplate;

    public MainController(JmsTemplate jmsTemplate){
        this.jmsTemplate = jmsTemplate;
    }

    @GetMapping("/get")
    public ResponseEntity<String> getMethod() {
        jmsTemplate.convertAndSend( "GET Request");
        return ResponseEntity.ok("GET Request OK");
    }

    @PostMapping("/post")
    public ResponseEntity<String> postMethod(@RequestBody String body) {
        jmsTemplate.convertAndSend( "POST Request");
        return ResponseEntity.ok("POST Request OK");
    }

    @PutMapping("/put")
    public ResponseEntity<String> putMethod(@RequestBody String body) {
        jmsTemplate.convertAndSend( "PUT Request");
        return ResponseEntity.ok("PUT Request OK");
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteMethod() {
        jmsTemplate.convertAndSend( "DELETE Request");
        return ResponseEntity.ok("DELETE Request OK");
    }
}