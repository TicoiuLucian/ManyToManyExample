package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.entity.Robot;
import org.example.repository.RobotRepo;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RobotService {

  private final RobotRepo robotRepo;

  public Robot saveRobot(Robot robot){
    return robotRepo.save(robot);
  }
}
