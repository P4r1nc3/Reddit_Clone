package com.redditclone.controller;

import com.redditclone.dto.RegisterRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {

    @PostMapping("/signup")
    public void signup(@RequestBody RegisterRequest registerRequest) {}
}
