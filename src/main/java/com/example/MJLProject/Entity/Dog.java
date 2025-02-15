package com.example.MJLProject.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data //generate toString, getters, and setters
@AllArgsConstructor
@Table(name = "dog.table")
public class Dog {
  @Id
  @SequenceGenerator(name = "dog_seq", sequenceName = "dog_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dog_seq")
  @Column(name = "dog_id")
  private Integer id;

  @Column (name = "name", nullable = false)
  private String name;

  @Column(name = "breed")
  private String gbreed;

  @Column (name = "age")
  private int age;

}
