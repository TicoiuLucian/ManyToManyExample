package org.example.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class Part {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;

  private Float price;

  private Float weight;

  @ManyToMany(mappedBy = "parts", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
  @JsonBackReference
  private List<Robot> robots = new ArrayList<>();

  public void addRobot(Robot robot){
    this.robots.add(robot);
    robot.addPart(this);
  }
}
