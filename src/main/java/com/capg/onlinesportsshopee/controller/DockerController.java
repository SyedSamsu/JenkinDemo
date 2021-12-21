package com.capg.onlinesportsshopee.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Author : THEEPAK PRAKASH P
 * Version : 1.0
 * Date : 07-04-2021
 * Description : This is  Customer Controller 
*/
@RestController
@RequestMapping("/api/oss")
@CrossOrigin(origins = "http://localhost:3000")
public class DockerController {
	
	@GetMapping("/msg")
    public String getMessage() {
        return "Hello from Docker!";
    }
}
