package com.example.MJLProject;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class Startup {
  @PostConstruct
  public void init() {
    // Logic to be executed at startup
    System.out.println("Application started");
  }

  
}