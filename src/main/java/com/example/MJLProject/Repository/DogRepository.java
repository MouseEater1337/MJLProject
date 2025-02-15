package com.example.MJLProject.Repository;


import com.example.MJLProject.Entity.Dorm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface DogRepository extends JpaRepository<Dorm, Integer> {


 //Search up Spring JPA Naming Conventions for more details
 Dorm findByName(String name);


 //Can write really complex queries with native MySQL like so - search up Spring custom queries for more
 //@Query(nativeQuery = true, value = "Complex MySQL Query Here")
 //Dog findByNameAndBreedIsLike(String name, String breed);




}
