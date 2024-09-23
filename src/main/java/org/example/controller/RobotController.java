package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.entity.Robot;
import org.example.service.RobotService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/robot")
public class RobotController {

  private final RobotService robotService;

  @PostMapping
  public Robot saveRobot(@RequestBody Robot robot) {
    return robotService.saveRobot(robot);
  }
}
