package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class Robot {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;

  private Float price;

  private Float weight;

  @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
  private List<Part> parts = new ArrayList<>();

  public void addPart(final Part part) {
    this.parts.add(part);
//    part.addRobot(this);
  }
}
