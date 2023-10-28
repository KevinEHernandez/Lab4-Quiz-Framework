package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class HomeController {

  @GetMapping("/")
  public String home() {
    return "home";
  }

  @GetMapping("/quiz")
  public String notHome() {
    return "quiz";
  }

  @GetMapping("/score")
  public String testPage() {
    return "score";
  }

}