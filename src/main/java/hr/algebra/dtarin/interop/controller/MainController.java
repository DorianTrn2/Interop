package hr.algebra.dtarin.interop.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MainController {

    @GetMapping("/getExample")
    public String getExample() {
        return "GET Request Received";
    }

    @PostMapping("/postExample")
    public String postExample() {
        return "POST Request Received";
    }

    @PutMapping("/putExample")
    public String putExample() {
        return "PUT Request Received";
    }

    @DeleteMapping("/deleteExample")
    public String deleteExample() {
        return "DELETE Request Received";
    }
}