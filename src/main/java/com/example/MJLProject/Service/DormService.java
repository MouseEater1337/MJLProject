package com.example.MJLProject.Service;

import com.example.MJLProject.Entity.Dorm;
import com.example.MJLProject.Repository.DormRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DormService {


 @Autowired //Dependency Injection
 DormRepository dormRepository;


 public Dorm addNewDorm(Dorm newDorm, String name, String type, int price, boolean isSoutheast){


   if (newDorm == null || name == null || name.isBlank() || type == null || type.isBlank() || price < 0){
     return null;
   }


   Dorm dorm = Dorm.builder()
   .name(newDorm.getName())
   .type(type)
   .price(price)
   .isSoutheast(isSoutheast)
   .build();


 return dormRepository.save(dorm);


}


public Dorm getDorm(String name){
 return dormRepository.findByName(name);
}


}
