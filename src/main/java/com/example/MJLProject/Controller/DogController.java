package com.example.MJLProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.MJLProject.Entity.Dorm;

@Controller
@RequestMapping("/DogApi")
public class DogController {
  
  @PostMapping("/add/")
  public Dorm addDog(@RequestBody Dorm dog, @RequestParam("breed") String breed, @PathVariable("age") int age){
    
  }
}
