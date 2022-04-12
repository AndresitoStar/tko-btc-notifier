package com.tko.btcnotifier.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/btcNotifier")
public class MainController {

    @GetMapping
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<String>("Hello World", new HttpHeaders(), HttpStatus.OK);
    }
}
