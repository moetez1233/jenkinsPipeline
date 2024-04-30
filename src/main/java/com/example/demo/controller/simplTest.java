package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class simplTest {

    @GetMapping
    public ResponseEntity<String> getMessage(){
        return new ResponseEntity<>("hello Axeane team this pock is for deploying application using jenkins pipline ", HttpStatus.OK);
    }
    @PostMapping("/github_webHook")
    public ResponseEntity<String> verifWebHooks(){
        return new ResponseEntity<>("push triggered ", HttpStatus.OK);
    }


    
}
