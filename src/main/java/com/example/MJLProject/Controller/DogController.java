package com.example.MJLProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.MJLProject.Entity.Dog;

@Controller
@RequestMapping("/DogApi")
public class DogController {
  
  @PostMapping("/add/")
  public Dog addDog(@RequestBody Dog dog, @RequestParam("breed") String breed, @PathVariable("age") int age){
    
  }
}
