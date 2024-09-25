package edu.example.distex.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class HomeController {
  @GetMapping("/")
  public String home() {
    log.info("home request......");
    log.warn("home warning");
    log.error("home error");
    return "Hello World";
  }


}
