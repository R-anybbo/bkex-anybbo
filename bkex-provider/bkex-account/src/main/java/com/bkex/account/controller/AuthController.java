package com.bkex.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

  @GetMapping({"/user"})
  public String getUser() {
    System.out.println("echo >>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    return "anybbo";
  }
}
